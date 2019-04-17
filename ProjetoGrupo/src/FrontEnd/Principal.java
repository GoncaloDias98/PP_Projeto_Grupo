
package FrontEnd;
import BackEnd.*;
import FrontEnd.*;

public class Principal extends javax.swing.JFrame {
    private Dados dados;

    public Principal(Dados dados) {
        initComponents();
        this.dados = dados;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnteste = new javax.swing.JButton();
        txtteste = new javax.swing.JTextField();
        lblteste = new javax.swing.JLabel();
        btnAlterarPerfil = new javax.swing.JButton();
        btnListaUtilizador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnteste.setText("teste");
        btnteste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntesteActionPerformed(evt);
            }
        });

        lblteste.setText("Utilizador Ligado");

        btnAlterarPerfil.setText("Alterar Perfil");
        btnAlterarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarPerfilActionPerformed(evt);
            }
        });

        btnListaUtilizador.setText("Listar Utilizadores");
        btnListaUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaUtilizadorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("GETÃO DE PROJETOS");

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblteste)
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnteste)
                            .addComponent(txtteste, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAlterarPerfil)
                        .addGap(18, 18, 18)
                        .addComponent(btnListaUtilizador)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtteste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblteste))
                .addGap(18, 18, 18)
                .addComponent(btnteste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterarPerfil)
                    .addComponent(btnListaUtilizador)
                    .addComponent(btnGravar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntesteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntesteActionPerformed

        this.txtteste.setText(dados.getUtilizadorLigado().getUser()); 
    }//GEN-LAST:event_btntesteActionPerformed

    private void btnAlterarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarPerfilActionPerformed
          AlterarPerfil alterarperfil = new AlterarPerfil(dados);
        alterarperfil.setVisible(true);
    }//GEN-LAST:event_btnAlterarPerfilActionPerformed

    private void btnListaUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaUtilizadorActionPerformed
        ListaUtilizadores listautilizadores = new ListaUtilizadores(dados);
        listautilizadores.setVisible(true);
    }//GEN-LAST:event_btnListaUtilizadorActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        dados.guardarObjectos();
    }//GEN-LAST:event_btnGravarActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarPerfil;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnListaUtilizador;
    private javax.swing.JButton btnteste;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblteste;
    private javax.swing.JTextField txtteste;
    // End of variables declaration//GEN-END:variables
}
