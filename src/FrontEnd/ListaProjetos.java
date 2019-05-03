package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListaProjetos extends javax.swing.JFrame {

    private Sistema dados;

    public ListaProjetos(Sistema dados) {
        initComponents();
        this.dados = dados;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spProjetos = new javax.swing.JScrollPane();
        tblListaProjetos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        txtTeste = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
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

        jLabel1.setText("Projetos");

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        txtTeste.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(433, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAlterar)
                        .addGap(36, 36, 36)
                        .addComponent(btnCancelar)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(342, 342, 342))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(spProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(txtTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 434, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAlterar)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(spProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(31, Short.MAX_VALUE)))
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
        for (int i = 0; i < dados.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !

            Projeto p = dados.getListaprojetos().getArraylistaprojeto().get(i);
            //valida se o utilizador autenticado é gestor do projeto
            if (dados.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                //se for gestor mostra na linha, senão for, passa à frente !!
                tm.addRow(new Object[]{p.getNumprojeto(), p.getTitulo(), p.getGestor().getUser(), p.getDatainicio(), p.getDatafim(), p.getEstadoprojeto().getDescricao()});
            } else {
                for (Colaborador c : p.getArraylistcolaborador()) {
                    if (dados.getUtilizadorLigado().getUser().equals(c.getUser())) {
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

        for (int i = 0; i < dados.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !
            Projeto p = dados.getListaprojetos().getArraylistaprojeto().get(i);
            //valida se o utilizador autenticado é gestor do projeto
            if (p.getNumprojeto() == numprojeto) {
                projeto = p;

                AlterarProjeto alterarprojeto = new AlterarProjeto(dados, projeto);
               // alterarprojeto.setExtendedState(alterarprojeto.MAXIMIZED_BOTH);
                // alterarprojeto.setSize(Toolkit.getDefaultToolkit().getScreenSize());  
                alterarprojeto.setVisible(true);
                alterarprojeto.setResizable(false);
                this.dispose();
            }

            /* if (dados.getUtilizadorLigado() instanceof Gestor){
        AlterarProjeto alterarprojeto = new AlterarProjeto(dados, projeto);
        alterarprojeto.setVisible(true);
        this.dispose();
           }else{
                JOptionPane.showMessageDialog(null, "Não tem permissões !", "Erro !", JOptionPane.INFORMATION_MESSAGE);
           }*/
        }


    }//GEN-LAST:event_btnAlterarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane spProjetos;
    private javax.swing.JTable tblListaProjetos;
    private javax.swing.JTextField txtTeste;
    // End of variables declaration//GEN-END:variables
}
