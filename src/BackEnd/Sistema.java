package BackEnd;

import BackEnd.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sistema implements java.io.Serializable {

    //VARIÁVEIS OBJETOS
    // CAMINHO DO FICHEIRO !!!!
    public static final String FICHEIRO_UTILIZADORES = "./utilizadores.dat";
    public static final String FICHEIRO_PROJETOS = "./projetos.dat";
    public static final String FICHEIRO_TAREFAS = "./tarefas.dat";
    public static final String FICHEIRO_TAREFASPROJETO = "./tarefasprojeto.dat";

    private Utilizador utilizador;
    private Utilizador utilizadorligado;
    private Colaborador colaborador;
    private Gestor gestor;
    private Estado estado;
    private PrioridadeTarefas prioridadestarefas;
    private Projeto projeto;
    private Tarefa tarefa;
    private ListaTarefasProjeto listatarefasprojeto;
    private ListaUtilizadores listautilizadores;
    private ListaColaboradores listacolaboradores;
    private ListaGestor listagestor;
    private ListaProjetos listaprojetos;
    private ListaTarefas listatarefas;
    private TarefasProjeto tarefasprojeto;

    private ArrayList<Colaborador> arraylistacolaborador;

    private boolean utilizador_autenticado = false;
    private boolean emailvalido = true;

    //FIM VARIÁVEIS OBJETOS
    //CONSTRUTOR , INICIAR OS OBJETOS
    public Sistema() {

        listautilizadores = new ListaUtilizadores();
        listacolaboradores = new ListaColaboradores();
        listagestor = new ListaGestor();

        listaprojetos = new ListaProjetos();
        listatarefas = new ListaTarefas();
        listatarefasprojeto = new ListaTarefasProjeto();
        listaprojetos = new ListaProjetos();
        listatarefas = new ListaTarefas();
        tarefasprojeto = new TarefasProjeto();

        // arraylistacolaborador = new ArrayList<Colaborador>();
        if (!new File(FICHEIRO_UTILIZADORES).exists()) {
            //inicializaManual();
            guardarObjectos();
        } else {
            lerObjectos();
        }

        if (!new File(FICHEIRO_PROJETOS).exists()) {
            //inicializaManual();
            guardarObjectos();
        } else {
            lerObjectos();
        }

        if (!new File(FICHEIRO_TAREFAS).exists()) {
            //inicializaManual();
            guardarObjectos();
        } else {
            lerObjectos();
        }
         if (!new File(FICHEIRO_TAREFASPROJETO).exists()) {
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

    public boolean isUtilizador_autenticado() {
        return utilizador_autenticado;
    }

    public TarefasProjeto getTarefasprojeto() {
        return tarefasprojeto;
    }

    public ListaTarefasProjeto getListatarefasprojeto() {
        return listatarefasprojeto;
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
        boolean tarefasOk = Serializacao.guardarObjecto(listatarefas.getArraylistatarefa(), FICHEIRO_TAREFAS);
        boolean tarefasprojetoOk = Serializacao.guardarObjecto(listatarefasprojeto.getListatarefasprojeto(), FICHEIRO_TAREFASPROJETO);

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
        if (!tarefasOk) {
            System.out.println("Ocorreu um erro ao gravar os objetos");
        } else {
            System.out.println("Objectos guardados");
        }
         if (!tarefasprojetoOk) {
            System.out.println("Ocorreu um erro ao gravar os objetos");
        } else {
            System.out.println("Objectos guardados");
        }
    }

    public void lerObjectos() {
        Object utilizadores = Serializacao.lerObjecto(FICHEIRO_UTILIZADORES);
        Object projetos = Serializacao.lerObjecto(FICHEIRO_PROJETOS);
        Object tarefas = Serializacao.lerObjecto(FICHEIRO_TAREFAS);
        Object tarefasprojeto = Serializacao.lerObjecto(FICHEIRO_TAREFASPROJETO);

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

        if (tarefas != null) {
            listatarefas.setArraylistatarefa((ArrayList<Tarefa>) tarefas);
            System.out.println("lista de tarefas carregada");
        } else {
            System.out.println("Ocorreu um erro ao ler o ficheiro de tarefas");
        }
        if (tarefasprojeto != null) {
            listatarefasprojeto.setListatarefasprojeto((ArrayList<TarefasProjeto>) tarefasprojeto);
            System.out.println("lista de tarefasprojeto carregada");
        } else {
            System.out.println("Ocorreu um erro ao ler o ficheiro de tarefasprojeto");
        }

    }

    public LocalDate Data(String data) {
        //CRIO O OBJETO formatodata com o formato ("d/MM/yyyy")
        DateTimeFormatter formatodata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //crio o objeto localdate que formata a informação intoduzida para o formato que eu paremetrizei em formatodata
        LocalDate localDate = LocalDate.parse(data, formatodata);

        return localDate;
    }

    public String Datatexto(LocalDate data) {
        DateTimeFormatter formatodata = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //crio o objeto localdate que formata a informação intoduzida para o formato que eu paremetrizei em formatodata
        String date = formatodata.format(data);

        return date;
    }

    //Fecha a aplicação
    public void terminar() {
        System.exit(0);
    }

    public boolean validaEmail(String email) {
        emailvalido = true;
        Pattern p = Pattern.compile(".+@.+\\.[a-z]+");
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if (!matchFound) {

            emailvalido = false;

        }
        return emailvalido;
    }

}
