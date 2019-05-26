package BackEnd;

import java.util.ArrayList;

public class ListaColaboradores {

    private ArrayList<Colaborador> arraylistcolaborador = new ArrayList<Colaborador>();
    private Colaborador colaborador;

    public ArrayList<Colaborador> getListasColaboradores() {
        return arraylistcolaborador;
    }

    public void setListasColaboradores(ArrayList<Colaborador> arraylistcolaborador) {
        this.arraylistcolaborador = arraylistcolaborador;
    }

    public void inserirColaborador(Colaborador c) {
        arraylistcolaborador.add(c);
    }

    public void limparListasColaboradores() {
        arraylistcolaborador.clear();
    }

    public void consultaColaborador() {

        for (Colaborador c : arraylistcolaborador) {
            c.ConsultaUtilizador();
        }
    }
}
