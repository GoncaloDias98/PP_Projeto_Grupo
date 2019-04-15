package BackEnd;

import BackEnd.*;
import java.util.*;

public class ListaUtilizadores implements java.io.Serializable {

    private ArrayList<Utilizador> arraylistautilizador = new ArrayList<Utilizador>();
    private Utilizador utilizador;
    private boolean existeutilizador = false;

    public void setArraylistautilizador(ArrayList<Utilizador> arraylistautilizador) {
        this.arraylistautilizador = arraylistautilizador;
    }

    public void inserirUtilizador(Utilizador u) {
        arraylistautilizador.add(u);

    }

    public ArrayList<Utilizador> getArraylistautilizador() {
        return arraylistautilizador;
    }

    public boolean isExisteutilizador() {
        return existeutilizador;
    }

    public void setExisteutilizador(boolean existeutilizador) {
        this.existeutilizador = existeutilizador;
    }

    public void ConsultaUtilizadores() {

        for (Utilizador u : arraylistautilizador) {
            u.ConsultaUtilizador();
        }
    }

    public boolean ExisteUtilizador(String username) {
        existeutilizador=false;
        for (Utilizador u : arraylistautilizador) {
            //verifica se o utilizador do login é igual ao utilizador do array
            if (username.equals(u.getUser())) {
                existeutilizador = true;
            }
        }
        return existeutilizador;
    }

    @Override
    public String toString() {
        return "ListaUtilizadores{" + utilizador.getNome();
    }
}
