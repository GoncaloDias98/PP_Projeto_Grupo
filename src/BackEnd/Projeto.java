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
    private TarefasProjeto tarefas;
    private Gestor gestor;
    private Utilizador utilizador;
    private Colaborador colaborador;
    private Estado estadoprojeto;
    private Sistema dados;
    private ArrayList<Colaborador> arraylistcolaborador = new ArrayList<Colaborador>();

    private TarefasProjeto listatarefasprojeto;
    private ArrayList<TarefasProjeto> arraylistalistatarefasprojeto = new ArrayList<TarefasProjeto>();

    //criação do Construtor
    public Projeto() {
    }

    public Projeto(int numprojeto, String titulo, String descricao, LocalDate datainicio, LocalDate datafim, Gestor gestor, ArrayList<Colaborador> arraylistcolaborador, ArrayList<TarefasProjeto> arraylistalistatarefasprojeto, Estado estadoprojeto) {

        this.numprojeto = numprojeto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.gestor = gestor;
        this.estadoprojeto = estadoprojeto;

        this.arraylistalistatarefasprojeto = arraylistalistatarefasprojeto;
        this.arraylistcolaborador = arraylistcolaborador;

    }

    public ArrayList<TarefasProjeto> getArraylistalistatarefasprojeto() {
        return arraylistalistatarefasprojeto;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    //Metodos GET !!
    public int getNumProjeto() {
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

    public LocalDate getDataFim() {
        return datafim;
    }

    public TarefasProjeto getTarefas() {
        return tarefas;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public Estado getEstadoProjeto() {
        return estadoprojeto;
    }

    //Metodos SET !
    public void setNumProjeto(int numprojeto) {
        this.numprojeto = numprojeto;
    }

    public void setArrayListaListaTarefasProjeto(ArrayList<TarefasProjeto> arraylistalistatarefasprojeto) {
        this.arraylistalistatarefasprojeto = arraylistalistatarefasprojeto;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDataInicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public void setDataFim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public void setTarefas(TarefasProjeto tarefas) {
        this.tarefas = tarefas;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public void setEstadoProjeto(Estado estadoprojeto) {
        this.estadoprojeto = estadoprojeto;
    }

    public ArrayList<Colaborador> getArraylistColaborador() {
        return arraylistcolaborador;
    }

    public void setArraylistColaborador(ArrayList<Colaborador> arraylistcolaborador) {
        this.arraylistcolaborador = arraylistcolaborador;
    }

    public void inserirColaborador(Colaborador c) {
        arraylistcolaborador.add(c);
    }

    public void consultaProjeto() {

        System.out.println("Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ", gestor=" + gestor + ", utilizador=" + utilizador + ", colaborador=" + colaborador + ", estadoprojeto=" + estadoprojeto + ", dados=" + dados + ", arraylistcolaborador=" + arraylistcolaborador + ", listatarefasprojeto=" + listatarefasprojeto + ", arraylistalistatarefasprojeto=" + arraylistalistatarefasprojeto);
    }
    //metodo To String 

    @Override
    public String toString() {
        return "Projeto{" + "numprojeto=" + numprojeto + ", titulo=" + titulo + ", descricao=" + descricao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", tarefas=" + tarefas + ", gestor=" + gestor + ", utilizador=" + utilizador + ", colaborador=" + colaborador + ", estadoprojeto=" + estadoprojeto + ", dados=" + dados + ", arraylistcolaborador=" + arraylistcolaborador + ", listatarefasprojeto=" + listatarefasprojeto + ", arraylistalistatarefasprojeto=" + arraylistalistatarefasprojeto + '}';
    }

    

}
