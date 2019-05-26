package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarProjetos extends javax.swing.JDialog {

    private Sistema sistema;

    public ListarProjetos(Sistema sistema) {
        initComponents();
         //Não permite o redimensionamento da janela
        this.setResizable(false);                        
        this.setModal(true); 
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;

        ordenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spProjetos = new javax.swing.JScrollPane();
        tblListaProjetos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        cmbProjeto = new javax.swing.JComboBox<>();
        lblProjeto = new javax.swing.JLabel();
        lblFiltro = new javax.swing.JLabel();
        jpFiltro = new javax.swing.JPanel();
        barraProcuraTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
        jLabel1 = new javax.swing.JLabel();
        ftxFim = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Projetos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblListaProjetos.setModel(new javax.swing.table.DefaultTableModel(
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
        spProjetos.setViewportView(tblListaProjetos);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        cmbProjeto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProjetoItemStateChanged(evt);
            }
        });
        cmbProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProjetoActionPerformed(evt);
            }
        });

        lblProjeto.setText("Projeto");

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

        barraProcuraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraProcuraTxtActionPerformed(evt);
            }
        });
        barraProcuraTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barraProcuraTxtKeyReleased(evt);
            }
        });

        jLabel4.setText("Título");

        jLabel2.setText("Criado por:");

        cmbCriadoPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCriadoPorActionPerformed(evt);
            }
        });

        lblColaborador.setText("Colaborador:");

        cmbColaborador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbColaboradorActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Não Iniciado", "Em Curso", "Concluído" }));
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Data Fim");

        javax.swing.GroupLayout jpFiltroLayout = new javax.swing.GroupLayout(jpFiltro);
        jpFiltro.setLayout(jpFiltroLayout);
        jpFiltroLayout.setHorizontalGroup(
            jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFiltroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addComponent(lblDataInico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(jpFiltroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCriadoPor, 0, 107, Short.MAX_VALUE)
                    .addComponent(ftxFim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblColaborador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jLabel4)
                    .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCriadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblColaborador)
                    .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnAplicar)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(lblDataInico)
                    .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProjeto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(650, 650, 650))
                            .addComponent(jpFiltro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addGap(36, 36, 36)
                                .addComponent(btnCancelar))
                            .addComponent(spProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjeto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFiltro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void listarProjetos() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        //Cria as colunas da tabela
        tm.setColumnCount(0);
        tm.setRowCount(0);
        tm.addColumn("Número");
        tm.addColumn("Titulo");
        tm.addColumn("Gestor");
        tm.addColumn("Data Inicio");
        tm.addColumn("Data Fim");
        tm.addColumn("Estado");
        //percorre todo o array de projetos
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            //valida se o utilizador autenticado é gestor do projeto
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                //se for gestor mostra na linha, senão for, passa à frente !!
                tm.addRow(new Object[]{p.getNumprojeto(), p.getTitulo(), p.getGestor().getUser(), p.getDatainicio(), p.getDatafim(), p.getEstadoprojeto().getDescricao()});
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        tm.addRow(new Object[]{p.getNumprojeto(), p.getTitulo(), p.getGestor().getUser(), p.getDatainicio(), p.getDatafim(), p.getEstadoprojeto().getDescricao()});

                    }

                    //se for gestor mostra na linha, senão for, passa à frente !!
                }

            }
        }
        this.tblListaProjetos.setModel(tm);
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarProjetos();
    }//GEN-LAST:event_formWindowActivated

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        int numlinha = tblListaProjetos.getSelectedRow();
        Projeto projeto = new Projeto();
        int numprojeto = tm.getValueAt(numlinha, 0).hashCode();

        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            //valida se o utilizador autenticado é gestor do projeto
            if (p.getNumprojeto() == numprojeto) {
                projeto = p;

                AlterarProjeto alterarprojeto = new AlterarProjeto(sistema, projeto);
                alterarprojeto.setVisible(true);
                
                
            }

        }


    }//GEN-LAST:event_btnAlterarActionPerformed

    private void cmbProjetoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProjetoItemStateChanged
        String query = this.cmbProjeto.getSelectedItem().toString();
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaProjetos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }//GEN-LAST:event_cmbProjetoItemStateChanged

    private void lblFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFiltroMouseClicked
        if (this.jpFiltro.isVisible()) {
            this.lblFiltro.setText("Filtro +");
            this.jpFiltro.setVisible(false);
        } else {
            this.lblFiltro.setText("Filtro -");
            this.jpFiltro.setVisible(true);

        }
    }//GEN-LAST:event_lblFiltroMouseClicked

    private void lblFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblFiltroKeyPressed

    }//GEN-LAST:event_lblFiltroKeyPressed

    private void barraProcuraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraProcuraTxtActionPerformed

    }//GEN-LAST:event_barraProcuraTxtActionPerformed

    private void barraProcuraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraProcuraTxtKeyReleased

    }//GEN-LAST:event_barraProcuraTxtKeyReleased

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        Filtros();
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        this.barraProcuraTxt.setText("");
        this.cmbCriadoPor.setSelectedItem("");
        this.cmbEstado.setSelectedItem(" ");
        this.ftxInicio.setText("");
        this.ftxFim.setText("");
        Filtros();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void ftxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxInicioActionPerformed

    }//GEN-LAST:event_ftxInicioActionPerformed

    private void cmbCriadoPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCriadoPorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCriadoPorActionPerformed

    private void cmbColaboradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbColaboradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbColaboradorActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void cmbProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProjetoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.lblFiltro.setText("Filtro +");
        this.jpFiltro.setVisible(false);

        this.cmbProjeto.removeAllItems();
        this.cmbProjeto.addItem("");
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                this.cmbProjeto.addItem(p.getTitulo());
            } else {
                for (int j = 0; j < p.getArraylistcolaborador().size(); j++) {

                    Colaborador c = p.getArraylistcolaborador().get(j);
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
        for (int i = 0; i < sistema.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            this.cmbColaborador.addItem(u.getUser());
            this.cmbCriadoPor.addItem(u.getUser());

        }
    }//GEN-LAST:event_formWindowOpened

 // Barra procura   
    private void barraProcura(String query){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaProjetos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
// Ordernação da lista
    private void ordenar(){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaProjetos.setRowSorter(sorter);
    }
    
     private void Filtros() {

        //resgata o TableModel da sua JTable
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
//Cria um RowSorter baseado no TableModel resgatado
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
//Aplica o RowSorte na na JTable
        tblListaProjetos.setRowSorter(tr);

        String titulo = this.barraProcuraTxt.getText().trim();
        String estado = this.cmbEstado.getSelectedItem().toString().trim();
        String datainicio = this.ftxInicio.getText().trim();
        String datafim = this.ftxFim.getText().trim();
        String criadopor = this.cmbCriadoPor.getSelectedItem().toString().trim();
        String projeto = this.cmbProjeto.getSelectedItem().toString().trim();

        //cria uma lista para guardar os filtros de cada coluna
        ArrayList<RowFilter<Object, Object>> filters = new ArrayList<RowFilter<Object, Object>>();
        filters.add(RowFilter.regexFilter("(?i)" + titulo, 1));
        //RowFilter.dateFilter(ComparisonType.AFTER, date, indices)sistema.Data(datainicio));
        //RowFilter.dateFilter(ComparisonType.AFTER, date, indices)
        filters.add(RowFilter.regexFilter(criadopor, 2));
        filters.add(RowFilter.regexFilter(datainicio, 3));
        filters.add(RowFilter.regexFilter(datafim, 4));
         filters.add(RowFilter.regexFilter(estado, 5));

        //aplica os filtros no RowSorter que foi criado no construtor
        //utilizando o andFilter
        tr.setRowFilter(RowFilter.andFilter(filters));

    }

    private void barraProcuraTitulo(String query) {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaProjetos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query, 3));
    }

    private void FiltroEstado() {
        String query = this.cmbEstado.getSelectedItem().toString().trim();
        DefaultTableModel tm = (DefaultTableModel) this.tblListaProjetos.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaProjetos.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query, 6));

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraProcuraTxt;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jpFiltro;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblDataInico;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFiltro;
    private javax.swing.JLabel lblProjeto;
    private javax.swing.JScrollPane spProjetos;
    private javax.swing.JTable tblListaProjetos;
    // End of variables declaration//GEN-END:variables
}
