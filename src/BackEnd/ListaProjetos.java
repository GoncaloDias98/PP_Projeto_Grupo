package BackEnd;

import java.util.ArrayList;

public class ListaProjetos implements java.io.Serializable {

    private ArrayList<Projeto> arraylistaprojeto = new ArrayList<Projeto>();
    private Utilizador utilizador;
    private Gestor gestor;
    
    

    public ArrayList<Projeto> getListasProjeto() {
        return arraylistaprojeto;
    }

    public void setListasProjeto(ArrayList<Projeto> arraylistaprojeto) {
        this.arraylistaprojeto = arraylistaprojeto;
    }

    public void inserirProjeto(Projeto p) {
        arraylistaprojeto.add(p);
    }

    public void consultaProjetos() {

        for (Projeto p : arraylistaprojeto) {
            p.consultaProjeto();
        }
    }

    public int numeroProjeto() {
        //inicializa o numero de projeto a 0
        int numeroprojeto = 0;
        //percorre todo o array de projetos 
        for (Projeto p : arraylistaprojeto) {
            //numero do projeto toma o valor do projeto
            numeroprojeto = p.getNumProjeto();
        }
        //retorna o ultimo numero de projeto !!
        return numeroprojeto;
    }
}
