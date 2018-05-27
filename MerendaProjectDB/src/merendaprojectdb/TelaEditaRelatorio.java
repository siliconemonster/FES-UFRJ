package merendaprojectdb;

import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joycinha
 */
public class TelaEditaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaEditaRelatorio
     */
    CapaDados capa;
    Relatorio relatorio;
    DefaultTableModel tabelaMatricula;
    TelaCardapio editaCardapio;
    public TelaEditaRelatorio(Relatorio relatorio) {
        initComponents();
        this.relatorio = relatorio;
        this.capa = relatorio.getCapaRelatorio();
        this.tabelaMatricula = (DefaultTableModel) tabelaMatriculados.getModel();
        inicializaTabela();
    }
    
    /**Método para inicialização da tabela de alunos matriculados com os valores já contidos no Relatorio
     * @author Joyce Brum
     */
    private void inicializaTabela() {
        
        for(int i=0; i < this.tabelaMatricula.getRowCount(); i++) {
            for(int j=1; j < this.tabelaMatricula.getColumnCount(); j++) {
                System.out.println(capa.getValueAt(i, j-1));
                tabelaMatricula.setValueAt(capa.getValueAt(i,j-1), i, j);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMatriculados = new javax.swing.JTable();
        proximoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaMatriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PRÉ ESCOLAR", null, null, null, null, null, null, null, null},
                {"FUNDAMENTAL", null, null, null, null, null, null, null, null},
                {"JOVENS E ADULT", null, null, null, null, null, null, null, null},
                {"ENSINO ESP", null, null, null, null, null, null, null, null},
                {"Total", null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Modalidade", "1º turno", "2º turno", "3º turno", "4º turno", "Total Matriculados", "Total atendidosl", "Nº dias de distribuição de refeição", "Total de refeições servidas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMatriculados);

        proximoButton.setText("Proximo");
        proximoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(proximoButton)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(proximoButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**Método para atualizacao da tabela de alunos matriculados
     * @author Joyce Brum
     */
    private void atualizaCapaDados() {
        int [] turnos = new int[4];
        int atendidos;
        int numDias;
        for(int i = 0; i < this.tabelaMatricula.getRowCount(); i++) {
            for(int j = 1; j < 5; j++) {
                if(this.tabelaMatricula.getValueAt(i, j) != null) {
                    String valor = this.tabelaMatricula.getValueAt(i, j). toString(); 
                    turnos[j-1] = Integer.parseInt(valor);
                }
                else {
                    turnos[j-1] = 0;
                }
                
            }
            if(this.tabelaMatricula.getValueAt(i, 6) != null) {
                String valor = this.tabelaMatricula.getValueAt(i, 6).toString();
                atendidos = Integer.parseInt(valor);
            }
            else {
                atendidos = 0;
            }
            if(this.tabelaMatricula.getValueAt(i, 7) != null) {
                String valor = this.tabelaMatricula.getValueAt(i, 7).toString();
                numDias = Integer.parseInt(valor);
            }
            else {
                numDias = 0;
            }
            this.capa.setVetorMatriculados(i, turnos, atendidos, numDias);
        }
    }
    
    /**Método chamado em resposta ao botao next. Atualiza o campo CapaDados do Relatorio recebido
     * @author Joyce Brum
     */
    private void proximoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoButtonActionPerformed
        atualizaCapaDados();
        this.editaCardapio = new TelaCardapio(this.relatorio);
        this.editaCardapio.setLocationRelativeTo(null);
        this.editaCardapio.setVisible(true);
        this.editaCardapio.setResizable(true);
        dispose();
    }//GEN-LAST:event_proximoButtonActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton proximoButton;
    private javax.swing.JTable tabelaMatriculados;
    // End of variables declaration//GEN-END:variables
}
