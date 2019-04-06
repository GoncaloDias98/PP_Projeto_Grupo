package Backend;

public class Utilizador {

    private String user;
    private String password;
    private String nome;
    private String morada;
    private String telefone;
    private String email;

    public Utilizador() {
    }

    public Utilizador(String user, String password, String nome, String morada, String telefone, String email) {
        this.user = user;
        this.password = password;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void Consulta() {
        System.out.println("-------------------------------------");
        System.out.println("User: " + user);
        System.out.println("Password: " + password);
        System.out.println("Nome: " + nome);
        System.out.println("Morada: " + morada);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println("-------------------------------------");

    }

}
