package Backend;

import java.util.*;

public class ListaUtilizadores {

    private List<Utilizador> lista_utilizador;

    public ListaUtilizadores() {
        lista_utilizador = new ArrayList<Utilizador>();
    }

    public void inserir(Utilizador u) {
        lista_utilizador.add(u);

    }

    public void listar() {
        for (Utilizador u : lista_utilizador) {
            u.Consulta();
        }
    }

    public void login(String username, String password) {
        for (Utilizador u : lista_utilizador) {

            if ((username.equals(u.getUser())) && (password.equals(u.getPassword()))) {
                System.out.println("Login com sucesso !");
            } else {
                System.out.println("Login Inválido");
            }

        }
    }
    
    public void alterarPerfil() {
        for (Utilizador u : lista_utilizador) {

            
        }
    }

}
