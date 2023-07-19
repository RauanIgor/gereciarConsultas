package classes;

/**
 *
 * @author lilia
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String email;
    private String telefone;
    private String username;
    private String Senha;

    public Pessoa(String nome, String cpf, int idade, String sexo, String email, String telefone, String username, String Senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
        this.telefone = telefone;
        this.username = username;
        this.Senha = Senha;
    }

    public int getIdade() {
        return idade;
    }

    public String getUsername() {
        return username;
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

    public String getSenha() {
        return Senha;
    }

}

   