package BackEnd;



public enum Estado {

    // NãoIniciado("Não Iniciado", "0"),
    //Iniciado,
    //Concluído
    
    
    naoiniciado("Não Iniciado"),
    iniciado("Iniciado"),
    concluido("Concluído");

    private final String descricao;

    private Estado(String descricao) {
        this.descricao = descricao;
    }

    public static Estado getNaoiniciado() {
        return naoiniciado;
    }

    public static Estado getIniciado() {
        return iniciado;
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
