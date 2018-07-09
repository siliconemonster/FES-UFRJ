package br.com.fes.relatorios.itext;

import java.io.FileOutputStream;
import java.sql.Date;
import java.sql.ResultSet;

import org.junit.experimental.categories.Category;

/*

This file is part of the iText (R) project.
Copyright (c) 1998-2016 iText Group NV

*/

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Table;
import com.itextpdf.test.annotations.type.SampleTest;
import com.itextpdf.text.Image;



@Category(SampleTest.class)
	public class SimpleTable  {
	public static final String DEST = "WebContent/results/chapter01/SimpleTable.pdf";
	public static final String DEST2 = "WebContent/results/chapter01/listagem.pdf";
	
/*	public static void main(String[] args) throws Exception {
	    File file = new File(DEST);
	    file.getParentFile().mkdirs();
	    //new SimpleTable().manipulatePdf(DEST);
	    new SimpleTable().listagemGeral(DEST2);
	
	}*/

	
	public void listagemGeral(ResultSet rs) throws Exception {
		
	    PdfDocument pdfDoc = new PdfDocument(new PdfWriter(DEST));
	    //PdfDocument pdfDoc = new PdfDocument(new PdfWriter(DEST2));
	    Document doc = new Document(pdfDoc);
	    
	    Table table = new Table(3);
	    
		// our SQL SELECT query. 
	    // if you only need a few columns, specify them by name instead of using "*"
	    //String query = "SELECT matricula,nome,situacao FROM alunos where escola = 'Brizolaum' ";
		
	      
	    //Cabe�ario da tabela
	    table.addCell("Cod i-Educar");
	    table.addCell("Nome do Aluno");
	    table.addCell("Situacaoo");
	    
	    
	    // iterate through the java resultset, preenchendo tabela com os dados do banco
	      while (rs.next())
	      {
	        int id = rs.getInt("matricula");
	        String matricula = "00" + id;
	        table.addCell(matricula);
	        String Name = rs.getString("Nome");
	        table.addCell(Name);
	        String situacao = rs.getString("situacao");
	        table.addCell(situacao);
	        
	        // print the results
	        System.out.format("%s, %s, %s\n", id, Name, situacao);
	      }
		   
	    doc.add(table);
	
	    doc.close();
	    System.out.println("yoga fire");
	}
	
	
	
	
	public void manipulatePdf(ResultSet rs) throws Exception {
		
	    PdfDocument pdfDoc = new PdfDocument(new PdfWriter(DEST));
	    //PdfDocument pdfDoc = new PdfDocument(new PdfWriter(DEST2));
	    Document doc = new Document(pdfDoc);
	    
	    Table table = new Table(5);
	   	      
	    //Cabe�ario da tabela
	    table.addCell("matricula");
	    table.addCell("Nome");
	    table.addCell("Nascimento");
	    table.addCell("Escola");
	    table.addCell("serie");
	    
	    
	    // iterate through the java resultset, preenchendo tabela com os dados do banco
	      while (rs.next())
	      {
	        int id = Integer.parseInt(rs.getString("matrícula"));
	        String matricula = "00" + id;
	        table.addCell(matricula);
	        String Name = rs.getString("nome");
	        table.addCell(Name);
	        Date dateCreated = rs.getDate("dataNascimento");
	        table.addCell(String.valueOf(dateCreated));
	        String escola = rs.getString("escola");
	        table.addCell(escola);
	        String serie = rs.getString("serie");
	        table.addCell(serie);
	        
	        // print the results
	        System.out.format("%s, %s, %s, %s, %s\n", id, Name,  dateCreated, escola, serie);
	      }
	    
	    doc.add(table);
	
	    doc.close();
	    System.out.println("yoga fire");
	}
	
	public void dbTable() {
		com.itextpdf.text.Document document = new com.itextpdf.text.Document();

	    try {
	    	com.itextpdf.text.pdf.PdfWriter.getInstance(document,
	                new FileOutputStream("WebContent/results/chapter01/DBT.pdf"));
	        document.open();

	        Image image1 = Image.getInstance("Brasao-caxias.png");
	        document.add(image1);

	        
	            String imageUrl = "http://jenkov.com/images/" +
	            "20081123-20081123-3E1W7902-small-portrait.jpg";


	        document.close();
	    } catch(Exception e){
	      e.printStackTrace();
	    }
	}
}
