package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import javax.swing.JOptionPane;


public class AlterarTarefa extends javax.swing.JDialog {

    private Sistema sistema;
    private Tarefa tarefa;

    public AlterarTarefa(Sistema sistema) {
        initComponents();
         //Não permite o redimensionamento da janela
        this.setResizable(false);      
        this.setModal(true); 
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;

    }

    public AlterarTarefa(Sistema sistema, Tarefa tarefa) {
        initComponents();
         //Não permite o redimensionamento da janela
        this.setResizable(false);    
        this.setModal(true); 
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.tarefa = tarefa;
        carregar();
    }

    public void carregar(){
         this.ftxInicio.setText(sistema.Datatexto(tarefa.getDatainicio()));
        this.ftxFim.setText(sistema.Datatexto(tarefa.getDatafim()));
        this.txaDescricao.setText(tarefa.getDescricao());
        this.txtTitulo.setText(tarefa.getTitulo());
       /* this.cmbProjeto.setSelectedItem(tarefa.getProjeto().getTitulo());*/
        this.cmbEstado.setSelectedItem(tarefa.getEstadotarefa().getDescricao());
        this.cmbPrioridadeTarefas.setSelectedItem(tarefa.getPrioridade().getDescricao());
        this.txtNumero.setText(String.valueOf(tarefa.getNumtarefa()));

       
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAlterarTarefa = new javax.swing.JLabel();
        cmbProjeto = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        ftxFim = new javax.swing.JFormattedTextField();
        ftxInicio = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        cmbPrioridadeTarefas = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        lblPrioridade = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        txtNumero = new javax.swing.JTextField();
        btnF4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblAlterarTarefa.setText("Alterar Tarefa");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Iniciado", "Concluído" }));

        lblEstado.setText("Estado");

        lblFim.setText("Data Fim");

        lblInicio.setText("Data Inicio");

        ftxFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftxFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxFimActionPerformed(evt);
            }
        });

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftxInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxInicioActionPerformed(evt);
            }
        });

        jLabel1.setText("Projeto");

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

        lblTitulo.setText("Titulo");

        cmbPrioridadeTarefas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        lblDescricao.setText("Descrição");

        lblPrioridade.setText("Prioridade");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        txtNumero.setEnabled(false);

        btnF4.setText("F4");
        btnF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTitulo)
                                .addComponent(lblDescricao)
                                .addComponent(jLabel1)
                                .addComponent(lblInicio)
                                .addComponent(lblEstado))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblPrioridade)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblFim)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnF4))))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(btnGravar)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblAlterarTarefa)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarTarefa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo)
                    .addComponent(btnF4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFim)
                        .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInicio)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrioridade)
                    .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGravar))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxInicioActionPerformed

    }//GEN-LAST:event_ftxInicioActionPerformed

    public void gravar() {


        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        String datafim = this.ftxFim.getText();

        //JComboBox comboBox = new JComboBox(sistema.getListautilizadores());
        //verifica qual o numero do projeto e soma + 1 
        //int numerotarefa = sistema.getListatarefas().NumeroTarefa() + 1;
        //O numero do Projeto toma o valor da variavel numeroprojeto
        //tarefa.setNumtarefa(numerotarefa);

        if (sistema.Data(datainicio).isAfter(sistema.Data(datafim))) {
            JOptionPane.showMessageDialog(this, "Data de Inicio não pode ser posterior à Data de Fim");
            ftxInicio.requestFocus();
            return;

        } else {

            tarefa.setDatainicio(sistema.Data(datainicio));
            tarefa.setDatafim(sistema.Data(datafim));
        }

        tarefa.setTitulo(titulo);
        tarefa.setDescricao(descricao);
        tarefa.setCriadopor(sistema.getUtilizadorLigado());

        //Verifica se o valor da combo Estado é igual à descrição do Estado Concluído
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            tarefa.setEstadotarefa(sistema.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().iniciado.getDescricao()) {
            //se for toma o valor Iniciado
            tarefa.setEstadotarefa(sistema.getEstado().iniciado);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            tarefa.setEstadotarefa(sistema.getEstado().naoiniciado);
        }

        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Alta
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().alta.getDescricao()) {
            //se for toma o valor Alta
            tarefa.setPrioridade(sistema.getPrioridadestarefas().alta);
        }
        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Média
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().media.getDescricao()) {
            //se for toma o valor Média
            tarefa.setPrioridade(sistema.getPrioridadestarefas().media);
        }
        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Baixa
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().baixa.getDescricao()) {
            //se for toma o valor Baixa
            tarefa.setPrioridade(sistema.getPrioridadestarefas().baixa);
        }

      /*  for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            //apanha o valor do array !
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);

            if (this.cmbProjeto.getSelectedItem() == p.getTitulo()) {
                tarefa.setProjeto(p);
            }
        }*/

        
        sistema.guardarObjectos();
        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);

    }

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4ActionPerformed
       ListarTarefas listatarefas = new ListarTarefas(sistema);
        listatarefas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnF4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cmbProjeto.removeAllItems();
        for (int i = 0; i < sistema.getListaprojetos().getArraylistaprojeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getArraylistaprojeto().get(i);
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
    }//GEN-LAST:event_formWindowOpened

    private void ftxFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxFimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnF4;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbPrioridadeTarefas;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlterarTarefa;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPrioridade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
