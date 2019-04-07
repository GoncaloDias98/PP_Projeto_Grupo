package Backend;

import java.time.LocalDate;

public class Projeto {

    private String titulo;
    int descrição;
    LocalDate dataInicio;
    LocalDate dataFim;
    ListaTarefasProjeto tarefas;
    Gestor gestor;
    Estado estadoProjeto;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDescrição() {
        return descrição;
    }

    public void setDescrição(int descrição) {
        this.descrição = descrição;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public ListaTarefasProjeto getTarefas() {
        return tarefas;
    }

    public void setTarefas(ListaTarefasProjeto tarefas) {
        this.tarefas = tarefas;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Estado getEstadoProjeto() {
        return estadoProjeto;
    }

    public void setEstadoProjeto(Estado estadoProjeto) {
        this.estadoProjeto = estadoProjeto;
    }

    

    
}
