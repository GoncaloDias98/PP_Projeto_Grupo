/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackEnd;

import BackEnd.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Dados {

    private Utilizador utilizador;
    private Utilizador utilizadorLigado;
    private ListaUtilizadores utilizadores;
    private boolean utilizador_autenticado = false;

    private ArrayList<Utilizador> listaUtilizador;

    public Dados() {

        utilizadores = new ListaUtilizadores();
        listaUtilizador = new ArrayList<Utilizador>();

    }

    public ListaUtilizadores getListaUtilizadores() {
        return utilizadores;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Utilizador getUtilizadorLigado() {
        return utilizadorLigado;
    }

    public ArrayList<Utilizador> getListaUtilizador() {
        return listaUtilizador;
    }

    public void inserirUtilizador(Utilizador u) {
        listaUtilizador.add(u);

    }

    public void inicializar() {
        Utilizador u1 = new Utilizador("admin", "admin", "", "", "", "");
        inserirUtilizador(u1);
        Utilizador u2 = new Utilizador("1", "2", "", "", "", "");
        inserirUtilizador(u2);

    }

    public boolean login(String username, String password) {

        for (Utilizador u : listaUtilizador) {
            if (username.equals(u.getUser())) {
                if (password.equals(u.getPassword())) {
                    utilizador_autenticado = true;
                }
            }
        }

        return utilizador_autenticado;

    }

    public boolean isUtilizadorAutenticado() {
        return utilizador_autenticado;
    }

    public void setUtilizadorAutenticado(boolean autenticado) {
        this.utilizador_autenticado = autenticado;
    }

  public void Consultat(){
   
     for (Utilizador u : listaUtilizador) {
       u.Consulta();
         
     }
        
}

   
          
}
