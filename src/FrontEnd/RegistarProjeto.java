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
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class RegistarProjeto extends javax.swing.JDialog {

    private Sistema sistema;
    private Estado estado;
    private ListarUtilizadores listautilizadores;
    private int numprojeto;
    private Projeto projemedicao;
    private TarefasProjeto tpemedicao;
    

    //Cria as colunas abaixo na tabela
    public RegistarProjeto(Sistema sistema) {
        initComponents();
        this.setModal(true);
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);

        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);

        this.sistema = sistema;
        this.ftxInicio.setText(sistema.Datatexto(LocalDate.now()));
        this.ftxFim.setText(sistema.Datatexto(LocalDate.now()));
        this.jplcriacaorapida.hide();
        this.jpnListaTarefas.hide();
        this.jpnTarefas.hide();

        //O processo de fecho da janela será controlado pelo programa
        //  this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")

    private void guardar() {
Projeto novop = new Projeto();
projemedicao = novop;
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

        //Declara as variáveis necessárias à criação do Projeto
        ListaColaboradores tmplist = new ListaColaboradores();
        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        String datafim = this.ftxFim.getText();
        //JComboBox comboBox = new JComboBox(sistema.getListautilizadores());
        //verifica qual o numero do projeto e soma + 1 
        int numeroprojeto = sistema.getListaprojetos().NumeroProjeto() + 1;
        numprojeto = numeroprojeto;
        //O numero do Projeto toma o valor da variavel numeroprojeto
        novop.setNumprojeto(numeroprojeto);

        //Cria o Gestor do projeot com os sistema do utilizadorLigado !!
        Gestor g = new Gestor(sistema.getUtilizadorLigado().getUser(), sistema.getUtilizadorLigado().getPassword(), sistema.getUtilizadorLigado().getNome(), sistema.getUtilizadorLigado().getMorada(), sistema.getUtilizadorLigado().getTelefone(), sistema.getUtilizadorLigado().getEmail());
        novop.setGestor(g);

        if (sistema.Data(datainicio).isAfter(sistema.Data(datafim))) {
            JOptionPane.showMessageDialog(this, "Data de Inicio não pode ser posterior à Data de Fim");
            ftxInicio.requestFocus();
            return;

        } else {

            novop.setDatainicio(sistema.Data(datainicio));
            novop.setDatafim(sistema.Data(datafim));
        }

        novop.setTitulo(titulo);
        novop.setDescricao(descricao);
        //Verifica se o valor da combo Estado é igual à descrição do Estado Concluído
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            novop.setEstadoprojeto(sistema.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().emcurso.getDescricao()) {
            //se for toma o valor Iniciado
            novop.setEstadoprojeto(sistema.getEstado().emcurso);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            novop.setEstadoprojeto(sistema.getEstado().naoiniciado);
        }

        DefaultTableModel tm = (DefaultTableModel) this.tblListaColaboradores.getModel();

        for (int i = 0; i < this.tblListaColaboradores.getRowCount(); i++) {

            String user = tm.getValueAt(i, 0).toString();

            for (int j = 0; j < sistema.getListautilizadores().getArraylistautilizador().size(); j++) {
                //apanha o valor do array !
                Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(j);
                //valida se o utilizador autenticado é gestor do projeto
                if (u.getUser().equals(user)) {
                    Colaborador c = new Colaborador(u.getUser(), u.getPassword(), u.getNome(), u.getMorada(), u.getTelefone(), u.getEmail());
                    tmplist.inserirColaborador(c);
                }
            }
        }

        novop.setArraylistcolaborador(tmplist.getarraylistcolaborador());

        //Insere os sistema do projeto com o valor de novop !!!
        sistema.getListaprojetos().inserirProjeto(novop);
        tm.setRowCount(0);
        sistema.getListacolaboradores().limparArrayColaboradores();
        //Guarda para ficheiro !!
        sistema.guardarObjectos();
        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);
        if (JOptionPane.showConfirmDialog(null,
                "Deseja criar Lista de Tarefas ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.jplcriacaorapida.setVisible(true);
            this.jpnListaTarefas.setVisible(true);
            this.jpnTarefas.setVisible(false);
        } else {

            this.dispose();
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
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
        btnRemover = new javax.swing.JButton();
        jplcriacaorapida = new javax.swing.JPanel();
        jpnListaTarefas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTituloLTarefa = new javax.swing.JTextField();
        txtDescricaoLTarefa = new javax.swing.JTextField();
        btnAddListaTarefas = new javax.swing.JButton();
        jpnTarefas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTituloTarefa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaDescricaoTarefa = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ftxDataInicioTarefa = new javax.swing.JFormattedTextField();
        ftxDataFimTarefa = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbEstadoTarefa = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbPrioridadeTarefas = new javax.swing.JComboBox<>();
        btnTarefas = new javax.swing.JButton();
        LblListaTarefa = new javax.swing.JLabel();
        lblTarefa = new javax.swing.JLabel();

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Registar Utilizador");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Novo Projeto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setText("Titulo");

        lblDescricao.setText("Descrição");

        lblInicio.setText("Data Inicio:");

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        ftxInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxInicioActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Em Curso", "Concluído" }));

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

        lblColaborador.setText("Associar Colaborador");

        lblFim.setText("Data Fim:");

        ftxFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/y"))));
        ftxFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxFimActionPerformed(evt);
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

        btnAdicionar.setText("+");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("-");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        jplcriacaorapida.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpnListaTarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnListaTarefas.setToolTipText("Lista Tarefas");
        jpnListaTarefas.setName("Lista Tarefas"); // NOI18N

        jLabel1.setText("Titulo");

        jLabel2.setText("Descrição");

        btnAddListaTarefas.setText("Adicionar");
        btnAddListaTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddListaTarefasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnListaTarefasLayout = new javax.swing.GroupLayout(jpnListaTarefas);
        jpnListaTarefas.setLayout(jpnListaTarefasLayout);
        jpnListaTarefasLayout.setHorizontalGroup(
            jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnListaTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnListaTarefasLayout.createSequentialGroup()
                        .addGroup(jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTituloLTarefa)
                            .addComponent(txtDescricaoLTarefa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnListaTarefasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddListaTarefas)))
                .addContainerGap())
        );
        jpnListaTarefasLayout.setVerticalGroup(
            jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnListaTarefasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTituloLTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnListaTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricaoLTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnAddListaTarefas)
                .addContainerGap())
        );

        jpnTarefas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpnTarefas.setToolTipText("Lista Tarefas");
        jpnTarefas.setName("Lista Tarefas"); // NOI18N

        jLabel3.setText("Titulo");

        jLabel4.setText("Descrição");

        txaDescricaoTarefa.setColumns(20);
        txaDescricaoTarefa.setRows(5);
        jScrollPane2.setViewportView(txaDescricaoTarefa);

        jLabel5.setText("Data Inicio");

        jLabel6.setText("Data Fim");

        ftxDataInicioTarefa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        ftxDataFimTarefa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        jLabel7.setText("Estado");

        cmbEstadoTarefa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Em Curso", "Concluído" }));

        jLabel8.setText("Prioridade");

        cmbPrioridadeTarefas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Média", "Baixa" }));

        btnTarefas.setText("Adicionar");
        btnTarefas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarefasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnTarefasLayout = new javax.swing.GroupLayout(jpnTarefas);
        jpnTarefas.setLayout(jpnTarefasLayout);
        jpnTarefasLayout.setHorizontalGroup(
            jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTarefasLayout.createSequentialGroup()
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTarefasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(jpnTarefasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addGroup(jpnTarefasLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnTarefasLayout.createSequentialGroup()
                        .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftxDataInicioTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbEstadoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftxDataFimTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTarefasLayout.createSequentialGroup()
                        .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtTituloTarefa))
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTarefasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTarefas)
                .addContainerGap())
        );
        jpnTarefasLayout.setVerticalGroup(
            jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTarefasLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTituloTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ftxDataInicioTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ftxDataFimTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbEstadoTarefa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnTarefasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbPrioridadeTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTarefas)
                .addContainerGap())
        );

        LblListaTarefa.setText("Lista de Tarefas +");
        LblListaTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblListaTarefaMouseClicked(evt);
            }
        });

        lblTarefa.setText("Tarefa +");
        lblTarefa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTarefaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jplcriacaorapidaLayout = new javax.swing.GroupLayout(jplcriacaorapida);
        jplcriacaorapida.setLayout(jplcriacaorapidaLayout);
        jplcriacaorapidaLayout.setHorizontalGroup(
            jplcriacaorapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplcriacaorapidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplcriacaorapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnListaTarefas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jplcriacaorapidaLayout.createSequentialGroup()
                        .addGroup(jplcriacaorapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblListaTarefa)
                            .addComponent(lblTarefa))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jplcriacaorapidaLayout.setVerticalGroup(
            jplcriacaorapidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplcriacaorapidaLayout.createSequentialGroup()
                .addComponent(LblListaTarefa)
                .addGap(14, 14, 14)
                .addComponent(jpnListaTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTarefa)
                .addGap(18, 18, 18)
                .addComponent(jpnTarefas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao)
                    .addComponent(lblTitulo)
                    .addComponent(lblInicio)
                    .addComponent(lblEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnGravar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnCancelar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spUtilizadores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblColaborador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(btnAdicionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemover))
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jplcriacaorapida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdicionar, btnRemover});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jplcriacaorapida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitulo)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDescricao)
                                .addGap(136, 136, 136)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblInicio)
                                    .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblEstado)
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblFim)
                                    .addComponent(ftxFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblColaborador)
                                    .addComponent(cmbColaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAdicionar)
                                    .addComponent(btnRemover))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spUtilizadores, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnGravar)
                                    .addComponent(btnCancelar))
                                .addContainerGap(18, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdicionar, btnRemover});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {

            guardar();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    String.format("Ocorreu um erro ao inicializar o sistema: %s.\nO programa será encerrado.",
                            ex.getMessage()),
                    "Erro fatal", JOptionPane.ERROR_MESSAGE);
            sistema.terminar();

        }


    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "Deseja Sair ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            this.dispose();
        }

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.cmbColaborador.removeAllItems();
        for (int i = 0; i < sistema.getListautilizadores().getArraylistautilizador().size(); i++) {
            //Utilizador toma o valor da posição do array !
            Utilizador u = sistema.getListautilizadores().getArraylistautilizador().get(i);
            //Adiciona o valor do utilizador e do nome na linha da tabela !
            this.cmbColaborador.addItem(u.getUser());

        }


    }//GEN-LAST:event_formWindowOpened

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

    private void ftxInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxInicioActionPerformed

    }//GEN-LAST:event_ftxInicioActionPerformed

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

    private void ftxFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxFimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxFimActionPerformed

    private void btnAddListaTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddListaTarefasActionPerformed
        guardarListaTarefa();
    }//GEN-LAST:event_btnAddListaTarefasActionPerformed

    private void btnTarefasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarefasActionPerformed
        guardarTarefa();
    }//GEN-LAST:event_btnTarefasActionPerformed

    private void LblListaTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblListaTarefaMouseClicked
        if (this.jpnListaTarefas.isVisible()) {
            this.LblListaTarefa.setText("Lista de Tarefas +");
            this.jpnListaTarefas.setVisible(false);
        } else {
            this.LblListaTarefa.setText("Lista de Tarefas -");
            this.jpnListaTarefas.setVisible(true);

        }
    }//GEN-LAST:event_LblListaTarefaMouseClicked

    private void lblTarefaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTarefaMouseClicked
        if (this.jpnTarefas.isVisible()) {
            this.lblTarefa.setText("Tarefa +");
            this.jpnTarefas.setVisible(false);
        } else {
            this.lblTarefa.setText("Tarefa -");
            this.jpnTarefas.setVisible(true);

        }
    }

    public void guardarListaTarefa() {
TarefasProjeto tp = new TarefasProjeto();
tpemedicao = tp;
        ListaTarefasProjeto tmplist = new ListaTarefasProjeto();
        int numtarefasprojeto = sistema.getListatarefasprojeto().NumeroTarefaProjeto() + 1;
        String titulo = this.txtTituloLTarefa.getText();
        String descricao = this.txtDescricaoLTarefa.getText();
        String criadopor = sistema.getUtilizadorLigado().getUser();
        tp.setNumtarefaProjeto(numtarefasprojeto);
        tp.setTitulo(titulo);
        tp.setDescricao(descricao);
        tp.setCriadapor(criadopor);

        sistema.getListatarefasprojeto().inserirTarefasProjeto(tp);
        tmplist.getListatarefasprojeto().add(tp);

        projemedicao.getArraylistalistatarefasprojeto().add(tp);

        //Guarda para ficheiro !!
        sistema.guardarObjectos();

        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);

        if (JOptionPane.showConfirmDialog(null,
                "Deseja criar Tarefas para esta Lista ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.btnAddListaTarefas.setVisible(false);
            this.jpnTarefas.setVisible(true);
            this.ftxDataInicioTarefa.setText(sistema.Datatexto(LocalDate.now()));
        this.ftxDataFimTarefa.setText(sistema.Datatexto(LocalDate.now()));

        } else if (JOptionPane.showConfirmDialog(null,
                "Deseja criar nova Lista de Tarefas ?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            limparListaTarefas();
            this.btnAddListaTarefas.setVisible(true);
            this.jpnTarefas.setVisible(false);
        } else {

            this.dispose();
        }


    }//GEN-LAST:event_lblTarefaMouseClicked
    public void guardarTarefa() {

        Tarefa novat = new Tarefa();
        TarefasProjeto tmplist = new TarefasProjeto();

        String titulo = this.txtTituloTarefa.getText();
        String descricao = this.txaDescricaoTarefa.getText();
        String datainicio = this.ftxDataInicioTarefa.getText();
        String datafim = this.ftxDataFimTarefa.getText();
        

        //JComboBox comboBox = new JComboBox(sistema.getListautilizadores());
        //verifica qual o numero do projeto e soma + 1 
        int numerotarefa = sistema.getListatarefas().NumeroTarefa() + 1;
        //O numero do Projeto toma o valor da variavel numeroprojeto
        novat.setNumtarefa(numerotarefa);

        if (sistema.Data(datainicio).isAfter(sistema.Data(datafim))) {
            JOptionPane.showMessageDialog(this, "Data de Inicio não pode ser posterior à Data de Fim");
            ftxInicio.requestFocus();
            return;

        } else {

            novat.setDatainicio(sistema.Data(datainicio));
            novat.setDatafim(sistema.Data(datafim));
        }

        novat.setTitulo(titulo);
        novat.setDescricao(descricao);
        novat.setCriadopor(sistema.getUtilizadorLigado());

        //Verifica se o valor da combo Estado é igual à descrição do Estado Concluído
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().concluido.getDescricao()) {
            //se for toma o valor Concluido
            novat.setEstadotarefa(sistema.getEstado().concluido);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().emcurso.getDescricao()) {
            //se for toma o valor Iniciado
            novat.setEstadotarefa(sistema.getEstado().emcurso);
        }
        //Verifica se o valor da combo Estado é igual à descrição do Estado Não Iniciado
        if (this.cmbEstado.getSelectedItem() == sistema.getEstado().naoiniciado.getDescricao()) {
            //se for toma o valor Não Iniciado
            novat.setEstadotarefa(sistema.getEstado().naoiniciado);
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

        sistema.getListatarefas().InserirTarefa(novat);

        tmplist.getArraylistalistatarefas().add(novat);

        tpemedicao.getArraylistalistatarefas().add(novat);

        sistema.guardarObjectos();
        JOptionPane.showMessageDialog(null, "Registado", "Sucesso !", JOptionPane.INFORMATION_MESSAGE);
        
        
 if (JOptionPane.showConfirmDialog(null,
                "Deseja criar mais Tarefas ?",
                "Continuar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.btnAddListaTarefas.setVisible(false);
            this.jpnTarefas.setVisible(true);
limparTarefas();
        } else if (JOptionPane.showConfirmDialog(null,
                "Deseja criar nova Lista de Tarefas ?",
                "Continuar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            limparListaTarefas();
            limparTarefas();
            this.btnAddListaTarefas.setVisible(true);
            this.jpnTarefas.setVisible(false);
        } else {

            this.dispose();
        }
    }

    public void limparListaTarefas() {
        this.txtTituloLTarefa.setText("");
        this.txtDescricaoLTarefa.setText("");
    }
    
     public void limparTarefas() {
        this.txtTituloTarefa.setText("");
        this.txaDescricaoTarefa.setText("");
        this.ftxDataInicioTarefa.setText(sistema.Datatexto(LocalDate.now()));
        this.ftxDataFimTarefa.setText(sistema.Datatexto(LocalDate.now()));
        this.cmbEstadoTarefa.setSelectedIndex(0);
        this.cmbPrioridadeTarefas.setSelectedIndex(0);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblListaTarefa;
    private javax.swing.JButton btnAddListaTarefas;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnTarefas;
    private javax.swing.JComboBox<String> cmbColaborador;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbEstadoTarefa;
    private javax.swing.JComboBox<String> cmbPrioridadeTarefas;
    private javax.swing.JFormattedTextField ftxDataFimTarefa;
    private javax.swing.JFormattedTextField ftxDataInicioTarefa;
    private javax.swing.JFormattedTextField ftxFim;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jplcriacaorapida;
    private javax.swing.JPanel jpnListaTarefas;
    private javax.swing.JPanel jpnTarefas;
    private javax.swing.JLabel lblColaborador;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTarefa;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane spUtilizadores;
    private javax.swing.JTable tblListaColaboradores;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextArea txaDescricaoTarefa;
    private javax.swing.JTextField txtDescricaoLTarefa;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtTituloLTarefa;
    private javax.swing.JTextField txtTituloTarefa;
    // End of variables declaration//GEN-END:variables
}
