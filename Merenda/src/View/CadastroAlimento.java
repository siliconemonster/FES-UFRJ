/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Alimento;
import Model.Auxiliar;
import Model.Conexao;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author Matheus Feitosa
 */
public class CadastroAlimento extends javax.swing.JFrame {

    boolean showTela = true;
    boolean editmode = false;
    Alimento a1;
    /**
     * Creates new form CadastroAlimento
     * @return 
     */
    
/* Aqui estão as funções que auxiliaram os testes
*
*
*
*/

/*
    Essas funções apenas retornam o botão da tela, para que possa dar doClick nos testes.
*/    
    
public JButton BotaoCadastrar(){ 
    return btnCadastrar;
} 

public JButton BotaoPesquisar(){ 
    return btnPesquisar;
}
public JButton BotaoDeletar(){ 
    return btnDeletar;
}
 
/*
    Essa função preenche apenas o campo de nome
*/
public void preenchernometest(String nome){
txtNome.setText(nome);
}
    
/*
    Essa função preenche todos os campos da tela
*/

public void preenchertest(String nome,String marca,String fornecedor,String quantidade, int medida, boolean perecivel ){
txtFornecedor.setText(fornecedor);
txtMarca.setText(marca);
txtNome.setText(nome);
if(Auxiliar.isNumeric(quantidade)){
txtQtdAtende.setText(quantidade);
}else{
txtQtdAtende.setText("0");
}
cmbMedida.setSelectedIndex(medida);
chkPerecivel.setSelected(perecivel);
}

/*
    Essa função retorna os dados da tela, de acordo com o inteiro mandado.
*/

public String retornaValores(int qualvalor){
if(qualvalor== 0){
return txtNome.getText();
}
if(qualvalor== 1){
return txtMarca.getText();
}
if(qualvalor== 2){
return txtFornecedor.getText();
}
if(qualvalor== 3){
return txtQtdAtende.getText();
}
return "nada";
}

/*
*
*
* Aqui estão as funções que auxiliaram os testes
*/
    public void telasInvisiveis(){
        showTela = false;
    }
    
    public void reset(){
        txtFornecedor.setText("");
        txtMarca.setText("");
        txtNome.setText("");
        txtQtdAtende.setText("");
        cmbMedida.setSelectedIndex(-1);
        chkPerecivel.setSelected(false);
        btnDeletar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnCadastrar.setEnabled(true);
        btnPesquisar.setEnabled(true);
        editmode = false;
        a1 = null;
    }
    
