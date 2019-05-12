package BackEnd;
import BackEnd.*;
import java.time.LocalDate;
import java.util.*;

public class ListaTarefas {

    private Tarefa tarefa;
    private ArrayList<Tarefa> arraylistatarefa = new ArrayList<Tarefa>();
    private Utilizador utilizador;
    private Sistema sistema;
    
    public void InserirTarefa(Tarefa t){
        arraylistatarefa.add(t);   
    }

    public ArrayList<Tarefa> getArraylistatarefa() {
        return arraylistatarefa;
    }

    public void setArraylistatarefa(ArrayList<Tarefa> arraylistatarefa) {
        this.arraylistatarefa = arraylistatarefa;
    }
    
    public int NumeroTarefa() {
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
   
   
    
    
}
