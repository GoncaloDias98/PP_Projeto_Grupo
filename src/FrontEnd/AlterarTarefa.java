package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import javax.swing.JOptionPane;

public class AlterarTarefa extends javax.swing.JDialog {

    private Sistema sistema;
    private Tarefa tarefa;
    private Projeto projeto;
    private TarefasProjeto tarefasprojeto;

    public AlterarTarefa(Sistema sistema) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);

        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;

    }

    public AlterarTarefa(Sistema sistema, Projeto projeto, TarefasProjeto tarefasprojeto, Tarefa tarefa) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);

        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.tarefa = tarefa;
        this.projeto = projeto;
        this.tarefasprojeto = tarefasprojeto;
        carregar();
    }

    public void carregar() {
        this.ftxInicio.setText(sistema.Datatexto(tarefa.getDatainicio()));
        this.ftxFim.setText(sistema.Datatexto(tarefa.getDatafim()));
        this.txaDescricao.setText(tarefa.getDescricao());
        this.txtTitulo.setText(tarefa.getTitulo());
        this.cmbProjeto.addItem(projeto.getTitulo());
        this.cmbListaProjeto.addItem(tarefasprojeto.getTitulo());
        this.cmbEstado.setSelectedItem(tarefa.getEstadotarefa().getDescricao());
        this.cmbPrioridadeTarefas.setSelectedItem(tarefa.getPrioridade().getDescricao());
        this.txtNumero.setText(String.valueOf(tarefa.getNumtarefa()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel2 = new javax.swing.JLabel();
        cmbListaProjeto = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Alterar Tarefa");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Em Curso", "Concluído" }));

        lblEstado.setText("Estado");

        lblFim.setText("Data Fim");

        lblInicio.setText("Data Inicio");

        try {
            ftxFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
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

        jLabel2.setText("Lista Tarefas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblInicio)
                                    .addComponent(lblEstado)
                                    .addComponent(jLabel2))
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
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnF4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cmbListaProjeto, 0, 143, Short.MAX_VALUE)
                                                    .addComponent(cmbProjeto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(130, 130, 130)
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnGravar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbListaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (this.txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Selecione uma Tarefa para alteração !",
                    "Atenção", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String titulo = this.txtTitulo.getText();
            String descricao = this.txaDescricao.getText();
            String datainicio = this.ftxInicio.getText();
            String datafim = this.ftxFim.getText();

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
            if (this.cmbEstado.getSelectedItem() == sistema.getEstado().emcurso.getDescricao()) {
                //se for toma o valor Iniciado
                tarefa.setEstadotarefa(sistema.getEstado().emcurso);
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

            sistema.guardarObjectos();
            JOptionPane.showMessageDialog(null, "Alterado com Sucesso", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
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
        this.dispose();
        ListarTarefas listatarefas = new ListarTarefas(sistema);
        listatarefas.setVisible(true);

    }//GEN-LAST:event_btnF4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnF4;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbListaProjeto;
    private javax.swing.JComboBox<String> cmbPrioridadeTarefas;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
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
