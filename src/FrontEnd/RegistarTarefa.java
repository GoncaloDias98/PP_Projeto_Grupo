package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.time.LocalDate;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class RegistarTarefa extends javax.swing.JDialog {

    private Sistema sistema;
    private Estado estado;
    private PrioridadeTarefas prioridadetarefas;

    public RegistarTarefa(Sistema sistema) {
        initComponents();
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        this.setModal(true);
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.sistema = sistema;
        this.ftxInicio.setText(sistema.Datatexto(LocalDate.now()));
        this.ftxFim.setText(sistema.Datatexto(LocalDate.now()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        ftxFim = new javax.swing.JFormattedTextField();
        ftxInicio = new javax.swing.JFormattedTextField();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbPrioridadeTarefas = new javax.swing.JComboBox<>();
        lblPrioridade = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbProjeto = new javax.swing.JComboBox<>();
        cmbListaTarefas = new javax.swing.JComboBox<>();
        lblListaTarefas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SoftProject - Nova Tarefa");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setText("Titulo");

        lblDescricao.setText("Descrição");

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

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

        cmbPrioridadeTarefas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        lblPrioridade.setText("Prioridade");

        jLabel1.setText("Projeto");

        cmbProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProjetoActionPerformed(evt);
            }
        });

        lblListaTarefas.setText("Lista de Tarefas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addComponent(lblDescricao)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInicio)
                                    .addComponent(lblEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblPrioridade)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblFim)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbProjeto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(110, 110, 110)
                                .addComponent(lblListaTarefas)
                                .addGap(18, 18, 18)
                                .addComponent(cmbListaTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cmbListaTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblListaTarefas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitulo))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFim)
                            .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPrioridade)
                            .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnGravar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxInicioActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        gravar();
    }//GEN-LAST:event_btnGravarActionPerformed
    public void gravar() {

        Tarefa novat = new Tarefa();
        TarefasProjeto tmplist = new TarefasProjeto();

        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        String datafim = this.ftxFim.getText();

        //JComboBox comboBox = new JComboBox(sistema.getListautilizadores());
        //verifica qual o numero do projeto e soma + 1 
        int numerotarefa = sistema.getListatarefas().numeroTarefa() + 1;
        //O numero do Projeto toma o valor da variavel numeroprojeto
        novat.setNumTarefa(numerotarefa);

        if (this.cmbProjeto.getSelectedIndex() == -1) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione um Projeto!");
            return;
        }

        if (this.cmbListaTarefas.getSelectedIndex() == -1) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione uma Lista de tarefas!");
            return;
        }

        if (this.txtTitulo.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione um Título!");
            txtTitulo.requestFocus();
            return;
        }

        if (this.txaDescricao.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione uma Descrição!");
            txaDescricao.requestFocus();
            return;
        }

        if (this.ftxInicio.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione a Data de Inicio da tarefa!");
            ftxInicio.requestFocus();
            return;
        }

        if (this.ftxFim.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Selecione a Data de fim da tarefa!");
            ftxFim.requestFocus();
            return;
        }

        if (sistema.Data(datainicio).isAfter(sistema.Data(datafim))) {
            JOptionPane.showMessageDialog(this, "Data de Inicio não pode ser posterior à Data de Fim");
            ftxInicio.requestFocus();
            return;

        } else {

            novat.setDataInicio(sistema.Data(datainicio));
            novat.setDataFim(sistema.Data(datafim));
        }

        novat.setTitulo(titulo);
        novat.setDescricao(descricao);
        novat.setCriadoPor(sistema.getUtilizadorLigado());

        //Verifica se o valor da combo Estado é igual à descrição do Estado Concluído
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            novat.setEstadoTarefa(sistema.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().emcurso.getDescricao()) {
            //se for toma o valor Iniciado
            novat.setEstadoTarefa(sistema.getEstado().emcurso);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            novat.setEstadoTarefa(sistema.getEstado().naoiniciado);
        }

        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Alta
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().alta.getDescricao()) {
            //se for toma o valor Alta
            novat.setPrioridade(sistema.getPrioridadestarefas().alta);
        }
        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Média
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().media.getDescricao()) {
            //se for toma o valor Média
            novat.setPrioridade(sistema.getPrioridadestarefas().media);
        }
        //Verifica se o valor da combo Prioridade é igual à descrição da Prioridade Baixa
        if (this.cmbPrioridadeTarefas.getSelectedItem() == sistema.getPrioridadestarefas().baixa.getDescricao()) {
            //se for toma o valor Baixa
            novat.setPrioridade(sistema.getPrioridadestarefas().baixa);
        }

        sistema.getListatarefas().inserirTarefa(novat);

        tmplist.getArraylistalistatarefas().add(novat);

        String tarefaprojeto = this.cmbListaTarefas.getSelectedItem().toString();

        for (int j = 0; j < sistema.getListatarefasprojeto().getListaTarefasProjeto().size(); j++) {
            //apanha o valor do array !
            TarefasProjeto tp = sistema.getListatarefasprojeto().getListaTarefasProjeto().get(j);
            //valida se o utilizador autenticado é gestor do projeto
            if (tp.getTitulo().equals(tarefaprojeto)) {

                tp.getArraylistalistatarefas().add(novat);
            }
        }
        sistema.guardarObjectos();
        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);

    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cmbProjeto.removeAllItems();
        this.cmbListaTarefas.removeAllItems();
        this.cmbProjeto.addItem("");
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

                }
            }

            //Adiciona o valor do utilizador e do nome na linha da tabela !
        }


    }//GEN-LAST:event_formWindowOpened

    private void cmbProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProjetoActionPerformed
        this.cmbListaTarefas.removeAllItems();

        for (int i = 0; i < sistema.getListaprojetos().getListasProjeto().size(); i++) {
            Projeto p = sistema.getListaprojetos().getListasProjeto().get(i);
            if (cmbProjeto.getSelectedItem().equals(p.getTitulo())) {
                for (TarefasProjeto tp : p.getArraylistalistatarefasprojeto()) {

                    this.cmbListaTarefas.addItem(tp.getTitulo());

                }
            }
        }
    }//GEN-LAST:event_cmbProjetoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbListaTarefas;
    private javax.swing.JComboBox<String> cmbPrioridadeTarefas;
    private javax.swing.JComboBox<String> cmbProjeto;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblListaTarefas;
    private javax.swing.JLabel lblPrioridade;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
