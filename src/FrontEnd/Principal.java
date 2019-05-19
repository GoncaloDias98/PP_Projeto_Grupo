
package FrontEnd;
import BackEnd.*;
import FrontEnd.*;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.Date;

public class Principal extends javax.swing.JFrame {
    private Sistema sistema;

    public Principal(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.lblUtilizador.setText(sistema.getUtilizadorLigado().getNome());
    
        this.lblDataSistema.setText(LocalDate.now().toString());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnGravar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        lblGesProjeto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        lblUtilizador = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        lblDataSistema = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistar = new javax.swing.JMenu();
        criarProjeto = new javax.swing.JMenuItem();
        criarTarefa = new javax.swing.JMenuItem();
        menuListagens = new javax.swing.JMenu();
        listarProjetos = new javax.swing.JMenuItem();
        listarTarefas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuGestão = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        jmiAlterarPerfil = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de Projetos Concluídos:  ");

        jLabel4.setText("Percentagem de Projetos Concluídos:  ");

        jLabel5.setText("Numero de Projetos em curso:  ");

        jLabel6.setText("Numero de Projetos atrasados:  ");

        jLabel7.setText("Percentagem de Projetos em curso:  ");

        jLabel8.setText("Percentagem de Projetos atrasados:  ");

        jLabel9.setText("Top 3 Projetos mais atrasados");

        jLabel10.setText("Projeto mais problemático");

        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        lblGesProjeto.setText("Gestão de Projetos");
        jToolBar1.add(lblGesProjeto);
        jToolBar1.add(jSeparator1);

        lblUtilizador.setText("Utilizador");
        jToolBar1.add(lblUtilizador);
        lblUtilizador.getAccessibleContext().setAccessibleName("");

        jToolBar1.add(jSeparator3);

        lblDataSistema.setText("Data");
        jToolBar1.add(lblDataSistema);
        lblDataSistema.getAccessibleContext().setAccessibleName("");

        menuRegistar.setText("Registar");

        criarProjeto.setText("Novo Projeto");
        criarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarProjetoActionPerformed(evt);
            }
        });
        menuRegistar.add(criarProjeto);

        criarTarefa.setText("Novo Tarefa");
        criarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarTarefaActionPerformed(evt);
            }
        });
        menuRegistar.add(criarTarefa);

        jMenuBar1.add(menuRegistar);

        menuListagens.setText("Listagens");

        listarProjetos.setText("Listar Projetos");
        listarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProjetosActionPerformed(evt);
            }
        });
        menuListagens.add(listarProjetos);

        listarTarefas.setText("Listar Tarefas");
        listarTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTarefasActionPerformed(evt);
            }
        });
        menuListagens.add(listarTarefas);

        jMenuItem1.setText("Listar Utilizadores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuListagens.add(jMenuItem1);

        jMenuBar1.add(menuListagens);

        menuGestão.setText("Dashboard");
        jMenuBar1.add(menuGestão);

        menuAdmin.setText("Administrador");

        jmiAlterarPerfil.setText("Alterar Perfil");
        jmiAlterarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarPerfilActionPerformed(evt);
            }
        });
        menuAdmin.add(jmiAlterarPerfil);

        jMenuItem2.setText("Alterar Projeto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuAdmin.add(jMenuItem2);

        jMenuItem3.setText("Alterar Tarefa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuAdmin.add(jMenuItem3);

        jMenuBar1.add(menuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(70, 70, 70)
                .addComponent(btnGravar)
                .addGap(31, 31, 31)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        sistema.guardarObjectos();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void jmiAlterarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarPerfilActionPerformed
        AlterarPerfil alterarperfil = new AlterarPerfil(sistema);
        alterarperfil.setVisible(true);
    }//GEN-LAST:event_jmiAlterarPerfilActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ListaUtilizadores listautilizadores = new ListaUtilizadores(sistema);
        listautilizadores.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void listarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTarefasActionPerformed
        ListaTarefas listatarefas = new ListaTarefas(sistema);
        listatarefas.setVisible(true);
    }//GEN-LAST:event_listarTarefasActionPerformed

    private void listarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProjetosActionPerformed
        ListaProjetos listaprojetos = new ListaProjetos(sistema);
        listaprojetos.setVisible(true);
    }//GEN-LAST:event_listarProjetosActionPerformed

    private void criarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarTarefaActionPerformed
        RegistarTarefa registartarefa = new RegistarTarefa(sistema);
        registartarefa.setVisible(true);
    }//GEN-LAST:event_criarTarefaActionPerformed

    private void criarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProjetoActionPerformed
        RegistarProjeto registarprojeto = new RegistarProjeto(sistema);
        registarprojeto.setVisible(true);
    }//GEN-LAST:event_criarProjetoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       AlterarProjeto alterarprojeto = new AlterarProjeto(sistema);
        alterarprojeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AlterarTarefa alterartarefa = new AlterarTarefa(sistema);
        alterartarefa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JMenuItem criarProjeto;
    private javax.swing.JMenuItem criarTarefa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiAlterarPerfil;
    private javax.swing.JLabel lblDataSistema;
    private javax.swing.JLabel lblGesProjeto;
    private javax.swing.JLabel lblUtilizador;
    private javax.swing.JMenuItem listarProjetos;
    private javax.swing.JMenuItem listarTarefas;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuGestão;
    private javax.swing.JMenu menuListagens;
    private javax.swing.JMenu menuRegistar;
    // End of variables declaration//GEN-END:variables
}
