package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.time.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class RegistarProjeto extends javax.swing.JFrame {

    private Dados dados;
    private Estado estado;
    private ListaUtilizadores listautilizadores;
    

    //Cria as colunas abaixo na tabela
    public RegistarProjeto(Dados dados) {
        initComponents();
        this.dados = dados;
        	
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);

        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);

        //O processo de fecho da janela será controlado pelo programa
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")

    private void guardar() {
          
        //Declara as variáveis necessárias à criação do Projeto
        Projeto novop = new Projeto();
        
        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        String datafim = this.ftxFim.getText();
        //JComboBox comboBox = new JComboBox(dados.getListautilizadores());
        //verifica qual o numero do projeto e soma + 1 
        int numeroprojeto = dados.getListaprojetos().NumeroProjeto() + 1;
        //O numero do Projeto toma o valor da variavel numeroprojeto
        novop.setNumprojeto(numeroprojeto);

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

        //Cria o Gestor do projeot com os dados do utilizadorLigado !!
        Gestor g = new Gestor(dados.getUtilizadorLigado().getUser(), dados.getUtilizadorLigado().getPassword(), dados.getUtilizadorLigado().getNome(), dados.getUtilizadorLigado().getMorada(), dados.getUtilizadorLigado().getTelefone(), dados.getUtilizadorLigado().getEmail());
        novop.setGestor(g);

        //novop.setDatainicio(LocalDate.now());
        novop.setDatainicio(dados.Data(datainicio));
        novop.setDatafim(dados.Data(datafim));

        novop.setTitulo(titulo);
        novop.setDescricao(descricao);
        //Verifica se o valor da combo Estado é igual à descrição do Estado Concluído
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            novop.setEstadoprojeto(dados.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().iniciado.getDescricao()) {
            //se for toma o valor Iniciado
            novop.setEstadoprojeto(dados.getEstado().iniciado);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            novop.setEstadoprojeto(dados.getEstado().naoiniciado);
        }
        
        for (int i = 0; i < this.tblListaColaboradores.getRowCount(); i++) {
            DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();

            String user = tm.getValueAt(i, 0).toString();

            for (int j = 0; j < dados.getListautilizadores().getArraylistautilizador().size(); j++) {
                //apanha o valor do array !
                Utilizador u = dados.getListautilizadores().getArraylistautilizador().get(j);
                //valida se o utilizador autenticado é gestor do projeto
                if (u.getUser().equals(user)) {
                    Colaborador c = new Colaborador(u.getUser(), u.getPassword(), u.getNome(), u.getMorada(), u.getTelefone(), u.getEmail());
                    dados.getListacolaboradores().inserirColaborador(c);
                }
            }
        }
        
        novop.setArraylistcolaborador(dados.getListacolaboradores().getarraylistcolaborador());
        
        //Insere os dados do projeto com o valor de novop !!!
        dados.getListaprojetos().inserirProjeto(novop);
        //Guarda para ficheiro !!
        dados.guardarObjectos();
        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);
      

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        ftxInicio = new javax.swing.JFormattedTextField();
        cmbEstado = new javax.swing.JComboBox<>();
        lblEstado = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        lblColaborador = new javax.swing.JLabel();
        cmbColaborador = new javax.swing.JComboBox<>();
        lblFim = new javax.swing.JLabel();
        ftxFim = new javax.swing.JFormattedTextField();
        spUtilizadores = new javax.swing.JScrollPane();
        tblListaColaboradores = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Registar Utilizador");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Registar Projeto");

        lblTitulo.setText("Titulo");

        lblDescricao.setText("Descrição");

        lblInicio.setText("Data Inicio Projeto");

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftxInicio.setText("dd/mm/yyyy");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Iniciado", "Concluído" }));

        lblEstado.setText("Estado");

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

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        lblColaborador.setText("Colaboradores");

        lblFim.setText("Data Fim Projeto");

        ftxFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftxFim.setText("dd/mm/yyyy");

        tblListaColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Nome"
            }
        ));
        spUtilizadores.setViewportView(tblListaColaboradores);

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spUtilizadores, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColaborador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnAdicionar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInicio)
                        .addGap(18, 18, 18)
                        .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(lblEstado)
                        .addGap(18, 18, 18)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(txtTitulo))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(331, 331, 331))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(333, 333, 333))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(btnAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel mod = new DefaultComboBoxModel();
        for (int i = 0; i < dados.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = dados.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            mod.addElement(u.getUser());

        }
        this.cmbColaborador.setModel(mod);


    }//GEN-LAST:event_formWindowOpened

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();

        //Percorre o array de ulizadores até à ultima posição !
        for (int i = 0; i < dados.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = dados.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            if (this.cmbColaborador.getSelectedItem() == u.getUser()) {

                tm.addRow(new Object[]{u.getUser(), u.getNome()});

            }
        }

        this.tblListaColaboradores.setModel(tm);

    }//GEN-LAST:event_btnAdicionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbColaborador;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
