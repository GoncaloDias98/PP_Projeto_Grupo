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
        this.setLocationRelativeTo(null);
        this.setExtendedState(Principal.MAXIMIZED_BOTH);
        if (sistema.getListaprojetos().getListasProjeto().size() > 0) {
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
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jToolBar1 = new javax.swing.JToolBar();
        lblUtilizador = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nProjetosConcluidos = new javax.swing.JLabel();
        nProjetosEmCurso = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nProjetosAtrasados = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        percentagemProjetosConcluidos = new javax.swing.JLabel();
        percentagemProjetosEmCurso = new javax.swing.JLabel();
        percentagemProjetosAtrasados = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbltop3 = new javax.swing.JLabel();
        lbltop2 = new javax.swing.JLabel();
        lbltop1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
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
        menuAdmin = new javax.swing.JMenu();
        jmiAlterarPerfil = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SoftProject");
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        lblUtilizador.setText("Utilizador");
        jToolBar1.add(lblUtilizador);
        lblUtilizador.getAccessibleContext().setAccessibleName("");

        jToolBar1.add(jSeparator3);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Numero De Projetos Concluídos:  ");

        nProjetosConcluidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nProjetosConcluidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nProjetosConcluidos.setText("0");

        nProjetosEmCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nProjetosEmCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nProjetosEmCurso.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Numero De Projetos Em Curso:  ");

        nProjetosAtrasados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nProjetosAtrasados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nProjetosAtrasados.setText("0");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Numero De Projetos Atrasados:  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("% De Projetos Concluídos:  ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("% De Projetos Em Curso:  ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("% De Projetos Atrasados:");

        percentagemProjetosConcluidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentagemProjetosConcluidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentagemProjetosConcluidos.setText("0%");

        percentagemProjetosEmCurso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentagemProjetosEmCurso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentagemProjetosEmCurso.setText("0%");

        percentagemProjetosAtrasados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentagemProjetosAtrasados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        percentagemProjetosAtrasados.setText("0%");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Estatisticas de Projetos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nProjetosConcluidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nProjetosEmCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nProjetosAtrasados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentagemProjetosConcluidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentagemProjetosEmCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(percentagemProjetosAtrasados, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nProjetosConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nProjetosEmCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nProjetosAtrasados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(percentagemProjetosConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(percentagemProjetosEmCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(percentagemProjetosAtrasados))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Top 3 Projetos mais atrasados");

        lbltop3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltop3.setText("Não existe");

        lbltop2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltop2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltop2.setText("Não existe");

        lbltop1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltop1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbltop1.setText("Não existe");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbltop3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltop2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbltop1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(lbltop1)
                .addGap(18, 18, 18)
                .addComponent(lbltop2)
                .addGap(18, 18, 18)
                .addComponent(lbltop3)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Projeto mais problemático da Empresa");

        tituloProjetoMaisProblematico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tituloProjetoMaisProblematico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProjetoMaisProblematico.setText("Não existe");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(tituloProjetoMaisProblematico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(tituloProjetoMaisProblematico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(504, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
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
    private void atualizarDashboard() {
        contadorProjetosConcluidos = 0;
        contadorProjetosEmCurso = 0;
        contadorProjetosAtrasados = 0;
        contadorProjetosParticipa = 0;
        if (sistema.getListaprojetos().getListasProjeto().size() > 0) {
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
        }
    }
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

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        atualizarDashboard();
    }//GEN-LAST:event_formFocusGained

    private void terminar() {
        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            sistema.terminar();
        }
    }

    private void projetosConcluidos() {
        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
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

    public void projetosEmCurso() {
        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
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
        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
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
        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
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

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            LocalDate data = p.getDatafim();
            String nome = p.getTitulo();

            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                if (data.isBefore(top1)) {
                    top1 = data;

                    nometop1 = nome;
                }

            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (data.isBefore(top1)) {
                            top1 = data;

                            nometop1 = nome;
                        }
                    }
                }
            }
            lbltop1.setText(nometop1);
        }

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            LocalDate data = p.getDatafim();
            String nome = p.getTitulo();
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                if (data.isBefore(top2) && data.isAfter(top1)) {
                    top2 = data;
                    nometop2 = nome;
                }

            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (data.isBefore(top2) && data.isAfter(top1)) {
                            top2 = data;
                            nometop2 = nome;
                        }
                    }
                }
            }
            lbltop2.setText(nometop2);

        }

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            LocalDate data = p.getDatafim();
            String nome = p.getTitulo();
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                if (data.isBefore(top3) && data.isAfter(top2)) {
                    top3 = data;
                    nometop3 = nome;
                }

                lbltop3.setText(nometop3);
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        if (data.isBefore(top3) && data.isAfter(top2)) {
                            top3 = data;
                            nometop3 = nome;
                        }

                    }
                }
            }
            lbltop3.setText(nometop3);

        }

    }

    private void projetoProblematico() {
        int numProjetoMaisProblematico = 0;
        int numColaboradoresAnterior = 0;

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            if (p.getArraylistcolaborador().size() > numColaboradoresAnterior) {
                numColaboradoresAnterior = p.getArraylistcolaborador().size();
                numProjetoMaisProblematico = i;
            }
        }

        tituloProjetoMaisProblematico.setText(String.valueOf(sistema.getListaprojetos().getListasProjeto().get(numProjetoMaisProblematico).getTitulo()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
