import com.google.gson.Gson;
import model.RSSQLObject;
import model.RSSQLObject.RSSQLField;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RSSQL {

    RSSQLObject mRSO;

    String[] dyn_keys;
    String[][] dyn_values;
    String[] sta_keys;
    String[] sta_values;

    DBHelper dbHelper;

    // r = RSSQL("modelo1.rssql",{"idescola":10, ...
    // r.

    public RSSQL(String filename, HashMap<String,String> params) throws Exception{

        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        StringBuilder sb = new StringBuilder();
        while(scanner.hasNext()){
            sb.append(scanner.nextLine());
        }

        Gson gson = new Gson();
        mRSO = gson.fromJson(sb.toString(),RSSQLObject.class);

        sta_keys = mRSO.getStaticField().getKey().split(",");
        sta_values = new String[sta_keys.length];
        dyn_keys = mRSO.getDynamicField().getKey().split(",");

        String sta_query = mRSO.getStaticField().getValue();
        sta_query = replaceKeys(params,sta_query);

        String dyn_query = mRSO.getDynamicField().getValue();
        dyn_query = replaceKeys(params,dyn_query);

        dbHelper = new DBHelper();

        //TODO improve connection policy
        while(!dbHelper.connect());

    }

    private String replaceKeys(HashMap<String,String> map, String query){

        for(String key : map.keySet()){
            query = query.replace("${"+key+"}", map.get(key));
        }

        return query;

    }

    public boolean queryFields(String sta_query, String dyn_query){

        ArrayList<ArrayList<String>> res = dbHelper.query(sta_query);

        for(int i = 0; i<sta_keys.length; i++){
            sta_values[i] = res.get(0).get(i);
        }

        res = dbHelper.query(dyn_query);
        dyn_values = new String[res.size()][];
        for(int i = 0; i < res.size(); i++){
            ArrayList<String> line = res.get(i);
            for(int j=0; j < dyn_keys.length; j++){
                dyn_values[i][j] = line.get(j);
            }
        }

        return true;

    }

    public HashMap<String,String> getStaticResults(){

        HashMap<String,String> ret = new HashMap<>();
        for(int i = 0; i < sta_keys.length; i++){
            ret.put(sta_keys[i],sta_values[i]);
        }
        return ret;

    }

    public String[] getDynamicKeys(){

        return dyn_keys.clone();
    }


    public String[][] getDynamicResults(){

        return dyn_values;

    }



}
