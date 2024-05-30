public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
    private int idade;
	// método construtor

    public Pessoa(int idade){
        this.idade = idade;
    }


    public Pessoa(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
