package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        barraProcuraTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tarefas em Atraso");
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

        barraProcuraTxt.setToolTipText("");
        barraProcuraTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                barraProcuraTxtKeyReleased(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(765, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);

            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {

                for (int j = 0; j < sistema.getListatarefasprojeto().getListatarefasprojeto().size(); j++) {
                    //apanha o valor do array !

                    TarefasProjeto tp = sistema.getListatarefasprojeto().getListatarefasprojeto().get(j);

                    for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                        if (tp.getNumtarefaProjeto() == tpmpt.getNumtarefaProjeto()) {

                            for (int k = 0; k < sistema.getListatarefas().getArraylistatarefa().size(); k++) {

                                Tarefa t = sistema.getListatarefas().getArraylistatarefa().get(k);
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
                        for (int j = 0; j < sistema.getListatarefasprojeto().getListatarefasprojeto().size(); j++) {
                            //apanha o valor do array !

                            TarefasProjeto tp = sistema.getListatarefasprojeto().getListatarefasprojeto().get(j);

                            for (TarefasProjeto tpmpt : p.getArraylistalistatarefasprojeto()) {

                                if (tp.getNumtarefaProjeto() == tpmpt.getNumtarefaProjeto()) {

                                    for (int k = 0; k < sistema.getListatarefas().getArraylistatarefa().size(); k++) {

                                        Tarefa t = sistema.getListatarefas().getArraylistatarefa().get(k);
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
    }//GEN-LAST:event_formWindowActivated

    private void barraProcuraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraProcuraTxtKeyReleased
        String query = barraProcuraTxt.getText().toLowerCase();
        barraProcura(query);
    }//GEN-LAST:event_barraProcuraTxtKeyReleased

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraProcuraTxt;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane spProjetos;
    private javax.swing.JTable tblListaTarefasAtraso;
    // End of variables declaration//GEN-END:variables
}
