package projeto;

public class Paciente extends Pessoa{
	private boolean gestante;
    private boolean pne;

    public Paciente(boolean gestante, boolean pne, String nome, String cpf, int idade, String sexo, String email, String telefone) {
        super(nome, cpf, idade, sexo, email, telefone);
        
        
        this.gestante = gestante;
        this.pne = pne;
    }

    public boolean isGestante() {
        return gestante;
    }

    public boolean isPne() {
        return pne;
    }
    
    @Override
    public String toString() {
        return "Paciente: " + getNome() + "\nCPF: " + getCpf()+ "\nSexo: " + getSexo()
        + "\nIdade: " + getIdade() + "\nGestante: " + (isGestante()? "SIM" : "NÃO") + "\nNecessidades Especiais: " + (isPne()? "SIM" : "NÃO");
    }

}
