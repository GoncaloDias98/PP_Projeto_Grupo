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
         //Força a maximização da janela
        this.setExtendedState(Principal.MAXIMIZED_BOTH);    
        
        //O processo de fecho da janela será controlado pelo programa
        
        this.sistema = sistema;
        this.lblUtilizador.setText(sistema.getUtilizadorLigado().getNome());
        this.lblDataSistema.setText(LocalDate.now().toString());
        projetosConcluidos();
        projetosEmCurso();
        projetosAtrasados();
        this.nProjetosConcluidos.setText(String.valueOf(getProjetosConcluidos()));
        this.nProjetosEmCurso.setText(String.valueOf(getProjetosEmCurso()));
        this.nProjetosAtrasados.setText(String.valueOf(getProjetosAtrasados()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btnGravar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        lblUtilizador = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        lblDataSistema = new javax.swing.JLabel();
        atualizarDashboard = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nProjetosConcluidos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nProjetosEmCurso = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nProjetosAtrasados = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTop1 = new javax.swing.JLabel();
        lblTop2 = new javax.swing.JLabel();
        lblTop3 = new javax.swing.JLabel();
        ftxtop1 = new javax.swing.JFormattedTextField();
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
        setTitle("Gestão de Projetos");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        lblUtilizador.setText("Utilizador");
        jToolBar1.add(lblUtilizador);
        lblUtilizador.getAccessibleContext().setAccessibleName("");

        jToolBar1.add(jSeparator3);

        lblDataSistema.setText("Data");
        jToolBar1.add(lblDataSistema);
        lblDataSistema.getAccessibleContext().setAccessibleName("");

        atualizarDashboard.setText("Atualizar");
        atualizarDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarDashboardActionPerformed(evt);
            }
        });

        jLabel3.setText("Numero de Projetos Concluídos:  ");

        nProjetosConcluidos.setText("...");

        jLabel5.setText("Numero de Projetos em curso:  ");

        nProjetosEmCurso.setText("...");

        jLabel6.setText("Numero de Projetos atrasados:  ");

        nProjetosAtrasados.setText("...");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nProjetosEmCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nProjetosAtrasados, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nProjetosConcluidos, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nProjetosConcluidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nProjetosEmCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nProjetosAtrasados)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Projeto mais problemático");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel10)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        jLabel4.setText("% de Projetos Concluídos:  ");

        jLabel7.setText("% de Projetos em curso:  ");

        jLabel8.setText("% de Projetos atrasados:  ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jLabel9.setText("Top 3 Projetos mais atrasados");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblTop2.setText("jLabel1");

        lblTop3.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftxtop1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTop1)
                        .addGap(18, 18, 18)
                        .addComponent(lblTop2)
                        .addGap(18, 18, 18)
                        .addComponent(lblTop3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTop1)
                    .addComponent(lblTop2)
                    .addComponent(lblTop3)
                    .addComponent(ftxtop1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(atualizarDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(351, 351, 351)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(atualizarDashboard))
                .addGap(49, 49, 49)
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
        projetosConcluidos();
        projetosEmCurso();
        projetosAtrasados();
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
        private void topProjetosEmAtraso(){
            
    LocalDate hoje = LocalDate.now();
    LocalDate top1 =  LocalDate.now(); 
    LocalDate top2 = LocalDate.now(); 
    LocalDate top3 = LocalDate.now(); 
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
           
                if (p.getDatafim().isBefore(top1)){
                top1 = p.getDatafim();
            }
                
            
        }
        this.ftxtop1.setText(sistema.Datatexto(top1));
        
          
    
    

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarDashboard;
    private javax.swing.JButton btnGravar;
    private javax.swing.JFormattedTextField ftxtop1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JTable jTable1;
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
    private javax.swing.JLabel lblTop1;
    private javax.swing.JLabel lblTop2;
    private javax.swing.JLabel lblTop3;
    private javax.swing.JLabel lblUtilizador;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenu menuGestão;
    private javax.swing.JMenu menuListagens;
    private javax.swing.JMenu menuRegistar;
    private javax.swing.JLabel nProjetosAtrasados;
    private javax.swing.JLabel nProjetosConcluidos;
    private javax.swing.JLabel nProjetosEmCurso;
    // End of variables declaration//GEN-END:variables
}
