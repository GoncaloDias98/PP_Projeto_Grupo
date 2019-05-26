
package BackEnd;

import java.util.ArrayList;


public class ListaGestor {
     private ArrayList<Gestor> arraylistgestor = new ArrayList<Gestor>();
    private Gestor gestor;
    
    
    
     public ArrayList<Gestor> getListaGestor() {
        return arraylistgestor;
    }

    public void setListaGestor(ArrayList<Gestor> arraylistgestor) {
        this.arraylistgestor = arraylistgestor;
    }

    public void inserirGestor(Gestor g) {
        arraylistgestor.add(g);
    }
   
    
    public void consultaGestor() {

        for (Gestor g : arraylistgestor) {
           g.consultaUtilizador();
        }
    }
}
