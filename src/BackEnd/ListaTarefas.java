package BackEnd;

import BackEnd.*;
import java.time.LocalDate;
import java.util.*;

public class ListaTarefas implements java.io.Serializable {

    private Tarefa tarefa;
    private ArrayList<Tarefa> arraylistatarefa = new ArrayList<Tarefa>();
    private Utilizador utilizador;
    private Sistema sistema;

    public void inserirTarefa(Tarefa t) {
        arraylistatarefa.add(t);
    }

    public ArrayList<Tarefa> getListaTarefas() {
        return arraylistatarefa;
    }

    public void setListaTarefa(ArrayList<Tarefa> arraylistatarefa) {
        this.arraylistatarefa = arraylistatarefa;
    }

    public int numeroTarefa() {
        //inicializa o numero de tarefa a 0
        int numtarefa = 0;
        //percorre todo o array de tarefa 
        for (Tarefa t : arraylistatarefa) {
            //numero do tarefa toma o valor da tarefa
            numtarefa = t.getNumtarefa();
        }
        //retorna o ultimo numero da tarefa !!
        return numtarefa;
    }

    public void consultaTarefas() {

        for (Tarefa t : arraylistatarefa) {
            t.consultaTarefa();
        }
    }

}
