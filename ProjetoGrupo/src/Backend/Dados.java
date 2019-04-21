package BackEnd;

import BackEnd.*;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Dados implements java.io.Serializable {

    //VARIÁVEIS OBJETOS
    // CAMINHO DO FICHEIRO !!!!
    public static final String FICHEIRO_UTILIZADORES = "C:/Users/User/Desktop/Paulo/Universidade/Paradigmas/Projeto Grupo/utilizadores.dat";
    public static final String FICHEIRO_PROJETOS = "C:/Users/User/Desktop/Paulo/Universidade/Paradigmas/Projeto Grupo/projetos.dat";

    private Utilizador utilizador;
    private Utilizador utilizadorligado;
    private Colaborador colaborador;
    private Gestor gestor;
    private Estado estado;
    private PrioridadeTarefas prioridadestarefas;
    private Projeto projeto;
    private Tarefa tarefa;

    private ListaUtilizadores listautilizadores;
    private ListaColaboradores listacolaboradores;
    private ListaGestor listagestor;
    private ListaProjetos listaprojetos;
    private ListaTarefas listatarefas;
    private ListaTarefasProjeto listatarefasprojeto;

    private ArrayList<Colaborador> arraylistacolaborador;

    private boolean utilizador_autenticado = false;

    //FIM VARIÁVEIS OBJETOS
    //CONSTRUTOR , INICIAR OS OBJETOS
    public Dados() {

        listautilizadores = new ListaUtilizadores();
        listacolaboradores = new ListaColaboradores();
        listagestor = new ListaGestor();

        listaprojetos = new ListaProjetos();
        listatarefas = new ListaTarefas();
        listatarefasprojeto = new ListaTarefasProjeto();
        listaprojetos = new ListaProjetos();
        listatarefas = new ListaTarefas();
        listatarefasprojeto = new ListaTarefasProjeto();

        // arraylistacolaborador = new ArrayList<Colaborador>();
        if (!new File(FICHEIRO_UTILIZADORES).exists()) {
            //inicializaManual();
            guardarObjectos();
        } else {
            lerObjectos();
        }

    }
// FIM CONTRUTOR

    //GET DOS OBJETOS !!!
    public Utilizador getUtilizador() {
        return utilizador;
    }

    public Utilizador getUtilizadorLigado() {
        return utilizadorligado;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public Estado getEstado() {
        return estado;
    }

    public PrioridadeTarefas getPrioridadestarefas() {
        return prioridadestarefas;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public ListaUtilizadores getListautilizadores() {
        return listautilizadores;
    }

    public ListaColaboradores getListacolaboradores() {
        return listacolaboradores;
    }

    public ListaGestor getListagestor() {
        return listagestor;
    }

    public ListaProjetos getListaprojetos() {
        return listaprojetos;
    }

    public ListaTarefas getListatarefas() {
        return listatarefas;
    }

    public ListaTarefasProjeto getListatarefasprojeto() {
        return listatarefasprojeto;
    }

    public boolean isUtilizador_autenticado() {
        return utilizador_autenticado;
    }


    /* public ArrayList<Utilizador> getArraylistautilizador() {
        return arraylistautilizador;
    }*/
    //FIM GET DOS OBJETOS !!!
    //inicio a aplicação com estes dados nos arrays !!!!!
    public void inicializar() {

        Utilizador u1 = new Utilizador("admin", "admin", "", "", "", "");
        if (listautilizadores.ExisteUtilizador("admin") == false) {
            listautilizadores.inserirUtilizador(u1);
        }
        Utilizador u2 = new Utilizador("1", "2", "", "", "", "");
        if (listautilizadores.ExisteUtilizador("1") == false) {
            listautilizadores.inserirUtilizador(u2);
        }

        /*Colaborador c1 = new Colaborador("Colaborador", "Colaborador", "", "", "", "");
        listacolaboradores.inserirColaborador(c1);
        Colaborador c2 = new Colaborador("Colaborador2", "Colaborador2", "", "", "", "");
        listacolaboradores.inserirColaborador(c2);

        Gestor g1 = new Gestor("Gestor", "Gestor", "", "", "", "");
        listagestor.inserirGestor(g1);
        Gestor g2 = new Gestor("Gestor2", "Gestor2", "", "", "", "");
        listagestor.inserirGestor(g2);
        Projeto p1 = new Projeto(1, "1º Projeto", "Descrição do 1º Projeto", LocalDate.MIN, g1, Estado.getIniciado());
        listaprojetos.inserirProjeto(p1);
        Projeto p2 = new Projeto(1, "2º Projeto", "Descrição do 2º Projeto", LocalDate.MIN, g2, Estado.getIniciado());
        listaprojetos.inserirProjeto(p2);

        Tarefa t1 = new Tarefa("Tarefa 1", getUtilizadorLigado(), "Tarefa 1 teste", Estado.getIniciado(), LocalDate.MIN, PrioridadeTarefas.Media);
        listatarefas.InserirTarefa(t1);
        Tarefa t2 = new Tarefa("Tarefa 2", getUtilizadorLigado(), "Tarefa 2 teste", Estado.getIniciado(), LocalDate.MIN, PrioridadeTarefas.Media);
        listatarefas.InserirTarefa(t2);*/
    }
    //Cria o metodo Login com e obriga a ter um username e uma password

    public boolean login(String username, String password) {
        //percorre todo o array
        for (Utilizador u : listautilizadores.getArraylistautilizador()) {
            //verifica se o utilizador do login é igual ao utilizador do array
            if (username.equals(u.getUser())) {
                //verifica se a password do login é igual ao utilizador do array
                if (password.equals(u.getPassword())) {
                    //coloca o utilizador_autenticado a true
                    utilizador_autenticado = true;
                    //guardo em utilizadorligado o utilizador que se autenticou com sucesso 
                    utilizadorligado = u;
                }
            }
        }
        //retorna true em caso de autenticação com sucesso, senão continua false
        return utilizador_autenticado;
    }

    // cria metodo que indica se foi autenticado com sucesso ao não, true ou false !!!
    public boolean isUtilizadorAutenticado() {
        return utilizador_autenticado;
    }

    public void setUtilizadorAutenticado(boolean autenticado) {
        this.utilizador_autenticado = autenticado;
    }

    public void guardarObjectos() {
        boolean utilizadoresOk = Serializacao.guardarObjecto(listautilizadores.getArraylistautilizador(), FICHEIRO_UTILIZADORES);
        boolean projetoOk = Serializacao.guardarObjecto(listaprojetos.getArraylistaprojeto(), FICHEIRO_PROJETOS);

        if (!utilizadoresOk) {
            System.out.println("Ocorreu um erro ao gravar os objetos");
        } else {
            System.out.println("Objectos guardados");
        }
        if (!projetoOk) {
            System.out.println("Ocorreu um erro ao gravar os objetos");
        } else {
            System.out.println("Objectos guardados");
        }
    }

    public void lerObjectos() {
        Object utilizadores = Serializacao.lerObjecto(FICHEIRO_UTILIZADORES);
        Object projetos = Serializacao.lerObjecto(FICHEIRO_PROJETOS);

        if (utilizadores != null) {
            listautilizadores.setArraylistautilizador((ArrayList<Utilizador>) utilizadores);
            System.out.println("lista de utilizadores carregada");
        } else {
            System.out.println("Ocorreu um erro ao ler o ficheiro de utilizadores");
        }
        if (projetos != null) {
            listaprojetos.setArraylistaprojeto((ArrayList<Projeto>) projetos);
            System.out.println("lista de projetos carregada");
        } else {
            System.out.println("Ocorreu um erro ao ler o ficheiro de projetos");
        }

    }

    public LocalDate Data(String data) {
        //CRIO O OBJETO formatodata com o formato ("d/MM/yyyy")
        DateTimeFormatter formatodata = DateTimeFormatter.ofPattern("d/MM/yyyy");

        //crio o objeto localdate que formata a informação intoduzida para o formato que eu paremetrizei em formatodata
        LocalDate localDate = LocalDate.parse(data, formatodata);

        return localDate;
    }

    //Fecha a aplicação
    public void terminar() {
        System.exit(0);
    }

}
