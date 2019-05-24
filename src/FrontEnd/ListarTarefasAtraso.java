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

public class ListarTarefasAtraso extends javax.swing.JFrame {

    private Sistema sistema;

    public ListarTarefasAtraso(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        ordenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spProjetos = new javax.swing.JScrollPane();
        tblListaTarefasAtraso = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barraProcuraTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Tarefas em Atraso");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void listarProjetos() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
        //Cria as colunas da tabela
        tm.setColumnCount(0);
        tm.setRowCount(0);
        tm.addColumn("Num. Projeto");
        tm.addColumn("Projeto");
        tm.addColumn("Número");
        tm.addColumn("Titulo");
        tm.addColumn("Data Inicio");
        tm.addColumn("Data Fim");
        tm.addColumn("Estado");
        //percorre todo o array de projetos
        
        for (int i = 0; i < sistema.getListatarefas().getArraylistatarefa().size(); i++) {
            LocalDate hoje = LocalDate.now();
            //apanha o valor do array !
               Tarefa t = sistema.getListatarefas().getArraylistatarefa().get(i);
               Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
             if (t.getDatafim().isBefore(hoje)) {
            //se for gestor mostra na linha, senão for, passa à frente !!
            tm.addRow(new Object[]{ t.getNumtarefa(), t.getTitulo(), t.getDatainicio(), t.getDatafim(), t.getEstadotarefa().getDescricao()});
              
        }
            this.tblListaTarefasAtraso.setModel(tm);
        }
    }


    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarProjetos();
    }//GEN-LAST:event_formWindowActivated

    private void barraProcuraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraProcuraTxtKeyReleased
        String query= barraProcuraTxt.getText().toLowerCase();
        barraProcura(query);
    }//GEN-LAST:event_barraProcuraTxtKeyReleased

 // Barra procura   
    private void barraProcura(String query){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefasAtraso.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
// Ordernação da lista
    private void ordenar(){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasAtraso.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefasAtraso.setRowSorter(sorter);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraProcuraTxt;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane spProjetos;
    private javax.swing.JTable tblListaTarefasAtraso;
    // End of variables declaration//GEN-END:variables
}
