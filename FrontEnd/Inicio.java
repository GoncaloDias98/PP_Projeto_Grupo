
package FrontEnd;
import BackEnd.*;
import BackEnd.ListaUtilizadores;
import FrontEnd.*;
import javax.swing.JOptionPane;

public class Inicio {
   
   

    //METODO MAIN - INICIO O PROGRAMA, CRIO O OBJETO DADOS , CHAMO A FUNCÃO INICIALIZAR E ABRO A JANELA DE LOGIN
    public  static void main(String args[]) {
        Dados dados = new Dados();
          try {
       dados.inicializar();
        
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(null,
                    String.format("Ocorreu um erro ao inicializar o sistema: %s.\nO programa será encerrado.",
                            ex.getMessage()),
                    "Erro fatal", JOptionPane.ERROR_MESSAGE);
            dados.terminar();
        
         }
      Login login = new Login(dados);
        login.setVisible(true);
        
     
    }
    //METODO MAIN - INICIO O PROGRAMA, CHAMO A FUNCÃO INICIALIZAR E ABRO A JANELA DE LOGIN
}