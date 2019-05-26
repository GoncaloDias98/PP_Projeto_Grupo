package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListarUtilizadores extends javax.swing.JDialog {

    private Sistema dados;

    public ListarUtilizadores(Sistema dados) {
        initComponents();
         //Não permite o redimensionamento da janela
        this.setResizable(false);                        
        this.setModal(true); 
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.dados = dados;
        ordenar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        spUtilizadores = new javax.swing.JScrollPane();
        tblListaUtilizadores = new javax.swing.JTable();
        barraProcuraTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Utilizadores");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblListaUtilizadores.setModel(new javax.swing.table.DefaultTableModel(
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
        spUtilizadores.setViewportView(tblListaUtilizadores);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarUtilizadores();
    }//GEN-LAST:event_formWindowActivated

    private void barraProcuraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraProcuraTxtActionPerformed
 
    }//GEN-LAST:event_barraProcuraTxtActionPerformed

    private void barraProcuraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraProcuraTxtKeyReleased
        String query= barraProcuraTxt.getText().toLowerCase();
        barraProcura(query);
    }//GEN-LAST:event_barraProcuraTxtKeyReleased

    private void listarUtilizadores() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaUtilizadores.getModel();
        //Cria as colunas abaixo na tabela
        tm.setColumnCount(0);
        tm.setRowCount(0);
        tm.addColumn("Username");
        tm.addColumn("Nome");

        //Percorre o array de ulizadores até à ultima posição !
        for (int i = 0; i < dados.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = dados.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            tm.addRow(new Object[]{u.getUser(), u.getNome()});
        }
        this.tblListaUtilizadores.setModel(tm);
    }
    
//Barra de Procura
     private void barraProcura(String query){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaUtilizadores.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaUtilizadores.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
     
// Ordernação da lista
    private void ordenar(){
        DefaultTableModel tm = (DefaultTableModel) this.tblListaUtilizadores.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaUtilizadores.setRowSorter(sorter);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraProcuraTxt;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaUtilizadores;
    // End of variables declaration//GEN-END:variables
}
