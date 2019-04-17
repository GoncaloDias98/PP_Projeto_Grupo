
package BackEnd;

import java.util.ArrayList;


public class ListaGestor {
     private ArrayList<Gestor> arraylistgestor = new ArrayList<Gestor>();
    private Gestor gestor;
    
    
    
     public ArrayList<Gestor> getarraylistgestor() {
        return arraylistgestor;
    }

    public void setarraylistgestor(ArrayList<Gestor> arraylistgestor) {
        this.arraylistgestor = arraylistgestor;
    }

    public void inserirGestor(Gestor g) {
        arraylistgestor.add(g);
    }
   
    
    public void ConsultaGestor() {

        for (Gestor g : arraylistgestor) {
           g.ConsultaUtilizador();
        }
    }
}
