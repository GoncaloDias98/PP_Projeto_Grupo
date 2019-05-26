package BackEnd;

import java.time.LocalDate;

public class Tarefa implements java.io.Serializable {

    private int numtarefa;
    private String titulo;
    private Utilizador criadopor;
    private String descricao;
    private LocalDate datainicio;
    private LocalDate datafim;
    private Estado estadotarefa;
    private PrioridadeTarefas prioridade;
    
    

    public Tarefa() {
    }

    public Tarefa(int numtarefa, String titulo, Utilizador criadopor, String descricao, LocalDate datainicio, LocalDate datafim, Estado estadotarefa, PrioridadeTarefas prioridade) {
        this.numtarefa = numtarefa;
        this.titulo = titulo;
        this.criadopor = criadopor;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.estadotarefa = estadotarefa;
        this.prioridade = prioridade;
      
    }

   

  

    public int getNumtarefa() {
        return numtarefa;
    }

    public String getTitulo() {
        return titulo;
    }

    public Utilizador getCriadopor() {
        return criadopor;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public Estado getEstadotarefa() {
        return estadotarefa;
    }

    public PrioridadeTarefas getPrioridade() {
        return prioridade;
    }

 

  
    public void setNumtarefa(int numtarefa) {
        this.numtarefa = numtarefa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCriadopor(Utilizador criadopor) {
        this.criadopor = criadopor;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public void setEstadotarefa(Estado estadotarefa) {
        this.estadotarefa = estadotarefa;
    }

    public void setPrioridade(PrioridadeTarefas prioridade) {
        this.prioridade = prioridade;
    }

    public void consultaTarefa() {
        System.out.println("Tarefa{" + "numtarefa=" + numtarefa + ", titulo=" + titulo + ", criadopor=" + criadopor + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", estadotarefa=" + estadotarefa + ", prioridade=" + prioridade);
    }

    @Override
    public String toString() {
        return "Tarefa{" + "numtarefa=" + numtarefa + ", titulo=" + titulo + ", criadopor=" + criadopor + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", estadotarefa=" + estadotarefa + ", prioridade=" + prioridade + '}';
    }

}
