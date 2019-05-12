
package FrontEnd;
import BackEnd.*;
import FrontEnd.*;

public class Principal extends javax.swing.JFrame {
    private Sistema sistema;

    public Principal(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnteste = new javax.swing.JButton();
        txtteste = new javax.swing.JTextField();
        lblteste = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnteste.setText("teste");
        btnteste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntesteActionPerformed(evt);
            }
        });

        lblteste.setText("Utilizador Ligado");

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
        jLabel1.setText("GETÃO DE PROJETOS");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblteste)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnteste)
                            .addComponent(txtteste, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTarefa)
                                .addGap(22, 22, 22)
                                .addComponent(btnListarTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnNovoProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAlterarPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnListaUtilizador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnListarProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGravar)
                            .addComponent(btnAlterarProjeto)
                            .addComponent(jButton1)
                            .addComponent(btnAlterarTarefas))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtteste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteste))
                .addGap(18, 18, 18)
                .addComponent(btnteste)
                .addGap(9, 9, 9)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTarefa)
                    .addComponent(btnListarTarefas)
                    .addComponent(btnAlterarTarefas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoProjeto)
                    .addComponent(btnListarProjetos)
                    .addComponent(btnAlterarProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarPerfil)
                    .addComponent(btnListaUtilizador)
                    .addComponent(btnGravar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntesteActionPerformed

        this.txtteste.setText(sistema.getUtilizadorLigado().getUser()); 
    }//GEN-LAST:event_btntesteActionPerformed

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

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPerfil;
    private javax.swing.JButton btnAlterarProjeto;
    private javax.swing.JButton btnAlterarTarefas;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnListaUtilizador;
    private javax.swing.JButton btnListarProjetos;
    private javax.swing.JButton btnListarTarefas;
    private javax.swing.JButton btnNovoProjeto;
    private javax.swing.JButton btnTarefa;
    private javax.swing.JButton btnteste;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblteste;
    private javax.swing.JTextField txtteste;
    // End of variables declaration//GEN-END:variables
}
