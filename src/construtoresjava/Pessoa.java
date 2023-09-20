package construtoresjava;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;
    
    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome =nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
