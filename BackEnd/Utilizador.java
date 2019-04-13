package BackEnd;



public class Utilizador {

    private String username;
    private String password;
    private String nome;
    private String morada;
    private String telefone;
    private String email;

    public Utilizador() {
    }

    public Utilizador(String user, String password, String nome, String morada, String telefone, String email) {
        this.username = user;
        this.password = password;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
    }

    public String getUser() {
        return username;
    }

    public void setUser(String user) {
        this.username = user;
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
        System.out.println("username: " + username + ", password: " + password + ", nome: " +   nome + ", morada: " + morada + ", telefone: " + telefone + ", email: " + email );
    
    }
    
    
     @Override
    public String toString() {
        return "Utilizador{" + "username=" + username + ", password=" + password + ", nome=" + nome + ", morada=" + morada + ", telefone=" + telefone + ", email=" + email + '}';
    }


}
