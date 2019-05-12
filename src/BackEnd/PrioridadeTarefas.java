package BackEnd;



public enum PrioridadeTarefas {
    
    alta("Alta"),
    media("Média"),
    baixa("Baixa");
    
    
    private final String descricao;
    
     private PrioridadeTarefas(String descricao) {
        this.descricao = descricao;
    }

    public static PrioridadeTarefas getAlta() {
        return alta;
    }

    public static PrioridadeTarefas getMedia() {
        return media;
    }

    public static PrioridadeTarefas getBaixa() {
        return baixa;
    }

    public String getDescricao() {
        return descricao;
    }
     
     
     
     public void getTodos() {
        for (PrioridadeTarefas todos : PrioridadeTarefas.values()) {
            System.out.printf("%s\t%s", todos, todos.getDescricao());
        }
    }
}
