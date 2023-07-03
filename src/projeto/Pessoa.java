package projeto;

public class Pessoa {
	private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String email;
    private String telefone;

    public Pessoa(String nome, String cpf, int idade, String sexo, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTelefone() {
        return telefone;
    }
}
