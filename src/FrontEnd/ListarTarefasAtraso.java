package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ListarTarefasAtraso extends javax.swing.JDialog {

    private Sistema sistema;

    public ListarTarefasAtraso(Sistema sistema) {
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
        tblListaTarefasAtraso = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Tarefas em Atraso");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblListaTarefasAtraso.setModel(new javax.swing.table.DefaultTableModel(
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
        spProjetos.setViewportView(tblListaTarefasAtraso);

        btnCancelar.setText("Voltar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(856, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spProjetos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(spProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void listarProjetos() {
        LocalDate hoje = LocalDate.now();
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
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

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);

            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                for (int j = 0; j < sistema.getListatarefasprojeto().getListaTarefasProjeto().size(); j++) {
                    //apanha o valor do array !

                    TarefasProjeto tp = sistema.getListatarefasprojeto().getListaTarefasProjeto().get(j);

                    for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                        if (tp.getNumtarefaProjeto() == tpmpt.getNumtarefaProjeto()) {

                            for (int k = 0; k < sistema.getListatarefas().getListaTarefas().size(); k++) {

                                Tarefa t = sistema.getListatarefas().getListaTarefas().get(k);
                                if (t.getDatafim().isBefore(hoje)) {
                                    for (Tarefa tmpt : tp.getArraylistalistatarefas()) {

                                        if (t.getNumtarefa() == tmpt.getNumtarefa()) {

                                            tm.addRow(new Object[]{p.getNumprojeto(), p.getDescricao(), tp.getNumtarefaProjeto(), tp.getTitulo(), t.getNumtarefa(), t.getTitulo(), t.getDatainicio(), t.getDatafim(), t.getEstadotarefa().getDescricao(), t.getCriadopor().getUser()});

                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {

                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        for (int j = 0; j < sistema.getListatarefasprojeto().getListaTarefasProjeto().size(); j++) {
                            //apanha o valor do array !

                            TarefasProjeto tp = sistema.getListatarefasprojeto().getListaTarefasProjeto().get(j);

                            for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                                if (tp.getNumtarefaProjeto() == tpmpt.getNumtarefaProjeto()) {

                                    for (int k = 0; k < sistema.getListatarefas().getListaTarefas().size(); k++) {

                                        Tarefa t = sistema.getListatarefas().getListaTarefas().get(k);
                                        if (t.getDatafim().isBefore(hoje)) {
                                            for (Tarefa tmpt : tp.getArraylistalistatarefas()) {

                                                if (t.getNumtarefa() == tmpt.getNumtarefa()) {

                                                    tm.addRow(new Object[]{p.getNumprojeto(), p.getDescricao(), tp.getNumtarefaProjeto(), tp.getTitulo(), t.getNumtarefa(), t.getTitulo(), t.getDatainicio(), t.getDatafim(), t.getEstadotarefa().getDescricao(), t.getCriadopor().getUser()});

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
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarProjetos();
       //  this.lblFiltro.setText("Filtro +");
        this.jpFiltro.setVisible(false);

    }//GEN-LAST:event_formWindowActivated

    // Barra procura   
    private void barraProcura(String query) {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefasAtraso.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

// Ordernação da lista
    private void ordenar() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefasAtraso.setRowSorter(sorter);
    }
    
    private void filtros() {

        //resgata o TableModel da sua JTable
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
//Cria um RowSorter baseado no TableModel resgatado
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
//Aplica o RowSorte na na JTable
        tblListaTarefasAtraso.setRowSorter(tr);

        
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnAplicar1;
    private javax.swing.JButton btnAplicar2;
    private javax.swing.JButton btnAplicar3;
    private javax.swing.JButton btnAplicar4;
    private javax.swing.JButton btnAplicar5;
    private javax.swing.JButton btnAplicar6;
    private javax.swing.JButton btnAplicar7;
    private javax.swing.JButton btnAplicar8;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnLimpar2;
    private javax.swing.JButton btnLimpar3;
    private javax.swing.JButton btnLimpar4;
    private javax.swing.JButton btnLimpar5;
    private javax.swing.JButton btnLimpar6;
    private javax.swing.JButton btnLimpar7;
    private javax.swing.JButton btnLimpar8;
    private javax.swing.JComboBox<String> cmbColaborador;
    private javax.swing.JComboBox<String> cmbColaborador1;
    private javax.swing.JComboBox<String> cmbColaborador2;
    private javax.swing.JComboBox<String> cmbColaborador3;
    private javax.swing.JComboBox<String> cmbColaborador4;
    private javax.swing.JComboBox<String> cmbColaborador5;
    private javax.swing.JComboBox<String> cmbColaborador6;
    private javax.swing.JComboBox<String> cmbColaborador7;
    private javax.swing.JComboBox<String> cmbColaborador8;
    private javax.swing.JComboBox<String> cmbCriadoPor;
    private javax.swing.JComboBox<String> cmbCriadoPor1;
    private javax.swing.JComboBox<String> cmbCriadoPor2;
    private javax.swing.JComboBox<String> cmbCriadoPor3;
    private javax.swing.JComboBox<String> cmbCriadoPor4;
    private javax.swing.JComboBox<String> cmbCriadoPor5;
    private javax.swing.JComboBox<String> cmbCriadoPor6;
    private javax.swing.JComboBox<String> cmbCriadoPor7;
    private javax.swing.JComboBox<String> cmbCriadoPor8;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstado1;
    private javax.swing.JComboBox<String> cmbEstado2;
    private javax.swing.JComboBox<String> cmbEstado3;
    private javax.swing.JComboBox<String> cmbEstado4;
    private javax.swing.JComboBox<String> cmbEstado5;
    private javax.swing.JComboBox<String> cmbEstado6;
    private javax.swing.JComboBox<String> cmbEstado7;
    private javax.swing.JComboBox<String> cmbEstado8;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JComboBox<String> cmbProjeto1;
    private javax.swing.JComboBox<String> cmbProjeto2;
    private javax.swing.JComboBox<String> cmbProjeto3;
    private javax.swing.JComboBox<String> cmbProjeto4;
    private javax.swing.JComboBox<String> cmbProjeto5;
    private javax.swing.JComboBox<String> cmbProjeto6;
    private javax.swing.JComboBox<String> cmbProjeto7;
    private javax.swing.JComboBox<String> cmbProjeto8;
    private javax.swing.JTextField ftxFim;
    private javax.swing.JTextField ftxFim1;
    private javax.swing.JTextField ftxFim2;
    private javax.swing.JTextField ftxFim3;
    private javax.swing.JTextField ftxFim4;
    private javax.swing.JTextField ftxFim5;
    private javax.swing.JTextField ftxFim6;
    private javax.swing.JTextField ftxFim7;
    private javax.swing.JTextField ftxFim8;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JFormattedTextField ftxInicio1;
    private javax.swing.JFormattedTextField ftxInicio2;
    private javax.swing.JFormattedTextField ftxInicio3;
    private javax.swing.JFormattedTextField ftxInicio4;
    private javax.swing.JFormattedTextField ftxInicio5;
    private javax.swing.JFormattedTextField ftxInicio6;
    private javax.swing.JFormattedTextField ftxInicio7;
    private javax.swing.JFormattedTextField ftxInicio8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jpFiltro;
    private javax.swing.JPanel jpFiltro1;
    private javax.swing.JPanel jpFiltro2;
    private javax.swing.JPanel jpFiltro3;
    private javax.swing.JPanel jpFiltro4;
    private javax.swing.JPanel jpFiltro5;
    private javax.swing.JPanel jpFiltro6;
    private javax.swing.JPanel jpFiltro7;
    private javax.swing.JPanel jpFiltro8;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblColaborador1;
    private javax.swing.JLabel lblColaborador2;
    private javax.swing.JLabel lblColaborador3;
    private javax.swing.JLabel lblColaborador4;
    private javax.swing.JLabel lblColaborador5;
    private javax.swing.JLabel lblColaborador6;
    private javax.swing.JLabel lblColaborador7;
    private javax.swing.JLabel lblColaborador8;
    private javax.swing.JLabel lblDataInico;
    private javax.swing.JLabel lblDataInico1;
    private javax.swing.JLabel lblDataInico2;
    private javax.swing.JLabel lblDataInico3;
    private javax.swing.JLabel lblDataInico4;
    private javax.swing.JLabel lblDataInico5;
    private javax.swing.JLabel lblDataInico6;
    private javax.swing.JLabel lblDataInico7;
    private javax.swing.JLabel lblDataInico8;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstado2;
    private javax.swing.JLabel lblEstado3;
    private javax.swing.JLabel lblEstado4;
    private javax.swing.JLabel lblEstado5;
    private javax.swing.JLabel lblEstado6;
    private javax.swing.JLabel lblEstado7;
    private javax.swing.JLabel lblEstado8;
    private javax.swing.JLabel lblProjeto;
    private javax.swing.JLabel lblProjeto1;
    private javax.swing.JLabel lblProjeto2;
    private javax.swing.JLabel lblProjeto3;
    private javax.swing.JLabel lblProjeto4;
    private javax.swing.JLabel lblProjeto5;
    private javax.swing.JLabel lblProjeto6;
    private javax.swing.JLabel lblProjeto7;
    private javax.swing.JLabel lblProjeto8;
    private javax.swing.JScrollPane spProjetos;
    private javax.swing.JTable tblListaTarefasAtraso;
    // End of variables declaration//GEN-END:variables
}
