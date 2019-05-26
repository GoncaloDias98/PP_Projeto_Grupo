package BackEnd;



public enum Estado {

    // NãoIniciado("Não Iniciado", "0"),
    //Iniciado,
    //Concluído
    
    
    naoiniciado("Não Iniciado"),
    emcurso("Em Curso"),
    concluido("Concluído");

    private final String descricao;

    private Estado(String descricao) {
        this.descricao = descricao;
    }

    public static Estado getNaoiniciado() {
        return naoiniciado;
    }

    public static Estado getEmCurso() {
        return emcurso;
    }

    public static Estado getConcluido() {
        return concluido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void getTodos() {
        for (Estado todos : Estado.values()) {
            System.out.printf("%s\t%s", todos, todos.getDescricao());
        }
    }
}
