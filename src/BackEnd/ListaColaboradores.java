
package BackEnd;



import java.util.ArrayList;

public class ListaColaboradores {
   private ArrayList<Colaborador> arraylistcolaborador = new ArrayList<Colaborador>();
    private Colaborador colaborador;
    
    
    
     public ArrayList<Colaborador> getarraylistcolaborador() {
        return arraylistcolaborador;
    }

    public void setarraylistcolaborador(ArrayList<Colaborador> arraylistcolaborador) {
        this.arraylistcolaborador = arraylistcolaborador;
    }

    public void inserirColaborador(Colaborador c) {
        arraylistcolaborador.add(c);
    }
   
    public void limparArrayColaboradores() {
    arraylistcolaborador.clear();
}
    
    public void ConsultaColaborador() {

        for (Colaborador c : arraylistcolaborador) {
           c.ConsultaUtilizador();
        }
    }
}
