/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Auxiliar;
import Model.Sessao;

/**
 *
 * @author convidado
 */
public class PrincipalLeitor extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalLeitor
     */
    public PrincipalLeitor() {
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

        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        mItemLogout = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        mItemConsultaPessoa = new javax.swing.JMenuItem();
        mItemConsultaConta = new javax.swing.JMenuItem();
        mItemConsultaInstituicao = new javax.swing.JMenuItem();
        mItemConsultaAlimento = new javax.swing.JMenuItem();
        mItemConsultaPedido = new javax.swing.JMenuItem();
        mItemConsultaEntrega = new javax.swing.JMenuItem();
        mItemConsultaCardapio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuArquivo.setText("Arquivo");

        mItemLogout.setText("Logout");
        mItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemLogoutActionPerformed(evt);
            }
        });
        jMenuArquivo.add(mItemLogout);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(mItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuConsultar.setText("Consultar");

        mItemConsultaPessoa.setText("Pessoa");
        mItemConsultaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaPessoaActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaPessoa);

        mItemConsultaConta.setText("Conta");
        mItemConsultaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaContaActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaConta);

        mItemConsultaInstituicao.setText("Instituição");
        mItemConsultaInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaInstituicaoActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaInstituicao);

        mItemConsultaAlimento.setText("Alimento");
        mItemConsultaAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaAlimentoActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaAlimento);

        mItemConsultaPedido.setText("Pedido");
        mItemConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaPedidoActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaPedido);

        mItemConsultaEntrega.setText("Entrega");
        mItemConsultaEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaEntregaActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaEntrega);

        mItemConsultaCardapio.setText("Cardápio");
        mItemConsultaCardapio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemConsultaCardapioActionPerformed(evt);
            }
        });
        jMenuConsultar.add(mItemConsultaCardapio);

        jMenuBar.add(jMenuConsultar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemLogoutActionPerformed
        Sessao.destroy();
        this.setVisible(false);
        Auxiliar.trocarTela(new Login());
    }//GEN-LAST:event_mItemLogoutActionPerformed

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        if (Model.Auxiliar.confirmarSaida()) System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void mItemConsultaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaPessoaActionPerformed

    private void mItemConsultaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaContaActionPerformed

    private void mItemConsultaInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaInstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaInstituicaoActionPerformed

    private void mItemConsultaAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaAlimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaAlimentoActionPerformed

    private void mItemConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaPedidoActionPerformed

    private void mItemConsultaCardapioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaCardapioActionPerformed
        this.setVisible(false);
        Auxiliar.trocarTela(new ConsultarCardapio());
    }//GEN-LAST:event_mItemConsultaCardapioActionPerformed

    private void mItemConsultaEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemConsultaEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mItemConsultaEntregaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalLeitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalLeitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem mItemConsultaAlimento;
    private javax.swing.JMenuItem mItemConsultaCardapio;
    private javax.swing.JMenuItem mItemConsultaConta;
    private javax.swing.JMenuItem mItemConsultaEntrega;
    private javax.swing.JMenuItem mItemConsultaInstituicao;
    private javax.swing.JMenuItem mItemConsultaPedido;
    private javax.swing.JMenuItem mItemConsultaPessoa;
    private javax.swing.JMenuItem mItemLogout;
    private javax.swing.JMenuItem mItemSair;
    // End of variables declaration//GEN-END:variables
}
