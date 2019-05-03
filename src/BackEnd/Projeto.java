package BackEnd;
import BackEnd.*;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private Colaborador colaborador;
    private Estado estadoprojeto;
    private Sistema dados;
    private ArrayList<Colaborador> arraylistcolaborador = new ArrayList<Colaborador>();
    private ListaColaboradores listacolaboradores;
    

    //criação do Construtor
    public Projeto() {
    }

    //criação do construtor com titulo, descrição, data de inicio, gestor e estado . 
    //A data de fim e tarefas não fazem sentido na criação do projeto
//TROCAR ESTA LINHA PELA DEBAIXO , ESTÁ SÓ A DEBAIXO POR CAUSA DO UTILIZADOR E GESTOR !!!   
    public Projeto(int numprojeto, String titulo, String descricao, LocalDate datainicio,LocalDate datafim, Gestor gestor,ArrayList<Colaborador> arraylistcolaborador,ListaColaboradores listacolaboradores , Estado estadoprojeto) {
        // public Projeto(int numprojeto, String titulo, String descricao, LocalDate datainicio, Utilizador utilizador, Estado estadoprojeto) {
        this.numprojeto = numprojeto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.gestor = gestor;
        this.estadoprojeto = estadoprojeto;
        this.listacolaboradores = listacolaboradores;
        
        this.arraylistcolaborador = arraylistcolaborador;
    
        
    }

    public void setListacolaboradores(ListaColaboradores listacolaboradores) {
        this.listacolaboradores = listacolaboradores;
    }

    public ListaColaboradores getListacolaboradores() {
        return listacolaboradores;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Colaborador getColaborador() {
        return colaborador;
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

    public Gestor getGestor() {
        return gestor;
    }

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

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setEstadoprojeto(Estado estadoprojeto) {
        this.estadoprojeto = estadoprojeto;
    }

    public ArrayList<Colaborador> getArraylistcolaborador() {
        return arraylistcolaborador;
    }

    public void setArraylistcolaborador(ArrayList<Colaborador> arraylistcolaborador) {
        this.arraylistcolaborador = arraylistcolaborador;
    }
    
    public void inserirColaborador(Colaborador c) {
        arraylistcolaborador.add(c);
    }

    public void ConsultaProjeto() {

        System.out.println("Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ", Gestor=" + gestor + ", Colaborador=" + arraylistcolaborador + ", estadoprojeto=" + estadoprojeto);
    }
    //metodo To String 

    @Override
    public String toString() {
        return "Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ",  Gestor=" + gestor + ", estadoprojeto=" + estadoprojeto + '}';
    }

}
