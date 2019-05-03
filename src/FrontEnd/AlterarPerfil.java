package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class AlterarPerfil extends javax.swing.JFrame {

    private Sistema dados;

    public AlterarPerfil(Sistema dados) {
        initComponents();
        this.dados = dados;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGravar = new javax.swing.JButton();
        lblCancelar = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMorada = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtMorada = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        lblCancelar.setText("Cancelar");
        lblCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCancelarActionPerformed(evt);
            }
        });

        lblUsername.setText("Username");
        lblUsername.setToolTipText("");

        lblPassword.setText("Password");

        lblNome.setText("Nome");

        lblMorada.setText("Morada");

        lblTelefone.setText("Telefone");

        lblEmail.setText("Email");

        txtUsername.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(lblEmail)
                    .addComponent(lblNome)
                    .addComponent(lblMorada)
                    .addComponent(lblPassword)
                    .addComponent(lblUsername))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefone)
                    .addComponent(txtMorada)
                    .addComponent(txtNome)
                    .addComponent(txtUsername)
                    .addComponent(txtEmail)
                    .addComponent(txtPassword))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCancelar)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMorada)
                    .addComponent(txtMorada))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(lblCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        String username = dados.getUtilizadorLigado().getUser();
        String password = dados.getUtilizadorLigado().getPassword();
        String nome = dados.getUtilizadorLigado().getNome();
        String morada = dados.getUtilizadorLigado().getMorada();
        String email = dados.getUtilizadorLigado().getEmail();
        String telefone = dados.getUtilizadorLigado().getTelefone();

        this.txtUsername.setText(username);
        this.txtPassword.setText(password);
        this.txtNome.setText(nome);
        this.txtMorada.setText(morada);
        this.txtTelefone.setText(telefone);
        this.txtEmail.setText(email);


    }//GEN-LAST:event_formWindowActivated

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed

        String username = this.txtUsername.getText();
        String password = new String(this.txtPassword.getPassword());
        String nome = this.txtNome.getText();
        String morada = this.txtMorada.getText();
        String email = this.txtEmail.getText();
        String telefone = this.txtTelefone.getText();

        //dados.getUtilizadorLigado().setUser(username);
        dados.getUtilizadorLigado().setPassword(password);
        dados.getUtilizadorLigado().setNome(nome);
        dados.getUtilizadorLigado().setMorada(morada);
        dados.getUtilizadorLigado().setTelefone(telefone);
        dados.getUtilizadorLigado().setEmail(email);
        JOptionPane.showMessageDialog(this, "Perfil Alterado com sucesso !",
                "Alteração", JOptionPane.INFORMATION_MESSAGE);
        
        dados.guardarObjectos();

    }//GEN-LAST:event_btnGravarActionPerformed

    private void lblCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_lblCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton lblCancelar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMorada;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}