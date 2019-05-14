
package FrontEnd;
import BackEnd.*;
import FrontEnd.*;

public class Principal extends javax.swing.JFrame {
    private Sistema sistema;

    public Principal(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.jLabel2.setText("Bem-vindo:" + sistema.getUtilizadorLigado().getUser());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAlterarPerfil = new javax.swing.JButton();
        btnListaUtilizador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnNovoProjeto = new javax.swing.JButton();
        btnListarProjetos = new javax.swing.JButton();
        btnAlterarProjeto = new javax.swing.JButton();
        btnTarefa = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnListarTarefas = new javax.swing.JButton();
        btnAlterarTarefas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistar = new javax.swing.JMenu();
        criarProjeto = new javax.swing.JMenuItem();
        criarTarefa = new javax.swing.JMenuItem();
        menuListagens = new javax.swing.JMenu();
        listarProjetos = new javax.swing.JMenuItem();
        listarTarefas = new javax.swing.JMenuItem();
        menuGestão = new javax.swing.JMenu();
        alterarProjeto = new javax.swing.JMenuItem();
        alterarTarefa = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAlterarPerfil.setText("Alterar Perfil");
        btnAlterarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPerfilActionPerformed(evt);
            }
        });

        btnListaUtilizador.setText("Listar Utilizadores");
        btnListaUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUtilizadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("GESTÃO DE PROJETOS");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnNovoProjeto.setText("Novo Projeto");
        btnNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProjetoActionPerformed(evt);
            }
        });

        btnListarProjetos.setText("Listar Projetos");
        btnListarProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarProjetosActionPerformed(evt);
            }
        });

        btnAlterarProjeto.setText("Alterar Projeto");
        btnAlterarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProjetoActionPerformed(evt);
            }
        });

        btnTarefa.setText("Nova Tarefa");
        btnTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarefaActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnListarTarefas.setText("Listar Tarefas");
        btnListarTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarTarefasActionPerformed(evt);
            }
        });

        btnAlterarTarefas.setText("Alterar Tarefas");
        btnAlterarTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarTarefasActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Bem-Vindo: User");

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

        jMenuBar1.add(menuListagens);

        menuGestão.setText("Gestão");

        alterarProjeto.setText("Alterar Projeto");
        alterarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarProjetoActionPerformed(evt);
            }
        });
        menuGestão.add(alterarProjeto);

        alterarTarefa.setText("Alterar Tarefa");
        alterarTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarTarefaActionPerformed(evt);
            }
        });
        menuGestão.add(alterarTarefa);

        jMenuBar1.add(menuGestão);

        menuAdmin.setText("Administrador");

        jMenu1.setText("Listar Utilizadores");
        menuAdmin.add(jMenu1);

        jMenuBar1.add(menuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnNovoProjeto)
                        .addGap(18, 18, 18)
                        .addComponent(btnListarProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterarProjeto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAlterarPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnListaUtilizador)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTarefa)
                .addGap(22, 22, 22)
                .addComponent(btnListarTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterarTarefas))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTarefa)
                    .addComponent(btnListarTarefas)
                    .addComponent(btnAlterarTarefas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnListarProjetos)
                    .addComponent(btnAlterarProjeto))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarPerfil)
                    .addComponent(btnListaUtilizador)
                    .addComponent(btnGravar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPerfilActionPerformed
          AlterarPerfil alterarperfil = new AlterarPerfil(sistema);
        alterarperfil.setVisible(true);
    }//GEN-LAST:event_btnAlterarPerfilActionPerformed

    private void btnListaUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUtilizadorActionPerformed
        ListaUtilizadores listautilizadores = new ListaUtilizadores(sistema);
        listautilizadores.setVisible(true);
    }//GEN-LAST:event_btnListaUtilizadorActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        sistema.guardarObjectos();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProjetoActionPerformed
  RegistarProjeto registarprojeto = new RegistarProjeto(sistema);
        registarprojeto.setVisible(true);
    }//GEN-LAST:event_btnNovoProjetoActionPerformed

    private void btnListarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarProjetosActionPerformed
       ListaProjetos listaprojetos = new ListaProjetos(sistema);
        listaprojetos.setVisible(true);
    }//GEN-LAST:event_btnListarProjetosActionPerformed

    private void btnAlterarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProjetoActionPerformed
      AlterarProjeto alterarprojeto = new AlterarProjeto(sistema);
        alterarprojeto.setVisible(true);
    }//GEN-LAST:event_btnAlterarProjetoActionPerformed

    private void btnTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarefaActionPerformed
        RegistarTarefa registartarefa = new RegistarTarefa(sistema);
        registartarefa.setVisible(true);
    }//GEN-LAST:event_btnTarefaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sistema.getListatarefas().ConsultaTarefas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnListarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarTarefasActionPerformed
         ListaTarefas listatarefas = new ListaTarefas(sistema);
        listatarefas.setVisible(true);
    }//GEN-LAST:event_btnListarTarefasActionPerformed

    private void btnAlterarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarTarefasActionPerformed
      AlterarTarefa alterartarefa = new AlterarTarefa(sistema);
        alterartarefa.setVisible(true);
    }//GEN-LAST:event_btnAlterarTarefasActionPerformed

    private void criarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarProjetoActionPerformed
        RegistarProjeto registarprojeto = new RegistarProjeto(sistema);
        registarprojeto.setVisible(true);
    }//GEN-LAST:event_criarProjetoActionPerformed

    private void criarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarTarefaActionPerformed
        RegistarTarefa registartarefa = new RegistarTarefa(sistema);
        registartarefa.setVisible(true);
    }//GEN-LAST:event_criarTarefaActionPerformed

    private void listarTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTarefasActionPerformed
        ListaTarefas listatarefas = new ListaTarefas(sistema);
        listatarefas.setVisible(true);
    }//GEN-LAST:event_listarTarefasActionPerformed

    private void listarProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProjetosActionPerformed
        ListaProjetos listaprojetos = new ListaProjetos(sistema);
        listaprojetos.setVisible(true);
    }//GEN-LAST:event_listarProjetosActionPerformed

    private void alterarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarProjetoActionPerformed
        AlterarProjeto alterarprojeto = new AlterarProjeto(sistema);
        alterarprojeto.setVisible(true);
    }//GEN-LAST:event_alterarProjetoActionPerformed

    private void alterarTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarTarefaActionPerformed
        AlterarTarefa alterartarefa = new AlterarTarefa(sistema);
        alterartarefa.setVisible(true);
    }//GEN-LAST:event_alterarTarefaActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alterarProjeto;
    private javax.swing.JMenuItem alterarTarefa;
    private javax.swing.JButton btnAlterarPerfil;
    private javax.swing.JButton btnAlterarProjeto;
    private javax.swing.JButton btnAlterarTarefas;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnListaUtilizador;
    private javax.swing.JButton btnListarProjetos;
    private javax.swing.JButton btnListarTarefas;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnTarefa;
    private javax.swing.JMenuItem criarProjeto;
    private javax.swing.JMenuItem criarTarefa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listarProjetos;
    private javax.swing.JMenuItem listarTarefas;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuGestão;
    private javax.swing.JMenu menuListagens;
    private javax.swing.JMenu menuRegistar;
    // End of variables declaration//GEN-END:variables
}
