package FrontEnd;

import FrontEnd.*;
import BackEnd.*;

import BackEnd.Utilizador;
import javax.swing.table.DefaultTableModel;

public class ListaTarefasProjeto extends javax.swing.JFrame {

    private Sistema sistema;

    public ListaTarefasProjeto(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        listarTarefasProjeto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        spUtilizadores = new javax.swing.JScrollPane();
        tblListaTarefasProjeto = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista de Tarefas do Projeto");

        jTextField1.setText("Numero do projeto");

        jButton1.setText("Selecione o projeto");

        tblListaTarefasProjeto.setModel(new javax.swing.table.DefaultTableModel(
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
        spUtilizadores.setViewportView(tblListaTarefasProjeto);

        btnCancelar.setText("Cancelar");
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
                .addGap(28, 28, 28)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spUtilizadores, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
 private void listarTarefasProjeto() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefasProjeto.getModel();
        //Cria as colunas abaixo na tabela
        tm.setColumnCount(0);
        tm.setRowCount(0);
        tm.addColumn("Titulo");
        tm.addColumn("Descrição");
        tm.addColumn("Criador");

        //Percorre o array de ulizadores até à ultima posição !
        for (int i = 0; i < sistema.getListatarefasprojeto().getListatarefasprojeto().size(); i++) {
            //Utilizador toma o valor da posição do array !
            TarefasProjeto tp = sistema.getListatarefasprojeto().getListatarefasprojeto().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            tm.addRow(new Object[]{tp.getTitulo(), tp.getDescricao(), tp.getCriadapor()});
        }
        this.tblListaTarefasProjeto.setModel(tm);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaTarefasProjeto;
    // End of variables declaration//GEN-END:variables
}
