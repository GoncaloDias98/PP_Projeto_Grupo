
package BackEnd;

import java.util.ArrayList;


public class ListaTarefasProjeto {
       private ArrayList<TarefasProjeto> listatarefasprojeto = new ArrayList<TarefasProjeto>();
       
  
    private Sistema sistema;

    public ArrayList<TarefasProjeto> getListatarefasprojeto() {
        return listatarefasprojeto;
    }

    public int NumeroTarefaProjeto() {
        //inicializa o numero de tarefa a 0
        int numtarefaprojeto = 0;
        //percorre todo o array de tarefa 
        for (TarefasProjeto tp : listatarefasprojeto) {
            //numero do tarefa toma o valor da tarefa
            numtarefaprojeto = tp.getNumtarefaProjeto();
        }
        //retorna o ultimo numero da tarefa !!
        return numtarefaprojeto;
    }
    
    public void setListatarefasprojeto(ArrayList<TarefasProjeto> listatarefasprojeto) {
        this.listatarefasprojeto = listatarefasprojeto;
    }
    
    
    
     public void inserirTarefasProjeto(TarefasProjeto t) {
        listatarefasprojeto.add(t);
    }
     
         public void listaconsulta() {

        for (TarefasProjeto p : listatarefasprojeto) {
            p.consultaTarefasProjeto();
        }
    }

}
