/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrontEnd;

import Backend.ListaUtilizadores;
import Backend.Utilizador;



/**
 *
 * @author User
 */
public class Login {
    
    public static void main(String[] args)
    {
                ListaUtilizadores lu = new ListaUtilizadores();
		Utilizador u1 = new Utilizador("Paulo" , "123","Paulo","Rua xpto","916498954","info.paulolopes@gmail.com");
                lu.inserir(u1);
			
		lu.listar();
                
                
    }
    
    
    
}
