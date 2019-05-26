package BackEnd;

import BackEnd.*;
import FrontEnd.*;

import java.util.ArrayList;

public class TarefasProjeto implements java.io.Serializable {

    private int numtarefaprojeto;
    private String titulo;
    private String descricao;
    private String criadapor;
    private ArrayList<Tarefa> listatarefas = new ArrayList<Tarefa>();
    
   

    public TarefasProjeto(int numtarefaprojeto, String titulo, String descricao, String criadapor, ArrayList<Tarefa> arraylistalistatarefas) {
        this.numtarefaprojeto =  numtarefaprojeto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.criadapor = criadapor;
        this.listatarefas = arraylistalistatarefas;
    }

    public TarefasProjeto() {
    }

    public int getNumtarefaProjeto() {
        return numtarefaprojeto;
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCriadapor() {
        return criadapor;
    }

    public void setCriadapor(String criadapor) {
        this.criadapor = criadapor;
    }

    public ArrayList<Tarefa> getArraylistalistatarefas() {
        return listatarefas;
    }

    public void setArraylistalistatarefas(ArrayList<Tarefa> arraylistalistatarefas) {
        this.listatarefas = arraylistalistatarefas;
    }

    public void setNumtarefaProjeto(int numtarefaprojeto) {
        this.numtarefaprojeto = numtarefaprojeto;
    }

    @Override
    public String toString() {
        return "TarefasProjeto{" + "numtarefaprojeto=" + numtarefaprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", criadapor=" + criadapor + ", listatarefas=" + listatarefas + '}';
    }

    
   

   
    public void consultaTarefasProjeto(){
        System.out.println("TarefasProjeto{" + "numtarefaprojeto=" + numtarefaprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", criadapor=" + criadapor + ", listatarefas=" + listatarefas );
    }

    
 
}
