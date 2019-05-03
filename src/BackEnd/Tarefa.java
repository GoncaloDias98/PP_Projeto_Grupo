package BackEnd;

import java.time.LocalDate;

public class Tarefa {

    private String Titulo;
    private Utilizador CriadoPor;
    private String Descrição;
    Estado EstadoTarefa;
    LocalDate DataFim;
    PrioridadeTarefas Prioridade;

    public Tarefa() {
    }

    public Tarefa(String Titulo, Utilizador CriadoPor, String Descrição, Estado EstadoTarefa, LocalDate DataFim, PrioridadeTarefas Prioridade) {
        this.Titulo = Titulo;
        this.CriadoPor = CriadoPor;
        this.Descrição = Descrição;
        this.EstadoTarefa = EstadoTarefa;
        this.DataFim = DataFim;
        this.Prioridade = Prioridade;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public Utilizador getCriadoPor() {
        return CriadoPor;
    }

    public void setCriadoPor(Utilizador CriadoPor) {
        this.CriadoPor = CriadoPor;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String Descrição) {
        this.Descrição = Descrição;
    }

    public Estado getEstadoTarefa() {
        return EstadoTarefa;
    }

    public void setEstadoTarefa(Estado EstadoTarefa) {
        this.EstadoTarefa = EstadoTarefa;
    }

    public LocalDate getDataFim() {
        return DataFim;
    }

    public void setDataFim(LocalDate DataFim) {
        this.DataFim = DataFim;
    }

    public PrioridadeTarefas getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(PrioridadeTarefas Prioridade) {
        this.Prioridade = Prioridade;
    }

    
    
}
