package BackEnd;

//vai pro PUTA QUE TE PARIU
public class Colaborador extends Utilizador {

    public Colaborador() {
    }

    public Colaborador(String user, String password, String nome, String morada, String telefone, String email) {
        super(user, password, nome, morada, telefone, email);
    }
 public void ConsultaColaborador() {
        System.out.println("username: " + super.getNome() + ", password: " + super.getPassword() + ", nome: " +   super.getNome() + ", morada: " + super.getMorada() + ", telefone: " + super.getTelefone() + ", email: " + super.getEmail() );
    
    }
    
}
