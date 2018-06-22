package report;

import net.sf.dynamicreports.report.builder.chart.Bar3DChartBuilder;
import net.sf.dynamicreports.report.builder.chart.Pie3DChartBuilder;
import net.sf.dynamicreports.report.builder.column.TextColumnBuilder;
import net.sf.dynamicreports.report.builder.style.StyleBuilder;
import net.sf.dynamicreports.report.constant.HorizontalTextAlignment;
import net.sf.dynamicreports.report.datasource.DRDataSource;
import net.sf.dynamicreports.report.exception.DRException;
import net.sf.jasperreports.engine.JRDataSource;

import java.awt.*;

import static net.sf.dynamicreports.report.builder.DynamicReports.*;
import static net.sf.dynamicreports.report.builder.DynamicReports.cht;

/**
 * Classe para gerar relatório do gráfico comparativo das Idades dos alunos a sua sére
 *
 */
public class RelatorioIdade {

    private String escola;
    private String turma;

    private int[] intArray = new int[3];

    private int errado;
    private int certo;


    RelatorioIdade(String e,String t) {
        this.escola = e;
        this.turma = t;

        this.errado = 0;
        this.certo = 0;

        intArray[0] = 1;
        intArray[1] = 11;
        intArray[2] = 10;
    }

    private StyleBuilder boldStyle = stl.style().bold();
    private StyleBuilder boldCenteredStyle = stl.style(boldStyle).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
    private StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
            .setBorder(stl.pen1Point())
            .setBackgroundColor(Color.LIGHT_GRAY);

    private TextColumnBuilder<String> turmaColuna = col.column("Turma", "turma", type.stringType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<Integer> idadeColuna = col.column("Idade", "idade", type.integerType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<String> verificaColuna = col.column("Verifica", "verifica", type.stringType()).setStyle(boldStyle); //Coluna para diferenciar o certo e o errad

    private TextColumnBuilder<Integer> quantidadeCerta = col.column("Alunos Certos", "qtdCerta", type.integerType()); //Para o cálculo do gráfico de barra
    private TextColumnBuilder<Integer> quantidadeErrada = col.column("Alunos Errados", "qtdErrada", type.integerType()); //Para o cálculo do gráfico de barra
    private TextColumnBuilder<Integer> quantidadeTotal = col.column("Alunos Errados", "qtdTotal", type.integerType()); // Para guardar o somatório do gráfico de pizza


    private TextColumnBuilder<String> alunoColuna = col.column("Aluno", "aluno", type.stringType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<String> registroColuna = col.column("Registro", "registro", type.stringType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<Integer> rowNumberColumn = col.reportRowNumberColumn("No.")
            .setFixedColumns(2)
            .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);

    //Gráfico de barra
    private Bar3DChartBuilder graficoBarra = cht.bar3DChart()
            .setTitle("Alunos na série errada")
            .setCategory(turmaColuna) //Eixo X
            .addSerie(cht.serie(quantidadeCerta), cht.serie(quantidadeErrada));

    //Gráfico de Pizza
    private Pie3DChartBuilder graficoPizza = cht.pie3DChart()
            .setTitle("Alunos na série errada")
            .setKey(verificaColuna)
            .series(cht.serie(quantidadeTotal));

    public void buildBarra() {
        try {
            report()
                    .setColumnTitleStyle(columnTitleStyle)
                    .setSubtotalStyle(boldStyle)
                    .highlightDetailEvenRows()

                    .columns(// add columns
                            rowNumberColumn, alunoColuna, idadeColuna, turmaColuna, registroColuna)



                    .title(cmp.text("Relatório sobre " + escola + " da turma " + turma))
                    .pageFooter(cmp.pageXofY())
                    .summary(graficoBarra)
                    .setDataSource(createBarraSource())
                    .show();

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    private JRDataSource createBarraSource() {
        DRDataSource dataSource = new DRDataSource("aluno", "idade", "turma", "registro", "qtdCerta", "qtdErrada");
        //Pensando na Quarta série

        for (int anIntArray : intArray) {
            if (anIntArray > 7) {
                dataSource.add("Aluno 1", anIntArray, this.turma, "ABC", 0, 1);
            } else {
                dataSource.add("Aluno 1", anIntArray, this.turma, "ABC", 1, 0);

            }
        }

        return dataSource;
    }

    public void buildPizza() {
        System.out.println("OI");
        try {
            report()
                    .setColumnTitleStyle(columnTitleStyle)
                    .setSubtotalStyle(boldStyle)
                    .highlightDetailEvenRows()

                    .columns(// add columns
                            verificaColuna, quantidadeTotal)

                    .title(cmp.text("Relatório sobre "))
                    .pageFooter(cmp.pageXofY())
                    .summary(graficoPizza)
                    .setDataSource(createPizzaSource())
                    .show();

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    private JRDataSource createPizzaSource() {
        DRDataSource dataSource = new DRDataSource("verifica", "qtdTotal");


        for (int anIntArray : intArray) {
            if (anIntArray > 7) {
                this.errado = this.errado + 1;
            } else {
                this.certo = this.certo + 1;
            }
        }

        dataSource.add("Quantidade na série Certa", certo);
        dataSource.add("Quantidade na série errada", errado);
        return dataSource;
    }
}
