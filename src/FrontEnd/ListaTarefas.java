package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import javax.swing.JOptionPane;

public class ListaTarefas extends javax.swing.JFrame {

    private Sistema sistema;
    private String a;
    int atraso = 0;

    public ListaTarefas(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        ordenar();
    }

    public void listaTarefas() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
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
            //apanha o valor do array !

            Tarefa t = sistema.getListatarefas().getArraylistatarefa().get(i);
            //se for gestor mostra na linha, senão for, passa à frente !!
            tm.addRow(new Object[]{t.getProjeto().getNumprojeto(), t.getProjeto().getTitulo(), t.getNumtarefa(), t.getTitulo(), t.getDatainicio(), t.getDatafim(), t.getEstadotarefa().getDescricao()});

            //------------------------------------PROJETO EM ATRASO     ------------------------------
            a = new SimpleDateFormat("dd/MM/YYYY").format(new Date());
            if ((sistema.Datatexto(t.getDatafim())).compareTo(a) < 0) {
                ++atraso;
            }
            this.tblListaTarefa.setModel(tm);
        }
        // entra em loop infinito com a interface
      // JOptionPane.showMessageDialog(this, "tens "+ atraso +" tarefas em atraso");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spTarefas = new javax.swing.JScrollPane();
        tblListaTarefa = new javax.swing.JTable();
        lblListaTarefas = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        barraProcuraTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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

        lblListaTarefas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblListaTarefas.setText("ListaTarefas");

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

        jButton1.setText("Lista Tarefas Em Atraso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 372, Short.MAX_VALUE)
                .addComponent(lblListaTarefas)
                .addGap(358, 358, 358))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblListaTarefas)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barraProcuraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(378, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(spTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
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
        int numtarefa = tm.getValueAt(numlinha, 2).hashCode();

        for (int i = 0; i < sistema.getListatarefas().getArraylistatarefa().size(); i++) {
            //apanha o valor do array !
            Tarefa t = sistema.getListatarefas().getArraylistatarefa().get(i);
            //valida se o utilizador autenticado é gestor do projeto
            if (t.getNumtarefa() == numtarefa) {
                tarefa = t;

                AlterarTarefa alterartarefa = new AlterarTarefa(sistema, tarefa);
                alterartarefa.setVisible(true);
                alterartarefa.setResizable(false);
                this.dispose();
            }

        }
    }//GEN-LAST:event_btnAlterarActionPerformed
    //--Barra de Procura
    private void barraProcura(String query) {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }

    private void barraProcuraTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barraProcuraTxtKeyReleased
        String query = barraProcuraTxt.getText().toLowerCase();
        barraProcura(query);

    }//GEN-LAST:event_barraProcuraTxtKeyReleased

    private void barraProcuraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraProcuraTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barraProcuraTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ListaTarefasAtraso listatarefasprojeto = new ListaTarefasAtraso(sistema);
        listatarefasprojeto.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    //FIM Barra de Procura--

// Ordernação da lista
    private void ordenar() {
        DefaultTableModel tm = (DefaultTableModel) this.tblListaTarefa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(tm);
        tblListaTarefa.setRowSorter(sorter);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraProcuraTxt;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblListaTarefas;
    private javax.swing.JScrollPane spTarefas;
    private javax.swing.JTable tblListaTarefa;
    // End of variables declaration//GEN-END:variables
}
