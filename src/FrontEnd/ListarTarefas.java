package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter.ComparisonType;

public class ListarTarefas extends javax.swing.JDialog {

    private Sistema sistema;
    int atraso = 0;

    public ListarTarefas(Sistema sistema) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        ordenar();
    }

    public void listaTarefas() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        //Cria as colunas da tabela
        tm.setColumnCount(0);
        tm.setRowCount(0);
        tm.addColumn("Núm. Projeto");
        tm.addColumn("Projeto");
        tm.addColumn("Núm. Lista Tarefa");
        tm.addColumn("Lista Tarefa");
        tm.addColumn("Núm Tarefa");
        tm.addColumn("Tarefa");
        tm.addColumn("Data Inicio");
        tm.addColumn("Data Fim");
        tm.addColumn("Estado");
        tm.addColumn("Criada Por");
        //percorre todo o array de projetos

        for (int i = 0; i < sistema.getListaProjetos().getListasProjeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaProjetos().getListasProjeto().get(i);

            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                for (int j = 0; j < sistema.getListaTarefasProjeto().getListaTarefasProjeto().size(); j++) {
                    //apanha o valor do array !

                    TarefasProjeto tp = sistema.getListaTarefasProjeto().getListaTarefasProjeto().get(j);

                    for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                        if (tp.getNumTarefaProjeto() == tpmpt.getNumTarefaProjeto()) {

                            for (int k = 0; k < sistema.getListaTarefas().getListaTarefas().size(); k++) {

                                Tarefa t = sistema.getListaTarefas().getListaTarefas().get(k);

                                for (Tarefa tmpt : tp.getArrayListaListaTarefas()) {

                                    if (t.getNumTarefa() == tmpt.getNumTarefa()) {

                                        tm.addRow(new Object[]{p.getNumProjeto(), p.getDescricao(), tp.getNumTarefaProjeto(), tp.getTitulo(), t.getNumTarefa(), t.getTitulo(), t.getDataInicio(), t.getDataFim(), t.getEstadoTarefa().getDescricao(), t.getCriadoPor().getUser()});

                                    }
                                }
                            }

                        }
                    }
                }
              
            } else {
                for (Colaborador c : p.getArraylistColaborador()) {

                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        for (int j = 0; j < sistema.getListaTarefasProjeto().getListaTarefasProjeto().size(); j++) {
                            //apanha o valor do array !

                            TarefasProjeto tp = sistema.getListaTarefasProjeto().getListaTarefasProjeto().get(j);

                            for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                                if (tp.getNumTarefaProjeto() == tpmpt.getNumTarefaProjeto()) {

                                    for (int k = 0; k < sistema.getListaTarefas().getListaTarefas().size(); k++) {

                                        Tarefa t = sistema.getListaTarefas().getListaTarefas().get(k);

                                        for (Tarefa tmpt : tp.getArrayListaListaTarefas()) {

                                            if (t.getNumTarefa() == tmpt.getNumTarefa()) {

                                                tm.addRow(new Object[]{p.getNumProjeto(), p.getDescricao(), tp.getNumTarefaProjeto(), tp.getTitulo(), t.getNumTarefa(), t.getTitulo(), t.getDataInicio(), t.getDataFim(), t.getEstadoTarefa().getDescricao(), t.getCriadoPor().getUser()});

                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTarefas = new javax.swing.JScrollPane();
        tblListaTarefa = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblFiltro = new javax.swing.JLabel();
        jpFiltro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbCriadoPor = new javax.swing.JComboBox<>();
        lblColaborador = new javax.swing.JLabel();
        cmbColaborador = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        btnAplicar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblDataInico = new javax.swing.JLabel();
        ftxInicio = new javax.swing.JFormattedTextField();
        lblProjeto = new javax.swing.JLabel();
        cmbProjeto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ftxFim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Tarefas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblListaTarefa.setModel(new javax.swing.table.DefaultTableModel(
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
        spTarefas.setViewportView(tblListaTarefa);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jButton1.setText("Lista Tarefas Em Atraso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblFiltro.setText("Filtro +");
        lblFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFiltroMouseClicked(evt);
            }
        });
        lblFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblFiltroKeyPressed(evt);
            }
        });

        jLabel2.setText("Criado por:");

        cmbCriadoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCriadoPorActionPerformed(evt);
            }
        });

        lblColaborador.setText("Colaborador:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Não Iniciado", "Iniciado", "Concluído" }));

        lblEstado.setText("Estado:");

        btnAplicar.setText("Aplicar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblDataInico.setText("Data Inicio");

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/Y"))));
        ftxInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxInicioActionPerformed(evt);
            }
        });

        lblProjeto.setText("Projeto");

        cmbProjeto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProjetoItemStateChanged(evt);
            }
        });

        jLabel3.setText("Data Fim");

        javax.swing.GroupLayout jpFiltroLayout = new javax.swing.GroupLayout(jpFiltro);
        jpFiltro.setLayout(jpFiltroLayout);
        jpFiltroLayout.setHorizontalGroup(
            jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFiltroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addComponent(lblDataInico)
                        .addGap(8, 8, 8)
                        .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addComponent(lblProjeto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCriadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar)
                    .addComponent(btnAplicar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFiltroLayout.setVerticalGroup(
            jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFiltroLayout.createSequentialGroup()
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(lblProjeto)
                        .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbCriadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColaborador)
                    .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAplicar)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpar))
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDataInico))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(spTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jButton1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar))
                .addGap(1, 1, 1)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listaTarefas();
    }//GEN-LAST:event_formWindowActivated

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        int numlinha = tblListaTarefa.getSelectedRow();
        Tarefa tarefa = new Tarefa();
        Projeto projeto = new Projeto();
        TarefasProjeto tarefasprojeto = new TarefasProjeto();
        int numtarefa = tm.getValueAt(numlinha, 4).hashCode();
        int numprojeto = tm.getValueAt(numlinha, 0).hashCode();
        int numtp = tm.getValueAt(numlinha, 2).hashCode();

        for (int i = 0; i < sistema.getListaProjetos().getListasProjeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaProjetos().getListasProjeto().get(i);

            if (p.getNumProjeto() == numprojeto) {
                projeto = p;
                for (int j = 0; j < sistema.getListaTarefasProjeto().getListaTarefasProjeto().size(); j++) {
                    //apanha o valor do array !

                    TarefasProjeto tp = sistema.getListaTarefasProjeto().getListaTarefasProjeto().get(j);

                    if (tp.getNumTarefaProjeto() == numtp) {
                        tarefasprojeto = tp;
                        for (int k = 0; k < sistema.getListaTarefas().getListaTarefas().size(); k++) {

                            Tarefa t = sistema.getListaTarefas().getListaTarefas().get(k);

                            if (t.getNumTarefa() == numtarefa) {
                                tarefa = t;
                                this.dispose();
                                AlterarTarefa alterartarefa = new AlterarTarefa(sistema, projeto, tarefasprojeto, tarefa);
                                alterartarefa.setVisible(true);
                                alterartarefa.setResizable(false);
                                

                            }
                        }
                    }

                }
            }
        }


    }//GEN-LAST:event_btnAlterarActionPerformed
    //--Barra de Procura

    private void filtros() {

        //resgata o TableModel da sua JTable
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
//Cria um RowSorter baseado no TableModel resgatado
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
//Aplica o RowSorte na na JTable
        tblListaTarefa.setRowSorter(tr);

        
        String estado = this.cmbEstado.getSelectedItem().toString().trim();
        String datainicio = this.ftxInicio.getText().trim();
        String datafim = this.ftxFim.getText().trim();
        String criadopor = this.cmbCriadoPor.getSelectedItem().toString().trim();
        String projeto = this.cmbProjeto.getSelectedItem().toString().trim();

        //cria uma lista para guardar os filtros de cada coluna
        ArrayList<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>();
        filters.add(RowFilter.regexFilter("(?i)" + projeto, 1));
        //RowFilter.dateFilter(ComparisonType.AFTER, date, indices)sistema.Data(datainicio));
        //RowFilter.dateFilter(ComparisonType.AFTER, date, indices)
        filters.add(RowFilter.regexFilter(datainicio, 6));
        filters.add(RowFilter.regexFilter(datafim, 7));
        filters.add(RowFilter.regexFilter(estado, 8));
        filters.add(RowFilter.regexFilter(criadopor, 9));

        //aplica os filtros no RowSorter que foi criado no construtor
        //utilizando o andFilter
        tr.setRowFilter(RowFilter.andFilter(filters));

    }

    private void barraProcuraTitulo(String query) {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query, 3));
    }

    private void filtroEstado() {
        String query = this.cmbEstado.getSelectedItem().toString().trim();
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query, 6));

    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListarTarefasAtraso listatarefasprojeto = new ListarTarefasAtraso(sistema);
        listatarefasprojeto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lblFiltro.setText("Filtro +");
        this.jpFiltro.setVisible(false);

        this.cmbProjeto.removeAllItems();
        this.cmbProjeto.addItem("");
        for (int i = 0; i < sistema.getListaProjetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaProjetos().getListasProjeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                this.cmbProjeto.addItem(p.getTitulo());
            } else {
                for (int j = 0; j < p.getArraylistColaborador().size(); j++) {

                    Colaborador c = p.getArraylistColaborador().get(j);
                    if ((sistema.getUtilizadorLigado().getUser().equals(c.getUser()))) {
                        this.cmbProjeto.addItem(p.getTitulo());
                    }

                }
            }

            //Adiciona o valor do utilizador e do nome na linha da tabela !
        }

        this.cmbColaborador.removeAllItems();
        this.cmbCriadoPor.removeAllItems();
        this.cmbColaborador.addItem("");
        this.cmbCriadoPor.addItem("");
        for (int i = 0; i < sistema.getListaUtilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = sistema.getListaUtilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            this.cmbColaborador.addItem(u.getUser());
            this.cmbCriadoPor.addItem(u.getUser());

        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbProjetoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProjetoItemStateChanged
        String query = this.cmbProjeto.getSelectedItem().toString();
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));

    }//GEN-LAST:event_cmbProjetoItemStateChanged

    private void lblFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFiltroKeyPressed


    }//GEN-LAST:event_lblFiltroKeyPressed

    private void lblFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFiltroMouseClicked
        if (this.jpFiltro.isVisible()) {
            this.lblFiltro.setText("Filtro +");
            this.jpFiltro.setVisible(false);
        } else {
            this.lblFiltro.setText("Filtro -");
            this.jpFiltro.setVisible(true);

        }
    }//GEN-LAST:event_lblFiltroMouseClicked

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        filtros();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.ftxFim.setText("");
        this.ftxInicio.setText("");
        this.cmbCriadoPor.setSelectedItem("");
        this.cmbEstado.setSelectedItem("");
        filtros();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void ftxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxInicioActionPerformed

    }//GEN-LAST:event_ftxInicioActionPerformed

    private void cmbCriadoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCriadoPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCriadoPorActionPerformed
    //FIM Barra de Procura--

// Ordernação da lista
    private void ordenar() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(sorter);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cmbColaborador;
    private javax.swing.JComboBox<String> cmbCriadoPor;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpFiltro;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblDataInico;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblProjeto;
    private javax.swing.JScrollPane spTarefas;
    private javax.swing.JTable tblListaTarefa;
    // End of variables declaration//GEN-END:variables
}
