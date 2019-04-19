package BackEnd;

import java.time.LocalDate;

public class Projeto implements java.io.Serializable {

    //Declaração das variáveis
    private int numprojeto;
    private String titulo;
    private String descricao;
    private LocalDate datainicio;
    private LocalDate datafim;
    private ListaTarefasProjeto tarefas;
//ALTERAR O UTILIZADOR PELO GESTOR !!!!! VER COMO SE FAZ     
    private Gestor gestor;
    private Utilizador utilizador;
    private Estado estadoprojeto;

    //criação do Construtor
    public Projeto() {
    }

    //criação do construtor com titulo, descrição, data de inicio, gestor e estado . 
    //A data de fim e tarefas não fazem sentido na criação do projeto
//TROCAR ESTA LINHA PELA DEBAIXO , ESTÁ SÓ A DEBAIXO POR CAUSA DO UTILIZADOR E GESTOR !!!   
// public Projeto(int numprojeto,String titulo, String descricao, LocalDate datainicio, Gestor gestor, Estado estadoprojeto) {
    public Projeto(int numprojeto, String titulo, String descricao, LocalDate datainicio, Utilizador utilizador, Estado estadoprojeto) {
        this.numprojeto = numprojeto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.datainicio = datainicio;
//ALTERAR ESTA LINHA PELA DEBAIXO , ESTÁ ASSIM POR CAUSA DO GESTOR E UTILIZADOR        
//this.gestor = gestor;
        this.utilizador = utilizador;
        this.estadoprojeto = estadoprojeto;
    }

    //Metodos GET !!
    public int getNumprojeto() {
        return numprojeto;
    }

    public void setUtilizador(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    public Utilizador getUtilizador() {
        return utilizador;
    }

    public String getTitulo() {
        return titulo;
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

    public ListaTarefasProjeto getTarefas() {
        return tarefas;
    }

    /* public Gestor getGestor() {
        return gestor;
    }
     */
    public Estado getEstadoprojeto() {
        return estadoprojeto;
    }

    //Metodos SET !
    public void setNumprojeto(int numprojeto) {
        this.numprojeto = numprojeto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public void setTarefas(ListaTarefasProjeto tarefas) {
        this.tarefas = tarefas;
    }

    /*
    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }
     */
    public void setEstadoprojeto(Estado estadoprojeto) {
        this.estadoprojeto = estadoprojeto;
    }

    public void ConsultaProjeto() {

        System.out.println("Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ", utilizador=" + utilizador + ", estadoprojeto=" + estadoprojeto);
    }
    //metodo To String 

    @Override
    public String toString() {
        return "Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ",  utilizador=" + utilizador + ", estadoprojeto=" + estadoprojeto + '}';
    }

}
