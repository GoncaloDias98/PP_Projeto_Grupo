package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ListaUtilizadores extends javax.swing.JFrame {

    private Sistema dados;

    public ListaUtilizadores(Sistema dados) {
        initComponents();
        this.dados = dados;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        spUtilizadores = new javax.swing.JScrollPane();
        tblListaUtilizadores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Utilizadores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btnCancelar)
                        .addGap(0, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spUtilizadores)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(spUtilizadores, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listarUtilizadores();
    }//GEN-LAST:event_formWindowActivated

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaUtilizadores;
    // End of variables declaration//GEN-END:variables
}
