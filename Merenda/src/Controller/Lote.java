/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Conexao;
import Model.ModeloLote;
import java.util.Date;
/**
 *
 * @author w1n3
 */
public class Lote {
    private int id_pedido, id_alimento, qtd_alimento;
    
    public boolean cadastrar(){
        
        String query = "INSERT INTO lote (id_pedido, id_alimento, qtd_alimento) VALUES";
        query += "(" + getId_pedido()+", " + getId_alimento()+ "," + getQtd_alimento()+ ")" ;
        
        return new Conexao().query_update(query);
    }
    
    /*
    private ModeloLote lote;
    
    public Lote() {
        this.lote = new ModeloLote();
    }
    
    public String preencher_e_validar(int id_alimento, String preco, String qtd_itens, Date data_validade) {
        String erros = "";
        lote.set_id(0);
        if(new Alimento().consultar_por_id(id_alimento)) {
            lote.set_id_alimento(id_alimento);
        }
        else {
            erros += "Alimento vazio\n";
        }
            
        try {
            lote.set_preco(Float.parseFloat(preco));
        } catch(NullPointerException ex) {
            erros += "Preço vazio\n";
        } catch(NumberFormatException ex) {
            erros += "Preço inválido\n";
        }
        
        try {
            lote.set_qtd_alimento(Integer.parseInt(qtd_itens));
        } catch(NumberFormatException ex) {
            erros += "Quantidade de itens inválida\n";
        }
        if (data_validade == null) {
            erros += "Data vazia\n";
        } else if (new Date().compareTo(data_validade) >= 0) {
            erros += "Validade Vencida\n";
        }
        else {
            lote.set_data_validade(data_validade);
        }
        return erros;
    }
    
    public boolean pesquisar_do_cadastro_lote(String nome_alimento, String qtd_alimento, String data_de_validade, String preco) {
        int qa;
        float pr;
        try {
            qa = Integer.parseInt(qtd_alimento);
        } catch(NumberFormatException ex) {
            qa = 0;
        }
        try {
            pr = Float.parseFloat(preco);
        } catch(Exception ex) {
            pr = 0;
        }
        
        return lote.consultar_do_cadastro_lote(nome_alimento, qa, data_de_validade, pr);
    }
    
    public boolean cadastrar() {
        return lote.criar();
    }
    
    public boolean editar() {
        return lote.atualizar();
    }
    public boolean deletar() {
        return lote.excluir();
    }
    
    public ModeloLote get_ModeloLote() {
        return this.lote;
    }*/

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_alimento() {
        return id_alimento;
    }

    public void setId_alimento(int id_alimento) {
        this.id_alimento = id_alimento;
    }

    public int getQtd_alimento() {
        return qtd_alimento;
    }

    public void setQtd_alimento(int qtd_alimento) {
        this.qtd_alimento = qtd_alimento;
    }
}
