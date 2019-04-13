/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;
import BackEnd.*;
import BackEnd.ListaUtilizadores;
import FrontEnd.*;

/**
 *
 * @author User
 */
public class Inicio {
   
    

    public  static void main(String args[]) {
        Dados dados = new Dados();
        
        dados.inicializar();
      Login login = new Login(dados);
        login.setVisible(true);
        
    }
}