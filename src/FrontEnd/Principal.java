package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    private Sistema sistema;
    private int contadorProjetosConcluidos = 0;
    private int contadorProjetosEmCurso = 0;
    private int contadorProjetosAtrasados = 0;
    private int contadorProjetosParticipa = 0;

    public Principal(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.lblUtilizador.setText(sistema.getUtilizadorLigado().getNome());

        if (sistema.getListaprojetos().getArraylistaprojeto().size() > 0) {
            projetosConcluidos();
            projetosEmCurso();
            projetosAtrasados();
            topProjetosAtrasados();
            percentagemProjetosConcluidos();
            percentagemProjetosAtrasados();
            percentagemProjetosEmCurso();
            projetoProblematico();
            numeroProjetosParticipa();
            this.nProjetosConcluidos.setText(String.valueOf(getProjetosConcluidos() + "/" + contadorProjetosParticipa));
            this.nProjetosEmCurso.setText(String.valueOf(getProjetosEmCurso() + "/" + contadorProjetosParticipa));
            this.nProjetosAtrasados.setText(String.valueOf(getProjetosAtrasados() + "/" + contadorProjetosParticipa));
            this.percentagemProjetosConcluidos.setText(String.format("%.2f", percentagemProjetosConcluidos()) + "%");
            this.percentagemProjetosAtrasados.setText(String.format("%.2f", percentagemProjetosAtrasados()) + "%");
            this.percentagemProjetosEmCurso.setText(String.format("%.2f", percentagemProjetosEmCurso()) + "%");

            //Força a maximização da janela
            this.setExtendedState(Principal.MAXIMIZED_BOTH);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        lblUtilizador = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        nProjetosConcluidos = new javax.swing.JLabel();
        nProjetosEmCurso = new javax.swing.JLabel();
        nProjetosAtrasados = new javax.swing.JLabel();
        atualizarDashboard = new javax.swing.JButton();
        percentagemProjetosConcluidos = new javax.swing.JLabel();
        lbltop1 = new javax.swing.JLabel();
        lbltop2 = new javax.swing.JLabel();
        lbltop3 = new javax.swing.JLabel();
        percentagemProjetosEmCurso = new javax.swing.JLabel();
        percentagemProjetosAtrasados = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tituloProjetoMaisProblematico = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmiMudarUtilizador = new javax.swing.JMenuItem();
        jmiterminar = new javax.swing.JMenuItem();
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel3.setText("Numero De Projetos Concluídos:  ");

        jLabel4.setText("% De Projetos Concluídos:  ");

        jLabel5.setText("Numero De Projetos Em Curso:  ");

        jLabel6.setText("Numero De Projetos Atrasados:  ");

        jLabel7.setText("% De Projetos Em Curso:  ");

        jLabel8.setText("% De Projetos Atrasados:");

        jLabel9.setText("Top 3 Projetos mais atrasados");

        jLabel10.setText("Projeto mais problemático da Empresa");

        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        lblUtilizador.setText("Utilizador");
        jToolBar1.add(lblUtilizador);
        lblUtilizador.getAccessibleContext().setAccessibleName("");

        jToolBar1.add(jSeparator3);

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

        percentagemProjetosEmCurso.setText("pPeC");

        percentagemProjetosAtrasados.setText("pPA");

        jLabel1.setText("Pessoais");

        jLabel2.setText("Pessoais/Empresa");

        tituloProjetoMaisProblematico.setText("PMPDE");

        jMenu1.setText("Sistema");

        jmiMudarUtilizador.setText("Mudar de Utilizador");
        jmiMudarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiMudarUtilizadorActionPerformed(evt);
            }
        });
        jMenu1.add(jmiMudarUtilizador);

        jmiterminar.setText("Terminar Sessão");
        jmiterminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiterminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiterminar);

        jMenuBar1.add(jMenu1);

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
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(nProjetosAtrasados, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltop1)
                        .addGap(115, 115, 115)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(atualizarDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(percentagemProjetosEmCurso))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(percentagemProjetosConcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(percentagemProjetosAtrasados)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltop2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbltop3)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(tituloProjetoMaisProblematico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(nProjetosConcluidos)
                    .addComponent(percentagemProjetosConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(nProjetosEmCurso)
                    .addComponent(percentagemProjetosEmCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(nProjetosAtrasados)
                    .addComponent(percentagemProjetosAtrasados))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltop2)
                    .addComponent(lbltop3)
                    .addComponent(lbltop1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(tituloProjetoMaisProblematico)
                .addGap(38, 38, 38)
                .addComponent(atualizarDashboard)
                .addGap(31, 31, 31)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jmiListadeTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiListadeTarefasActionPerformed
        ListarTarefasProjeto listatarefasprojeto = new ListarTarefasProjeto(sistema);
        listatarefasprojeto.setVisible(true);
    }//GEN-LAST:event_jmiListadeTarefasActionPerformed

    private void atualizarDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarDashboardActionPerformed
        contadorProjetosConcluidos = 0;
        contadorProjetosEmCurso = 0;
        contadorProjetosAtrasados = 0;
        contadorProjetosParticipa = 0;
        projetosConcluidos();
        projetosEmCurso();
        projetosAtrasados();
        topProjetosAtrasados();
        percentagemProjetosConcluidos();
        percentagemProjetosAtrasados();
        percentagemProjetosEmCurso();
        projetoProblematico();
        numeroProjetosParticipa();
        this.nProjetosConcluidos.setText(String.valueOf(getProjetosConcluidos() + "/" + contadorProjetosParticipa));
        this.nProjetosEmCurso.setText(String.valueOf(getProjetosEmCurso() + "/" + contadorProjetosParticipa));
        this.nProjetosAtrasados.setText(String.valueOf(getProjetosAtrasados() + "/" + contadorProjetosParticipa));
        this.percentagemProjetosConcluidos.setText(String.format("%.2f", percentagemProjetosConcluidos()) + "%");
        this.percentagemProjetosAtrasados.setText(String.format("%.2f", percentagemProjetosAtrasados()) + "%");
        this.percentagemProjetosEmCurso.setText(String.format("%.2f", percentagemProjetosEmCurso()) + "%");
    }//GEN-LAST:event_atualizarDashboardActionPerformed

    private void jmiMudarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiMudarUtilizadorActionPerformed

        if (JOptionPane.showConfirmDialog(null,
                "Deseja Mudar de Utilizador ?",
                "Atenção !",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            Login login = new Login(sistema);
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jmiMudarUtilizadorActionPerformed

    private void jmiterminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiterminarActionPerformed
        terminar();
    }//GEN-LAST:event_jmiterminarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        terminar();
    }//GEN-LAST:event_formWindowClosing

    private void terminar() {
        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            sistema.terminar();
        }
    }

    private void projetosConcluidos() {
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                if (p.getEstadoprojeto() == sistema.getEstado().concluido) {
                    contadorProjetosConcluidos++;
                }
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (p.getEstadoprojeto() == sistema.getEstado().concluido) {
                            contadorProjetosConcluidos++;
                        }
                    }
                }
            }

        }
    }

    private int getProjetosConcluidos() {
        return contadorProjetosConcluidos;
    }

    private void projetosEmCurso() {
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                if (p.getEstadoprojeto() == sistema.getEstado().emcurso) {
                    contadorProjetosEmCurso++;
                } else {
                    for (Colaborador c : p.getArraylistcolaborador()) {
                        if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                            if (p.getEstadoprojeto() == sistema.getEstado().emcurso) {
                                contadorProjetosEmCurso++;
                            }
                        }
                    }
                }
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
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                if (p.getDatafim().isBefore(hoje)) {
                    contadorProjetosAtrasados++;
                }
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (p.getDatafim().isBefore(hoje)) {
                            contadorProjetosAtrasados++;
                        }
                    }
                }
            }
        }
    }

    private int getProjetosAtrasados() {
        return contadorProjetosAtrasados;
    }

    private void numeroProjetosParticipa() {
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                contadorProjetosParticipa++;
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        contadorProjetosParticipa++;
                    }
                }
            }

        }
    }

    private double percentagemProjetosConcluidos() {
        double percentagemProjetosConcluidos = 0;

        percentagemProjetosConcluidos = (float) contadorProjetosConcluidos / contadorProjetosParticipa * 100;
        return percentagemProjetosConcluidos;
    }

    private double percentagemProjetosAtrasados() {
        double percentagemProjetosAtrasados = 0;

        percentagemProjetosAtrasados = (float) contadorProjetosAtrasados / contadorProjetosParticipa * 100;
        return percentagemProjetosAtrasados;
    }

    private double percentagemProjetosEmCurso() {
        double percentagemProjetosEmCurso = 0;

        percentagemProjetosEmCurso = (float) contadorProjetosEmCurso / contadorProjetosParticipa * 100;
        return percentagemProjetosEmCurso;
    }

    private void topProjetosAtrasados() {
        String nometop1 = "Não existe";
        String nometop2 = "Não existe";
        String nometop3 = "Não existe";
        LocalDate top1 = LocalDate.now();
        LocalDate top2 = LocalDate.now();
        LocalDate top3 = LocalDate.now();
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                if (p.getDatafim().isBefore(top1)) {
                    top1 = p.getDatafim();
                    nometop1 = p.getTitulo();
                }
                if (p.getDatafim().isAfter(top1)) {
                    top2 = p.getDatafim();
                    nometop2 = p.getTitulo();
                }
                if (p.getDatafim().isAfter(top1)) {
                    top3 = p.getDatafim();
                    nometop3 = p.getTitulo();
                }

            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (p.getDatafim().isBefore(top1)) {
                            top1 = p.getDatafim();
                            nometop1 = p.getTitulo();
                        }
                        if (p.getDatafim().isAfter(top1)) {
                            top2 = p.getDatafim();
                            nometop2 = p.getTitulo();
                        }
                        if (p.getDatafim().isAfter(top2)) {
                            top3 = p.getDatafim();
                            nometop3 = p.getTitulo();
                        }
                    }
                }
            }
        }
        lbltop1.setText(nometop1);
        lbltop2.setText(nometop2);
        lbltop3.setText(nometop3);
    }

    private void projetoProblematico() {
        int numProjetoMaisProblematico = 0;
        int numColaboradoresAnterior = 0;

        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (p.getArraylistcolaborador().size() > numColaboradoresAnterior) {
                numColaboradoresAnterior = p.getArraylistcolaborador().size();
                numProjetoMaisProblematico = i;
            }
        }

        tituloProjetoMaisProblematico.setText(String.valueOf(sistema.getListaprojetos().getArraylistaprojeto().get(numProjetoMaisProblematico).getTitulo()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarDashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem jmiAlterarPerfil;
    private javax.swing.JMenuItem jmiListaTarefas;
    private javax.swing.JMenuItem jmiListadeTarefas;
    private javax.swing.JMenuItem jmiMudarUtilizador;
    private javax.swing.JMenuItem jmiProjeto;
    private javax.swing.JMenuItem jmiProjetos;
    private javax.swing.JMenuItem jmiTarefa;
    private javax.swing.JMenuItem jmiTarefas;
    private javax.swing.JMenuItem jmiUtilizadores;
    private javax.swing.JMenuItem jmiterminar;
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
    private javax.swing.JLabel percentagemProjetosAtrasados;
    private javax.swing.JLabel percentagemProjetosConcluidos;
    private javax.swing.JLabel percentagemProjetosEmCurso;
    private javax.swing.JLabel tituloProjetoMaisProblematico;
    // End of variables declaration//GEN-END:variables
}
