package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class AlterarProjeto extends javax.swing.JFrame {

    private Sistema sistema;
    private Projeto projeto;

    public AlterarProjeto(Sistema sistema, Projeto projeto) {
        initComponents();
        this.sistema = sistema;
        this.projeto = projeto;
        carregar();

    }

    public AlterarProjeto(Sistema sistema) {
        initComponents();
        this.sistema = sistema;

    }

    private void carregar() {
        //Carrega para os objetos os sistema do projeto
        //Converte a data de inicio e data de fim para texto !!
        this.ftxInicio.setText(sistema.Datatexto(projeto.getDatainicio()));
        this.ftxFim.setText(sistema.Datatexto(projeto.getDatafim()));
        this.txaDescricao.setText(projeto.getDescricao());
        this.txtTitulo.setText(projeto.getTitulo());
        this.cmbEstado.setSelectedItem(projeto.getEstadoprojeto().getDescricao());
        this.txtNumero.setText(String.valueOf(projeto.getNumprojeto()));

        DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();
        tm.setRowCount(0);
        for (Colaborador c : projeto.getArraylistcolaborador()) {
            tm.addRow(new Object[]{c.getUser(), c.getNome()});
        }
        this.tblListaColaboradores.setModel(tm);
    }

    private void guardar() {

        //Cria as variáveis com os sistema dos objetos
        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        String datafim = this.ftxFim.getText();

        //valida se o campo Titulo está preenchido
        if (this.txtTitulo.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Introduza p.f. o titulo do Projeto!");
            txtTitulo.requestFocus();
            return;
        }
        //verifica se a descrição está preenchida
        if (this.txaDescricao.getText().isEmpty()) {
            //Se tiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Introduza p.f. a descrição do Projeto!");
            txaDescricao.requestFocus();
            return;
        }
        //Valida se a data de inicio está preenchida
        if (this.ftxInicio.getText().isEmpty()) {
            //Se estiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Introduza p.f. a Data de Inicio Projeto!");
            ftxInicio.requestFocus();
            return;
        }
        //Valida se a data de Fim está preenchida
        if (this.ftxFim.getText().isEmpty()) {
            //Se estiver dá aviso !!
            JOptionPane.showMessageDialog(this, "Introduza p.f. a Data de Fim Projeto!");
            ftxFim.requestFocus();
            return;
        }
        if (this.txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tem de escolher um projeto para ser alterado");
            ftxFim.requestFocus();
            return;
        } else {
            projeto.setNumprojeto(projeto.getNumprojeto());
        }
        projeto.setTitulo(titulo);
        projeto.setDescricao(descricao);

        if (sistema.Data(datainicio).isAfter(sistema.Data(datafim))) {
            JOptionPane.showMessageDialog(this, "Data de Inicio não pode ser posterior à Data de Fim");
            ftxInicio.requestFocus();
            return;

        }

        projeto.setDatainicio(sistema.Data(datainicio));
        projeto.setDatafim(sistema.Data(datafim));
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            projeto.setEstadoprojeto(sistema.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().iniciado.getDescricao()) {
            //se for toma o valor Iniciado
            projeto.setEstadoprojeto(sistema.getEstado().iniciado);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            projeto.setEstadoprojeto(sistema.getEstado().naoiniciado);
        }

        for (int i = 0; i < this.tblListaColaboradores.getRowCount(); i++) {
            DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();

            String user = tm.getValueAt(i, 0).toString();

            for (int j = 0; j < sistema.getListautilizadores().getArraylistautilizador().size(); j++) {
                //apanha o valor do array !
                Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(j);
                //valida se o utilizador autenticado é gestor do projeto
                if (u.getUser().equals(user)) {
                    Colaborador c = new Colaborador(u.getUser(), u.getPassword(), u.getNome(), u.getMorada(), u.getTelefone(), u.getEmail());
                    sistema.getListacolaboradores().inserirColaborador(c);
                }
            }
        }
        projeto.setArraylistcolaborador(sistema.getListacolaboradores().getarraylistcolaborador());

        sistema.guardarObjectos();
        JOptionPane.showMessageDialog(this, "Projeto Alterado com sucesso !",
                "Alteração", JOptionPane.INFORMATION_MESSAGE);
        //Guarda para ficheiro !!

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        cmbColaborador = new javax.swing.JComboBox<>();
        lblFim = new javax.swing.JLabel();
        ftxFim = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        spUtilizadores = new javax.swing.JScrollPane();
        tblListaColaboradores = new javax.swing.JTable();
        lblDescricao = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        ftxInicio = new javax.swing.JFormattedTextField();
        lblColaborador = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnF4 = new javax.swing.JButton();
        txtNumero = new javax.swing.JTextField();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AlterarProjeto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        lblFim.setText("Data Fim Projeto");

        ftxFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/Y"))));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Alterar Projeto");

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });

        tblListaColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Nome"
            }
        ));
        spUtilizadores.setViewportView(tblListaColaboradores);

        lblDescricao.setText("Descrição");

        lblInicio.setText("Data Inicio Projeto");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/Y"))));

        lblColaborador.setText("Colaboradores");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Iniciado", "Concluído" }));

        lblEstado.setText("Estado");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lblTitulo.setText("Titulo");

        btnF4.setText("F4");
        btnF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4ActionPerformed(evt);
            }
        });

        txtNumero.setEnabled(false);

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addGap(309, 309, 309))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblTitulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(260, 260, 260))
                            .addComponent(spUtilizadores, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInicio)
                                .addGap(18, 18, 18)
                                .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(lblFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblEstado)
                                .addGap(18, 18, 18)
                                .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblColaborador)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(btnAdicionar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRemover))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnF4)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnF4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstado)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFim)
                        .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblInicio)
                        .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColaborador)
                    .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();

        //Percorre o array de ulizadores até à ultima posição !
        for (int i = 0; i < sistema.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            if (this.cmbColaborador.getSelectedItem() == u.getUser()) {

                tm.addRow(new Object[]{u.getUser(), u.getNome()});

            }
        }

        this.tblListaColaboradores.setModel(tm);
        this.cmbColaborador.removeItem(cmbColaborador.getSelectedItem());

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4ActionPerformed
        ListaProjetos listaprojetos = new ListaProjetos(sistema);
        listaprojetos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnF4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cmbColaborador.removeAllItems();
        for (int i = 0; i < sistema.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            this.cmbColaborador.addItem(u.getUser());

        }

    }//GEN-LAST:event_formWindowOpened

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F4) {
            ListaProjetos listaprojetos = new ListaProjetos(sistema);
            listaprojetos.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_txtTituloKeyPressed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed

        DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();
        if (tblListaColaboradores.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um colaborador da Tabela !",
                    "Erro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            //VALIDA A LINHA SELECIONADA
            int row = tblListaColaboradores.getSelectedRow();
            // ADICIONA O VALOR DA COLUNA DO UTILIZADOR À COMBO
            this.cmbColaborador.addItem(tblListaColaboradores.getValueAt(row, 0).toString());
            //REMOVE DA TABELA A LINHA SELECIONADA
            tm.removeRow(tblListaColaboradores.getSelectedRow());
            //ATUALIZA A LISTA DE COLABORADORES
            this.tblListaColaboradores.setModel(tm);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnF4;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cmbColaborador;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaColaboradores;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
