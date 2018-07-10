/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merendaprojectdb;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalDiretor
     */
    public static Usuario usuarioLogado;
    public static Escola escolaAtual=null;
    private String usuario;
    
    private TelaLogin login;
    private TelaCapaRelatorio capa;
    private TelaMesAno mesAno;
    private TelaOpcoesUsuario cadastro;
    private TelaEscola escola;
    private TelaListaRelatorios listaRelatorios;
    private TelaGerarArquivos geradorArquivos;
    private TelaPermissao permission;
    private String[] operacoes = new String[7];
    private BdManager banco;
    private TelaTrocarDeEscola trocaDeEscola;
    private TelaEditarPadroes editarPadroes;
    
    private TiposDeUsuario tipos = new TiposDeUsuario();
    
    public TelaPrincipal() {
        initComponents();
        TelaEditarPadroes.porcent=banco.getPorcentagem();
        if(this.usuarioLogado == null) {
            System.out.println("Usuario deve ser setado antes da inicialização da classe Principal");
        }
        else {
            campoNome.setText("ola " + usuarioLogado.getNome());
            setButtons();
        }
        if(escolaAtual==null)
        {
            setNomeEscola();
        }
        nomeEscolaAtual.setText(escolaAtual.getUnidade());
    }
    
    /**
     * Esse método e chamado para definir as funcionalidades de cada botão.
     */
    private void setButtons() {
        javax.swing.JButton[] buttons = new javax.swing.JButton[7];
        buttons[0] = this.jButton1;
        buttons[1] = this.jButton2;
        buttons[2] = this.jButton3;
        buttons[3] = this.jButton4;
        buttons[4] = this.jButton5;
        buttons[5] = this.jButton6;
        buttons[6] = this.jButton7;
        int i = 0;
        Permissoes permissoes;
        if(usuarioLogado.getTipo().equals("Diretor")) {
            permissoes = this.tipos.getDirPermits();
        } else if(usuarioLogado.getTipo().equals("Administrador")) {
            permissoes = this.tipos.getAdmPermits();
        } else {
            permissoes = this.tipos.getLeitorPermits();
        }
        if(permissoes.canWritePermit == true){
            this.operacoes[i] = "editarPermissoes";
            buttons[i].setText("Editar Permissoes");
            i++;
        }
        
        if(permissoes.canWriteReport == true){
            this.operacoes[i]= "editarRelatorio";
            buttons[i].setText("Editar Relatorio");
            i++;
            this.operacoes[i] = "editarRelatorioCorrente";
            buttons[i].setText("Editar Corrente");
            i++;
        }
    
        if(permissoes.canNewReport==true){
            this.operacoes[i] = "novoRelatorio";
            buttons[i].setText("Criar Relatorio");
            i++;
        }
        
        if(permissoes.canSeeReport ==true){
            this.operacoes[i] = "verRelatorio";
            buttons[i].setText("Ver Relatorio");
            i++;
        }
        
        /*if(usuarioLogado.getTipo()=="Adminstrador"){
            this.operacoes[i] = "cadastrarUsuario";
            buttons[i].setText("Cadastrar Usuario");
            i++;
        }*/
        
        if(permissoes.canWriteSchool ==true){
            this.operacoes[i] = "cadastrarEscola";
            buttons[i].setText("Cadastrar Escola");
            i++;
        }
        if(permissoes.canAddUser==true){
            this.operacoes[i]="gerenciarUsuario";
            buttons[i].setText("Gerenciar Usuario");
            i++;
        }
        for(; i < 7; i++) {
            this.operacoes[i] = "";
            buttons[i].setVisible(false);
            buttons[i].setEnabled(false);
        }
    }
    private void setNomeEscola(){
        ArrayList<Escola> escolas = banco.pegarEscolas();
        escolaAtual=escolas.get(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        sair = new javax.swing.JLabel();
        campoNome = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeEscolaAtual = new javax.swing.JLabel();
        botãoAlterarEscola = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(150, 240, 200));

        jButton1.setText("Criar Relatorio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cadastrar Usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Gerenciar Escolas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Editar Relatório");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Gerar Relatórios");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Atualizar Permissões");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        sair.setText("sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        campoNome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoNome.setText("ola Diretor");

        jButton7.setText("Corrente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Você está na Escola");

        nomeEscolaAtual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nomeEscolaAtual.setText("jLabel2");

        botãoAlterarEscola.setText("Alterar Escola");
        botãoAlterarEscola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botãoAlterarEscolaActionPerformed(evt);
            }
        });

        jButton8.setText("padrões");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton4)
                                    .addComponent(jButton7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nomeEscolaAtual)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botãoAlterarEscola))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(42, 42, 42)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)))))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sair)
                .addGap(4, 4, 4)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeEscolaAtual)
                    .addComponent(botãoAlterarEscola))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton3, jButton4, jButton5, jButton6});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        login=new TelaLogin();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
        login.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_sairMouseClicked
    private void buttonActionPerformedSwitch(int button) {
        System.out.println( button + this.operacoes[button]);
        switch(this.operacoes[button]){
            case "editarPermissoes":
                permission=new TelaPermissao();
                permission.setLocationRelativeTo(null);
                permission.setVisible(true);
                permission.setResizable(true);
                this.dispose();
                break;
            case "editarRelatorio":
                this.listaRelatorios = new TelaListaRelatorios();
                this.listaRelatorios.setLocationRelativeTo(null);
                this.listaRelatorios.setVisible(true);
                this.listaRelatorios.setResizable(true);
                dispose();
                break;
            case "editarRelatorioCorrente":
                if(TelaPrincipal.usuarioLogado.idRelatorio != null ) {
                    Relatorio relatorio = BdManager.findRelatorio(TelaPrincipal.usuarioLogado.idRelatorio.inep, 
                            TelaPrincipal.usuarioLogado.idRelatorio.mes, TelaPrincipal.usuarioLogado.idRelatorio.ano);
                    if(relatorio != null) {
                        TelaCapaRelatorio edita = new TelaCapaRelatorio(relatorio);
                        edita.setLocationRelativeTo(null);
                        edita.setVisible(true);
                        edita.setResizable(true);
                        this.dispose();
                        break; 
                    }
                    else {
                     JOptionPane.showMessageDialog(null,"Não foi possível pegar o relatório do banco de dados");
                     break;
                    }
                    
                }
                else {
                     JOptionPane.showMessageDialog(null,"Não existe nenhum relatorio para editar no momento");
                     break;
                }
                
            case "novoRelatorio":
                mesAno = new TelaMesAno();
                mesAno.setLocationRelativeTo(null);
                mesAno.setVisible(true);
                mesAno.setResizable(true);
                this.setVisible(false);
                break;
            case "verRelatorio":
                this.listaRelatorios = new TelaListaRelatorios();
                this.listaRelatorios.setLocationRelativeTo(null);
                this.listaRelatorios.setVisible(true);
                this.listaRelatorios.setResizable(true);
                dispose();
                break;
            case "gerenciarUsuario":
                cadastro=new TelaOpcoesUsuario();
                cadastro.setLocationRelativeTo(null);
                cadastro.setVisible(true);
                cadastro.setResizable(true);
                this.setVisible(false);
                break;
            case "cadastrarEscola":
                escola=new TelaEscola(usuario);
                escola.setLocationRelativeTo(null);
                escola.setVisible(true);
                escola.setResizable(true);
                this.setVisible(false);
                break;
            default:
                break;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.operacoes[0]=="") {
            return;
        }
        buttonActionPerformedSwitch(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(this.operacoes[1]=="") {
            return;
        }
        buttonActionPerformedSwitch(1);
        /*cadastro=new TelaCadastro(usuario);
        cadastro.setLocationRelativeTo(null);
        cadastro.setVisible(true);
        cadastro.setResizable(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(this.operacoes[2]=="") {
            return;
        }
        buttonActionPerformedSwitch(2);
        /*escola=new TelaEscola(usuario);
        escola.setLocationRelativeTo(null);
        escola.setVisible(true);
        escola.setResizable(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jButton3ActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(this.operacoes[3]=="") {
            return;
        }
        buttonActionPerformedSwitch(3);
        /*this.listaRelatorios = new TelaListaRelatorios();
        this.listaRelatorios.setLocationRelativeTo(null);
        this.listaRelatorios.setVisible(true);
        this.listaRelatorios.setResizable(true);
        dispose();*/
        //this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(this.operacoes[4]=="") {
            return;
        }
        buttonActionPerformedSwitch(4);
        /*geradorArquivos=new TelaGerarArquivos();
        geradorArquivos.setLocationRelativeTo(null);
        geradorArquivos.setVisible(true);
        geradorArquivos.setResizable(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jButton5ActionPerformed
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(this.operacoes[5]=="") {
            return;
        }
        buttonActionPerformedSwitch(5);
        /*permission=new TelaPermissao();
        permission.setLocationRelativeTo(null);
        permission.setVisible(true);
        permission.setResizable(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_jButton6ActionPerformed
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(this.operacoes[6]=="") {
            return;
        }
        buttonActionPerformedSwitch(6);
        /*TelaEditaRelatorio edita = new TelaEditaRelatorio(Principal.relatorioCorrente);
        edita.setLocationRelativeTo(null);
        edita.setVisible(true);
        edita.setResizable(true);
        this.dispose();*/
    }//GEN-LAST:event_jButton7ActionPerformed

    private void botãoAlterarEscolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botãoAlterarEscolaActionPerformed
        ArrayList<Escola> escolas = banco.pegarEscolas();
        trocaDeEscola=new TelaTrocarDeEscola(escolas);
        trocaDeEscola.setLocationRelativeTo(null);
        trocaDeEscola.setVisible(true);
        trocaDeEscola.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_botãoAlterarEscolaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        editarPadroes=new TelaEditarPadroes();
        editarPadroes.setLocationRelativeTo(null);
        editarPadroes.setVisible(true);
        editarPadroes.setResizable(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botãoAlterarEscola;
    private javax.swing.JLabel campoNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeEscolaAtual;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables
}
