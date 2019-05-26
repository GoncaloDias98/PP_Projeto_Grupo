package FrontEnd;

import FrontEnd.*;
import BackEnd.*;

import BackEnd.Utilizador;
import javax.swing.table.DefaultTableModel;

public class ListarTarefasProjeto extends javax.swing.JDialog {

    private Sistema sistema;

    public ListarTarefasProjeto(Sistema sistema) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        listarTarefasProjeto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spUtilizadores = new javax.swing.JScrollPane();
        tblListaTarefasProjeto = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Lista de Tarefas");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spUtilizadores, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(btnCancelar)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        tm.addColumn("Projeto");

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                for (int j = 0; j < sistema.getListatarefasprojeto().getListaTarefasProjeto().size(); j++) {
                    //apanha o valor do array !

                    TarefasProjeto tp = sistema.getListatarefasprojeto().getListaTarefasProjeto().get(j);
                    for (TarefasProjeto tptemp : p.getArraylistalistatarefasprojeto()) {
                        if (tp.getNumtarefaProjeto() == tptemp.getNumtarefaProjeto()) {
                            tm.addRow(new Object[]{tp.getTitulo(), tp.getDescricao(), tp.getCriadapor(), p.getTitulo()});

                        }

                    }
                    this.tblListaTarefasProjeto.setModel(tm);
                }
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (sistema.getUtilizadorLigado().getUser().equals(c.getUser())) {
                        tm.addRow(new Object[]{p.getNumprojeto(), p.getTitulo(), p.getGestor().getUser(), p.getDatainicio(), p.getDatafim(), p.getEstadoprojeto().getDescricao()});

                    }

                    //se for gestor mostra na linha, senão for, passa à frente !!
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaTarefasProjeto;
    // End of variables declaration//GEN-END:variables
}
