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
 * Classe para mostrar o gráfico comparativo do gênero em cada turma
 *
 */
public class RelatorioGenero {

    private String escola;
    private String turma;

    private int m; // Somatório de meninos
    private int f; //Somatório de meninas

    private String[] genero = new String[3];

    RelatorioGenero(String e, String t) {
        this.escola = e;
        this.turma = t;

        this.m = 0;
        this.f = 0;

        this.genero[0] = "Feminino";
        this.genero[1] = "Feminino";
        this.genero[2] = "Feminino";
    }

    private StyleBuilder boldStyle = stl.style().bold();
    private StyleBuilder boldCenteredStyle = stl.style(boldStyle).setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);
    private StyleBuilder columnTitleStyle = stl.style(boldCenteredStyle)
            .setBorder(stl.pen1Point())
            .setBackgroundColor(Color.LIGHT_GRAY);

    private TextColumnBuilder<String> turmaColuna = col.column("Turma", "turma", type.stringType()).setStyle(boldCenteredStyle);

    private TextColumnBuilder<String> generoColuna = col.column("Gênero", "genero", type.stringType()).setStyle(boldCenteredStyle); //key grafico de pizza
    private TextColumnBuilder<Integer> quantidade = col.column("Alunos Errados", "qtd", type.integerType()); //Guardar o somatório de meninos e meninas para o gráfico de pizza
    private TextColumnBuilder<Integer> masculinoColuna = col.column("Masculino", "masculino", type.integerType()); //key grafico de barra
    private TextColumnBuilder<Integer> femininoColuna = col.column("Feminino", "feminino", type.integerType()); //key grafico de barra


    private TextColumnBuilder<String> alunoColuna = col.column("Aluno", "aluno", type.stringType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<String> registroColuna = col.column("Registro", "registro", type.stringType()).setStyle(boldCenteredStyle);
    private TextColumnBuilder<Integer> rowNumberColumn = col.reportRowNumberColumn("No.")
            .setFixedColumns(2)
            .setHorizontalTextAlignment(HorizontalTextAlignment.CENTER);

    //Gráfco de Barra
    private Bar3DChartBuilder graficoBarra = cht.bar3DChart()
            .setTitle("Comparativo entre menino e meninas nas turmas")
            .setCategory(turmaColuna) //Eixo X
            .addSerie(cht.serie(femininoColuna), cht.serie(masculinoColuna));

    //Gráfico de Pizza
    private Pie3DChartBuilder graficoPizza = cht.pie3DChart()
            .setTitle("Alunos na série errada")
            .setKey(generoColuna)
            .series(cht.serie(quantidade));

    public void buildBarra() {
        try {
            report()
                    .setColumnTitleStyle(columnTitleStyle)
                    .setSubtotalStyle(boldStyle)
                    .highlightDetailEvenRows()

                    .columns(// add columns
                            rowNumberColumn, alunoColuna, generoColuna, turmaColuna, registroColuna)



                    .title(cmp.text("Relatório sobre " + this.escola + " da turma " + this.turma))
                    .pageFooter(cmp.pageXofY())
                    .summary(graficoBarra)
                    .setDataSource(createBarraSource())
                    .show();

        } catch (DRException e) {
            e.printStackTrace();
        }
    }

    private JRDataSource createBarraSource() {
        DRDataSource dataSource = new DRDataSource("aluno", "genero", "turma", "registro", "feminino", "masculino");
        //Pensando na Quarta série

        for (String g : this.genero) {
            if (g.equals("Feminino")) {
                dataSource.add("Aluno 1", "Feminino", this.turma, "ABC", 1, 0);
            } else {
                dataSource.add("Aluno 1", "Masculino", this.turma, "ABC", 0, 1);

            }
        }

        return dataSource;
    }


    public void buildPizza() {
        try {
            report()
                    .setColumnTitleStyle(columnTitleStyle)
                    .setSubtotalStyle(boldStyle)
                    .highlightDetailEvenRows()

                    .columns(// add columns
                            generoColuna, quantidade)



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
        DRDataSource dataSource = new DRDataSource("genero", "qtd");

        for (String g : this.genero) {
            if (g.equals("Feminino")) {
                this.f = this.f + 1;
            } else {
                this.m = this.m + 1;

            }
        }

        dataSource.add("Meninas na Turma", this.f);
        dataSource.add("Meninos na Turma", this.m);
        return dataSource;
    }
}
