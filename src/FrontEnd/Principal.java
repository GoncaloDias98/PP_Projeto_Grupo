package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Principal extends javax.swing.JFrame {

    private Sistema sistema;
    private int contadorProjetosConcluidos = 0;
    private int contadorProjetosEmCurso = 0;
    private int contadorProjetosAtrasados = 0;

    public Principal(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.lblUtilizador.setText(sistema.getUtilizadorLigado().getNome());
        this.lblDataSistema.setText(LocalDate.now().toString());
        projetosConcluidos();
        projetosEmCurso();
        projetosAtrasados();
        topProjetosAtrasados();
        this.nProjetosConcluidos.setText(String.valueOf(getProjetosConcluidos()));
        this.nProjetosEmCurso.setText(String.valueOf(getProjetosEmCurso()));
        this.nProjetosAtrasados.setText(String.valueOf(getProjetosAtrasados()));
        this.percentagemProjetosConcluidos.setText(percentagemProjetos() + "%");
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
        jButton1 = new javax.swing.JButton();
        nProjetosConcluidos = new javax.swing.JLabel();
        nProjetosEmCurso = new javax.swing.JLabel();
        nProjetosAtrasados = new javax.swing.JLabel();
        atualizarDashboard = new javax.swing.JButton();
        percentagemProjetosConcluidos = new javax.swing.JLabel();
        lbltop1 = new javax.swing.JLabel();
        lbltop2 = new javax.swing.JLabel();
        lbltop3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuRegistar = new javax.swing.JMenu();
        jmiProjeto = new javax.swing.JMenuItem();
        jmiListaTarefas = new javax.swing.JMenuItem();
        jmiTarefa = new javax.swing.JMenuItem();
        menuListagens = new javax.swing.JMenu();
        jmiProjetos = new javax.swing.JMenuItem();
        jmiTarefas = new javax.swing.JMenuItem();
        jmiListadeTarefas = new javax.swing.JMenuItem();
        jmiUtilizadores = new javax.swing.JMenuItem();
        menuGestão = new javax.swing.JMenu();
        menuAdmin = new javax.swing.JMenu();
        jmiAlterarPerfil = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftProject");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero De Projetos Concluídos:  ");

        jLabel4.setText("Percentagem De Projetos Concluídos:  ");

        jLabel5.setText("Numero De Projetos Em Curso:  ");

        jLabel6.setText("Numero De Projetos Atrasados:  ");

        jLabel7.setText("Percentagem de Projetos Em Curso:  ");

        jLabel8.setText("Percentagem de Projetos Atrasados:");

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

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nProjetosConcluidos.setText("nPC");

        nProjetosEmCurso.setText("nPeC");

        nProjetosAtrasados.setText("nPA");

        atualizarDashboard.setText("Atualizar");
        atualizarDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDashboardActionPerformed(evt);
            }
        });

        percentagemProjetosConcluidos.setText("pPC");

        lbltop1.setText("top1");

        lbltop2.setText("top2");

        lbltop3.setText("top3");

        menuRegistar.setText("Registar");

        jmiProjeto.setText("Projeto");
        jmiProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProjetoActionPerformed(evt);
            }
        });
        menuRegistar.add(jmiProjeto);

        jmiListaTarefas.setText("Lista Tarefas");
        jmiListaTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListaTarefasActionPerformed(evt);
            }
        });
        menuRegistar.add(jmiListaTarefas);

        jmiTarefa.setText("Tarefa");
        jmiTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTarefaActionPerformed(evt);
            }
        });
        menuRegistar.add(jmiTarefa);

        jMenuBar1.add(menuRegistar);

        menuListagens.setText("Listagens");

        jmiProjetos.setText("Projetos");
        jmiProjetos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProjetosActionPerformed(evt);
            }
        });
        menuListagens.add(jmiProjetos);

        jmiTarefas.setText("Tarefas");
        jmiTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiTarefasActionPerformed(evt);
            }
        });
        menuListagens.add(jmiTarefas);

        jmiListadeTarefas.setText("Lista de Tarefas");
        jmiListadeTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiListadeTarefasActionPerformed(evt);
            }
        });
        menuListagens.add(jmiListadeTarefas);

        jmiUtilizadores.setText("Utilizadores");
        jmiUtilizadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUtilizadoresActionPerformed(evt);
            }
        });
        menuListagens.add(jmiUtilizadores);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nProjetosConcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nProjetosEmCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nProjetosAtrasados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atualizarDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentagemProjetosConcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbltop1)
                        .addGap(18, 18, 18)
                        .addComponent(lbltop2)
                        .addGap(31, 31, 31)
                        .addComponent(lbltop3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(nProjetosConcluidos)
                    .addComponent(percentagemProjetosConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(nProjetosEmCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(nProjetosAtrasados))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltop1)
                    .addComponent(lbltop2)
                    .addComponent(lbltop3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGravar)
                            .addComponent(atualizarDashboard))
                        .addGap(31, 31, 31)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(71, 71, 71))))
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

    private void jmiUtilizadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUtilizadoresActionPerformed
        ListarUtilizadores listautilizadores = new ListarUtilizadores(sistema);
        listautilizadores.setVisible(true);
    }//GEN-LAST:event_jmiUtilizadoresActionPerformed

    private void jmiTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTarefasActionPerformed
        ListarTarefas listatarefas = new ListarTarefas(sistema);
        listatarefas.setVisible(true);
    }//GEN-LAST:event_jmiTarefasActionPerformed

    private void jmiProjetosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProjetosActionPerformed
        ListarProjetos listaprojetos = new ListarProjetos(sistema);
        listaprojetos.setVisible(true);
    }//GEN-LAST:event_jmiProjetosActionPerformed

    private void jmiTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiTarefaActionPerformed
        RegistarTarefa registartarefa = new RegistarTarefa(sistema);
        registartarefa.setVisible(true);
    }//GEN-LAST:event_jmiTarefaActionPerformed

    private void jmiProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProjetoActionPerformed
        RegistarProjeto registarprojeto = new RegistarProjeto(sistema);
        registarprojeto.setVisible(true);
    }//GEN-LAST:event_jmiProjetoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AlterarProjeto alterarprojeto = new AlterarProjeto(sistema);
        alterarprojeto.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AlterarTarefa alterartarefa = new AlterarTarefa(sistema);
        alterartarefa.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jmiListaTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListaTarefasActionPerformed
        ResgistarListaTarefas resgistarlistatarefas = new ResgistarListaTarefas(sistema);
        resgistarlistatarefas.setVisible(true);
    }//GEN-LAST:event_jmiListaTarefasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sistema.getListatarefasprojeto().listaconsulta();
        sistema.getListaprojetos().ConsultaProjetos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jmiListadeTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListadeTarefasActionPerformed
        ListarTarefasProjeto listatarefasprojeto = new ListarTarefasProjeto(sistema);
        listatarefasprojeto.setVisible(true);
    }//GEN-LAST:event_jmiListadeTarefasActionPerformed

    private void atualizarDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDashboardActionPerformed
        contadorProjetosConcluidos = 0;
        contadorProjetosEmCurso = 0;
        contadorProjetosAtrasados = 0;
        projetosConcluidos();
        projetosEmCurso();
        projetosAtrasados();
        topProjetosAtrasados();
        this.nProjetosConcluidos.setText(String.valueOf(getProjetosConcluidos()));
        this.nProjetosEmCurso.setText(String.valueOf(getProjetosEmCurso()));
        this.nProjetosAtrasados.setText(String.valueOf(getProjetosAtrasados()));
    }//GEN-LAST:event_atualizarDashboardActionPerformed

    private void projetosConcluidos() {
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (p.getEstadoprojeto() == sistema.getEstado().concluido) {
                contadorProjetosConcluidos++;
            }
        }
    }

    private int getProjetosConcluidos() {
        return contadorProjetosConcluidos;
    }

    private void projetosEmCurso() {
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (p.getEstadoprojeto() == sistema.getEstado().iniciado) {
                contadorProjetosEmCurso++;
            }
        }
    }

    private int getProjetosEmCurso() {
        return contadorProjetosEmCurso;
    }

    private void projetosAtrasados() {
        LocalDate hoje = LocalDate.now();
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (p.getDatafim().isBefore(hoje)) {
                contadorProjetosAtrasados++;
            }
        }
    }

    private int getProjetosAtrasados() {
        return contadorProjetosAtrasados;
    }

    private double percentagemProjetos() {
        double percentagemProjetosConcluidos;
        percentagemProjetosConcluidos = (float) contadorProjetosConcluidos / sistema.getListaprojetos().getArraylistaprojeto().size();
        return percentagemProjetosConcluidos;
    }

    private void topProjetosAtrasados() {
        LocalDate top1 = LocalDate.now();
        LocalDate top2 = LocalDate.now();
        LocalDate top3 = LocalDate.now();
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                if (p.getDatafim().isBefore(top1)) {
                    top1 = p.getDatafim();
                }
                if (p.getDatafim().isAfter(top1)) {
                    top2 = p.getDatafim();
                }
                if (p.getDatafim().isAfter(top1)) {
                    top3 = p.getDatafim();
                    
                    System.out.println(top3);
                }

            } /*else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (p.getDatafim().isBefore(top1)) {
                            top1 = p.getDatafim();
                            System.out.println(top1);
                        }
                        if (p.getDatafim().isAfter(top1)) {
                            top2 = p.getDatafim();
                        }
                        if (p.getDatafim().isAfter(top2)) {
                            top3 = p.getDatafim();
                        }
                    }
                }
            }*/
        }
        lbltop1.setText(sistema.Datatexto(top1));
        lbltop2.setText(sistema.Datatexto(top2));
        lbltop3.setText(sistema.Datatexto(top3));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarDashboard;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiAlterarPerfil;
    private javax.swing.JMenuItem jmiListaTarefas;
    private javax.swing.JMenuItem jmiListadeTarefas;
    private javax.swing.JMenuItem jmiProjeto;
    private javax.swing.JMenuItem jmiProjetos;
    private javax.swing.JMenuItem jmiTarefa;
    private javax.swing.JMenuItem jmiTarefas;
    private javax.swing.JMenuItem jmiUtilizadores;
    private javax.swing.JLabel lblDataSistema;
    private javax.swing.JLabel lblGesProjeto;
    private javax.swing.JLabel lblUtilizador;
    private javax.swing.JLabel lbltop1;
    private javax.swing.JLabel lbltop2;
    private javax.swing.JLabel lbltop3;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuGestão;
    private javax.swing.JMenu menuListagens;
    private javax.swing.JMenu menuRegistar;
    private javax.swing.JLabel nProjetosAtrasados;
    private javax.swing.JLabel nProjetosConcluidos;
    private javax.swing.JLabel nProjetosEmCurso;
    private javax.swing.JLabel percentagemProjetosConcluidos;
    // End of variables declaration//GEN-END:variables
}
