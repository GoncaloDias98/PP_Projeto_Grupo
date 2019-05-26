package FrontEnd;

import BackEnd.*;
import FrontEnd.*;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class AlterarPerfil extends javax.swing.JDialog {

    private Sistema sistema;

    public AlterarPerfil(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
         //Não permite o redimensionamento da janela
        this.setResizable(false);                        
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        
        this.setModal(true); 
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
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txaTelefone = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone = new javax.swing.text.MaskFormatter("(+###) ### ### ###");

            txaTelefone = new javax.swing.JFormattedTextField(telefone);
        }catch(Exception e){
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Perfil");
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
                    .addComponent(txtMorada)
                    .addComponent(txtNome)
                    .addComponent(txtUsername)
                    .addComponent(txtEmail)
                    .addComponent(txtPassword)
                    .addComponent(txaTelefone))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addComponent(btnGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCancelar)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
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
                    .addComponent(txaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        String username = sistema.getUtilizadorLigado().getUser();
        String password = sistema.getUtilizadorLigado().getPassword();
        String nome = sistema.getUtilizadorLigado().getNome();
        String morada = sistema.getUtilizadorLigado().getMorada();
        String email = sistema.getUtilizadorLigado().getEmail();
        String telefone = sistema.getUtilizadorLigado().getTelefone();

        this.txtUsername.setText(username);
        this.txtPassword.setText(password);
        this.txtNome.setText(nome);
        this.txtMorada.setText(morada);
        this.txaTelefone.setText(telefone);
        this.txtEmail.setText(email);


    }//GEN-LAST:event_formWindowActivated

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
if (new String(this.txtPassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. uma Password!");
            txtPassword.requestFocus();
            return;
        }
if (this.txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. o seu Nome!");
            txtNome.requestFocus();
            return;
        }

if (this.txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza p.f. o seu Email!");
            txtEmail.requestFocus();
            return;
        }

if (sistema.validaEmail(txtEmail.getText()) == false){
                    JOptionPane.showMessageDialog(null, "Email Errado", "Erro !", JOptionPane.INFORMATION_MESSAGE);
               txtEmail.requestFocus();
               return;
                }
        String username = this.txtUsername.getText();
        String password = new String(this.txtPassword.getPassword());
        String nome = this.txtNome.getText();
        String morada = this.txtMorada.getText();
        String email = this.txtEmail.getText();
        String telefone = this.txaTelefone.getText();

        //dados.getUtilizadorLigado().setUser(username);
        sistema.getUtilizadorLigado().setPassword(password);
        sistema.getUtilizadorLigado().setNome(nome);
        sistema.getUtilizadorLigado().setMorada(morada);
        sistema.getUtilizadorLigado().setTelefone(telefone);
        sistema.getUtilizadorLigado().setEmail(email);
        JOptionPane.showMessageDialog(this, "Perfil Alterado com sucesso !",
                "Alteração", JOptionPane.INFORMATION_MESSAGE);
        
        sistema.guardarObjectos();

    }//GEN-LAST:event_btnGravarActionPerformed

    private void lblCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_lblCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton lblCancelar;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblMorada;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JFormattedTextField txaTelefone;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMorada;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
