package FrontEnd;

import FrontEnd.*;
import BackEnd.*;
import java.time.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashSet;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class RegistarProjeto extends javax.swing.JFrame {
   
    private Dados dados;
    private Estado estado;

    public RegistarProjeto(Dados dados) {
        initComponents();
        this.dados = dados;

    }

    @SuppressWarnings("unchecked")

    private void guardar() {

        Projeto novop = new Projeto();
        String titulo = this.txtTitulo.getText();
        String descricao = this.txaDescricao.getText();
        String datainicio = this.ftxInicio.getText();
        int numeroprojeto = dados.getListaprojetos().NumeroProjeto() + 1;
        
        
      
           novop.setNumprojeto(numeroprojeto);
        
        if (this.txtTitulo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. o titulo do Projeto!");
            txtTitulo.requestFocus();
            return;
        }
        
        if (this.txaDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. a descrição do Projeto!");
            txaDescricao.requestFocus();
            return;
        }
        
        if (this.ftxInicio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. a Data de Inicio Projeto!");
            ftxInicio.requestFocus();
            return;
        }
        Gestor g = new Gestor(dados.getUtilizadorLigado().getUser(), dados.getUtilizadorLigado().getPassword(), dados.getUtilizadorLigado().getNome(), dados.getUtilizadorLigado().getMorada(), dados.getUtilizadorLigado().getTelefone(), dados.getUtilizadorLigado().getEmail());
        novop.setGestor(g);
        
        //novop.setDatainicio(LocalDate.now());
        novop.setDatainicio(dados.Data(datainicio));
        
        
        novop.setTitulo(titulo);
        novop.setDescricao(descricao);
        
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().concluido.getDescricao()) {
            novop.setEstadoprojeto(dados.getEstado().concluido);
        }
        
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().iniciado.getDescricao()) {
           novop.setEstadoprojeto(dados.getEstado().iniciado);
        }
        
        if (this.cmbEstado.getSelectedItem() == dados.getEstado().naoiniciado.getDescricao()) {
            novop.setEstadoprojeto(dados.getEstado().naoiniciado);    
        }
        
        

        //COLOCAR O NUMERO DO PROJETO A SER SEQUENCIAL !!!!
        dados.getListaprojetos().inserirProjeto(novop);
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 204));
        jLabel10.setText("Registar Utilizador");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Registar Projeto");

        lblTitulo.setText("Titulo");

        lblDescricao.setText("Descrição");

        lblInicio.setText("Inicio");

        ftxInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        ftxInicio.setText("dd/mm/yyyy");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Iniciado", "Concluido" }));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricao)
                                    .addComponent(lblTitulo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInicio)
                                    .addComponent(lblEstado))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ftxInicio)
                                    .addComponent(cmbEstado, 0, 123, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel11)))
                .addContainerGap(46, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInicio)
                    .addComponent(ftxInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        guardar();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JFormattedTextField ftxInicio;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