    public CadastroAlimento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JTextField();
        txtFornecedor = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        chkPerecivel = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMedida = new javax.swing.JLabel();
        cmbMedida = new javax.swing.JComboBox<>();
        lblQtdAtende = new javax.swing.JLabel();
        txtQtdAtende = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mItemPrincipal = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFornecedorActionPerformed(evt);
            }
        });

        chkPerecivel.setText("Perecivel");
        chkPerecivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPerecivelActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblNome.setText("Nome do Produto");

        jLabel2.setText("Fornecedor");

        jLabel3.setText("Marca");

        lblMedida.setText("Unidade de Medida");

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quilograma (kg)", "Grama (gm)", "Metro (m)", "Dúzia", "Unidade" }));
        cmbMedida.setSelectedIndex(-1);

        lblQtdAtende.setText("Qtd. de alunos que atende");

        btnDeletar.setEnabled(false);
        btnDeletar.setLabel("Deletar");
        btnDeletar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jMenu1.setText("Arquivo");

        mItemPrincipal.setText("Menu Principal");
        mItemPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(mItemPrincipal);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        jMenu1.add(mItemSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txtFornecedor)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(lblNome)
                            .addComponent(jLabel3)
                            .addComponent(txtMarca))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkPerecivel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedida)
                            .addComponent(lblQtdAtende)
                            .addComponent(txtQtdAtende)
                            .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkPerecivel)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblMedida)
                                .addGap(29, 29, 29)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblQtdAtende)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQtdAtende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFornecedorActionPerformed

    private void chkPerecivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPerecivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPerecivelActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (editmode){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Modo de edição não permite cadastros", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Alimento a = new Alimento();
        a.setNome(txtNome.getText());
        a.setFornecedor(txtFornecedor.getText());
        a.setMarca(txtMarca.getText());
        a.setMedida(String.valueOf(cmbMedida.getSelectedItem()));
        a.setPerecivel(chkPerecivel.isSelected());
        // <= 0 não passa na validação
        if("".equals(txtQtdAtende.getText())){
            a.setQtd_atende(-1);
        }else{
            a.setQtd_atende(Auxiliar.isNumeric(txtQtdAtende.getText()) ? Integer.valueOf(txtQtdAtende.getText()) : -1);
        }
        String erros = a.validar();
        
        if (!erros.equals("")){
            //mensagem de erro
            if(showTela==true)
                JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            if (a.cadastrar()){
               if(showTela==true)
                    JOptionPane.showMessageDialog(this, "Cadastro efetuado com sucesso");
            } else {
                if(showTela==true)    
                    JOptionPane.showMessageDialog(this, "Erro no BD", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        if (Model.Auxiliar.confirmarSaida()) System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (!editmode){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Modo de edição desabilitado", "Erro", JOptionPane.ERROR_MESSAGE);              
        } else if (a1 == null){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Não há alimento carregado para deleção", "Erro", JOptionPane.ERROR_MESSAGE);             
        } else if (a1.deletar()){            
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Deleção efetuada com sucesso");
            reset();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = txtNome.getText();
        if (nome.length() == 0 || nome.length() >= 30){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Nome do alimento inválido", "Erro", JOptionPane.ERROR_MESSAGE);      
            return;
        }
        
        Alimento a = new Alimento();
        if (a.consultar_por_nome(nome)){
            editmode = true;
            txtFornecedor.setText(a.getFornecedor());
            txtMarca.setText(a.getMarca());
            txtNome.setText(a.getNome());
            int i;
            for (i = 0; i < cmbMedida.getItemCount(); i++){
                if (String.valueOf(cmbMedida.getItemAt(i)).equals(a.getMedida())){
                    cmbMedida.setSelectedIndex(i);
                    break;
                }
            }
            if (i == cmbMedida.getItemCount()){
                if(showTela==true)
                    JOptionPane.showMessageDialog(this, "Medida não se encontra nas opções", "Erro", JOptionPane.ERROR_MESSAGE);   
            }
            chkPerecivel.setSelected(a.isPerecivel());
            txtQtdAtende.setText(String.valueOf(a.getQtd_atende()));
            
            
            btnCadastrar.setEnabled(false);
            btnDeletar.setEnabled(true);
            btnEditar.setEnabled(true);
            btnPesquisar.setEnabled(false);
            a1 = a;
            
        } else {
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Nenhum ou mais de um alimento encontrado", "Erro", JOptionPane.ERROR_MESSAGE);               
        }
        
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (!editmode){
            if(showTela==true)
                JOptionPane.showMessageDialog(this, "Não está no modo de edição", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Alimento a = new Alimento();
        a.setNome(txtNome.getText());
        a.setFornecedor(txtFornecedor.getText());
        a.setMarca(txtMarca.getText());
        a.setMedida(String.valueOf(cmbMedida.getSelectedItem()));
        a.setPerecivel(chkPerecivel.isSelected());
        // <= 0 não passa na validação
        if("".equals(txtQtdAtende.getText())){
            a.setQtd_atende(-1);
        }else{
            a.setQtd_atende(Auxiliar.isNumeric(txtQtdAtende.getText()) ? Integer.valueOf(txtQtdAtende.getText()) : -1);
        }
        
        String erros = a.validar();
        
        if (!erros.equals("")){
            //mensagem de erro
            if(showTela==true)
                JOptionPane.showMessageDialog(this, erros, "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            // coloca todos os campos de a em a1, menos o id
            int id = a1.getId_alimento();
            a1 = a;
            a1.setId_alimento(id);
            if (a1.update()){
                if(showTela==true)
                    JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso");
            } else {
                if(showTela==true)
                    JOptionPane.showMessageDialog(this, "Erro no BD", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            reset();
        } 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void mItemPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPrincipalActionPerformed
        this.setVisible(false);
        Auxiliar.trocarTela(new PrincipalAdm());
    }//GEN-LAST:event_mItemPrincipalActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        reset();
    }//GEN-LAST:event_btnLimparActionPerformed
  


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAlimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroAlimento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JCheckBox chkPerecivel;
    private javax.swing.JComboBox<String> cmbMedida;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQtdAtende;
    private javax.swing.JMenuItem mItemPrincipal;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JTextField txtFornecedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtdAtende;
    // End of variables declaration//GEN-END:variables
}
