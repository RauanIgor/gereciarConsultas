package projeto;

public class Medico extends Pessoa{
	private String numCRM;
    private Agenda agenda;

    public Medico(String numCRM, Agenda agenda, String nome, String cpf, int idade, String sexo, String email, String telefone) {
        super(nome, cpf, idade, sexo, email, telefone);
        this.numCRM = numCRM;
        this.agenda = agenda;
    }

 

    public Agenda getAgenda() {
        return agenda;
    }
    

    public String getNumCRM() {
    	return numCRM;
	}

}
