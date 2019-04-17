package BackEnd;

import java.util.ArrayList;

public class ListaProjetos implements java.io.Serializable {
    
    private Projeto projetos = new Projeto();
    private ArrayList<Projeto> arraylistaprojeto = new ArrayList<Projeto>();
    private Utilizador utilizador;
    private Gestor gestor;
    private Dados dados;

    public ArrayList<Projeto> getArraylistaprojeto() {
        return arraylistaprojeto;
    }

    public void setArraylistaprojeto(ArrayList<Projeto> arraylistaprojeto) {
        this.arraylistaprojeto = arraylistaprojeto;
    }

    public void inserirProjeto(Projeto p) {
        arraylistaprojeto.add(p);
    }
   
    
    public void ConsultaProjetos() {

        for (Projeto p : arraylistaprojeto) {
            p.ConsultaProjeto();
        }
    }
    
    public void alterarNomeProjeto(String titulo){
        projetos.setTitulo(titulo);
    }
    
    public void alterarDescricaoProjeto(String descricao){
        projetos.setDescricao(descricao);
    }
    

}
