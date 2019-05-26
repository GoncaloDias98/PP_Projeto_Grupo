package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import javax.swing.JOptionPane;

public class ResgistarListaTarefas extends javax.swing.JDialog {

    private Sistema sistema;

    public ResgistarListaTarefas(Sistema sistema) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblListaTarefas = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProjeto = new javax.swing.JComboBox<>();
        lblProjeto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Nova Lista de Tarefas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Titulo");

        lblDescricao.setText("Descrição");

        lblListaTarefas.setText("Lista Tarefas");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblProjeto.setText("Projeto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblListaTarefas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(jLabel1)
                            .addComponent(lblProjeto))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGravar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblListaTarefas)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGravar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProjeto))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cmbProjeto.removeAllItems();
        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            if (sistema.getUtilizadorLigado().getUser().equals(p.getGestor().getUser())) {
                this.cmbProjeto.addItem(p.getTitulo());
            } else {
                for (int j = 0; j < p.getArraylistcolaborador().size(); j++) {

                    Colaborador c = p.getArraylistcolaborador().get(j);
                    if ((sistema.getUtilizadorLigado().getUser().equals(c.getUser()))) {
                        this.cmbProjeto.addItem(p.getTitulo());
                    }
                    //Utilizador toma o valor da posição do array !
                    System.out.println("Colaborador" + c.getUser());
                    System.out.println("Gestor" + p.getGestor().getUser());
                    System.out.println("Utilizador Ligado" + sistema.getUtilizadorLigado().getUser());

                }
            }

            //Adiciona o valor do utilizador e do nome na linha da tabela !
        }

        System.out.println(sistema.getListatarefasprojeto().numeroTarefaProjeto());
    }//GEN-LAST:event_formWindowOpened

    public void guardar() {
        if (this.cmbProjeto.getSelectedIndex()==-1) {
            JOptionPane.showMessageDialog(this, "Selecione um Projeto para alteração !",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            TarefasProjeto tp = new TarefasProjeto();
            ListaTarefasProjeto tmplist = new ListaTarefasProjeto();
             if (this.txtTitulo.getText().isEmpty()) {
                //Se tiver dá aviso !!
                JOptionPane.showMessageDialog(this, "Introduza p.f. o Título da Lista!");
                txtTitulo.requestFocus();
                return;
            }
              if (this.txtDescricao.getText().isEmpty()) {
                //Se tiver dá aviso !!
                JOptionPane.showMessageDialog(this, "Introduza p.f. uma Descrição!");
                txtDescricao.requestFocus();
                return;
            }
            int numtarefasprojeto = sistema.getListatarefasprojeto().numeroTarefaProjeto() + 1;
            String titulo = this.txtTitulo.getText();
            String descricao = this.txtDescricao.getText();
            String criadopor = sistema.getUtilizadorLigado().getUser();
            tp.setNumtarefaProjeto(numtarefasprojeto);
            tp.setTitulo(titulo);
            tp.setDescricao(descricao);
            tp.setCriadapor(criadopor);

            sistema.getListatarefasprojeto().inserirTarefasProjeto(tp);
            tmplist.getListaTarefasProjeto().add(tp);

            String projeto = this.cmbProjeto.getSelectedItem().toString();

            for (int j = 0; j < sistema.getListaprojetos().getListasProjeto().size(); j++) {
                //apanha o valor do array !
                Projeto p = sistema.getListaprojetos().getListasProjeto().get(j);
                //valida se o utilizador autenticado é gestor do projeto
                if (p.getTitulo().equals(projeto)) {

                    p.getArraylistalistatarefasprojeto().add(tp);
                }
            }

            //Guarda para ficheiro !!
            sistema.guardarObjectos();

            JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblListaTarefas;
    private javax.swing.JLabel lblProjeto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
