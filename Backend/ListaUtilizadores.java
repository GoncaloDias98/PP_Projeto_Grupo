package Backend;

import java.util.*;

public class ListaUtilizadores {

private List<Utilizador> lista_utilizador;

public ListaUtilizadores()
{
    lista_utilizador = new ArrayList<Utilizador>();		
}

public void inserir(Utilizador u)
{
    lista_utilizador.add(u);

}

public void listar()
{
    for (Utilizador u:lista_utilizador)
    {
        u.Consulta();
    }
}
}
