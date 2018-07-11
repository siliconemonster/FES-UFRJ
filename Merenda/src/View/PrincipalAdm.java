/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Auxiliar;
import Model.Sessao;
import java.awt.BorderLayout;
import View.CadastroPessoa;

/**
 *
 * @author Andre
 */
public class PrincipalAdm extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalAdm() {
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

        menuBar = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        mItemLogout = new javax.swing.JMenuItem();
        mItemSair = new javax.swing.JMenuItem();
        menuCadastrar = new javax.swing.JMenu();
        mItemPessoa = new javax.swing.JMenuItem();
        mItemConta = new javax.swing.JMenuItem();
        mItemInstituicao = new javax.swing.JMenuItem();
        mItemAlimento = new javax.swing.JMenuItem();
        mItemPedido = new javax.swing.JMenuItem();
        mItemEntrada = new javax.swing.JMenuItem();
        jMenuConsultar = new javax.swing.JMenu();
        mItemConsultaPessoa = new javax.swing.JMenuItem();
        mItemConsultaConta = new javax.swing.JMenuItem();
        mItemConsultaInstituicao = new javax.swing.JMenuItem();
        mItemConsultaAlimento = new javax.swing.JMenuItem();
        mItemConsultaPedido = new javax.swing.JMenuItem();
        mItemConsultaEntrega = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setText("Arquivo");

        mItemLogout.setText("Logout");
        mItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemLogoutActionPerformed(evt);
            }
        });
        menuArquivo.add(mItemLogout);

        mItemSair.setText("Sair");
        mItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(mItemSair);

        menuBar.add(menuArquivo);

        menuCadastrar.setText("Cadastrar");

        mItemPessoa.setText("Pessoa");
        mItemPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPessoaActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemPessoa);

        mItemConta.setText("Conta");
        mItemConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemContaActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemConta);

        mItemInstituicao.setText("Instituição");
        mItemInstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemInstituicaoActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemInstituicao);

        mItemAlimento.setText("Alimento");
        mItemAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemAlimentoActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemAlimento);

        mItemPedido.setText("Pedido");
        mItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemPedidoActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemPedido);

        mItemEntrada.setText("Entrada");
        mItemEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemEntradaActionPerformed(evt);
            }
        });
        menuCadastrar.add(mItemEntrada);

        menuBar.add(menuCadastrar);

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

        menuBar.add(jMenuConsultar);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 658, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemSairActionPerformed
        if (Model.Auxiliar.confirmarSaida()) System.exit(0);
    }//GEN-LAST:event_mItemSairActionPerformed

    private void mItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemLogoutActionPerformed
        Sessao.destroy();
        this.setVisible(false);        
        Auxiliar.trocarTela(new Login());       
    }//GEN-LAST:event_mItemLogoutActionPerformed

    private void mItemPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPessoaActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroPessoa());    
    }//GEN-LAST:event_mItemPessoaActionPerformed

    private void mItemInstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemInstituicaoActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroInstituicao());    
    }//GEN-LAST:event_mItemInstituicaoActionPerformed

    private void mItemAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemAlimentoActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroAlimento());    
    }//GEN-LAST:event_mItemAlimentoActionPerformed

    private void mItemContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemContaActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroConta());    
    }//GEN-LAST:event_mItemContaActionPerformed

    private void mItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemPedidoActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroPedido());
    }//GEN-LAST:event_mItemPedidoActionPerformed

    private void mItemEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemEntradaActionPerformed
        this.setVisible(false);        
        Auxiliar.trocarTela(new CadastroEntrada());
    }//GEN-LAST:event_mItemEntradaActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuConsultar;
    private javax.swing.JMenuItem mItemAlimento;
    private javax.swing.JMenuItem mItemConsultaAlimento;
    private javax.swing.JMenuItem mItemConsultaConta;
    private javax.swing.JMenuItem mItemConsultaEntrega;
    private javax.swing.JMenuItem mItemConsultaInstituicao;
    private javax.swing.JMenuItem mItemConsultaPedido;
    private javax.swing.JMenuItem mItemConsultaPessoa;
    private javax.swing.JMenuItem mItemConta;
    private javax.swing.JMenuItem mItemEntrada;
    private javax.swing.JMenuItem mItemInstituicao;
    private javax.swing.JMenuItem mItemLogout;
    private javax.swing.JMenuItem mItemPedido;
    private javax.swing.JMenuItem mItemPessoa;
    private javax.swing.JMenuItem mItemSair;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastrar;
    // End of variables declaration//GEN-END:variables
}
