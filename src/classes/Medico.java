
package classes;

/**
 *
 * @author Rauan
 */
public class Medico extends Pessoa {
    private String CRM;
    private Agenda agenda;

    public Medico(String CRM, Agenda agenda, String nome, String cpf, int idade, String sexo, String email, String telefone, String username, String Senha) {
        super(nome, cpf, idade, sexo, email, telefone, username, Senha);
        this.CRM = CRM;
        this.agenda = agenda;
    }

 

    public Agenda getAgenda() {
        return agenda;
    }
    

    public String getCRM() {
        return CRM;
    }
    
    
}
