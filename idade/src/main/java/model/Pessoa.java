package model;

public class Pessoa {
	private int anoNascimento;
    private String nome;
    private String endereco;

    public Pessoa(int anoNascimento, String nome, String endereco) {
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return 2023 - anoNascimento;
    }
}
