
public abstract class Pessoa {
	private String nome;
	private Data nascimento;
	
	public Pessoa(){
		this.nome = "";
		this.nascimento = new Data();
	}
	
	public Pessoa(String nome, Data nascimento){
		this.nome = nome;
		this.nascimento = nascimento;
	}
	public abstract String imprimeDados();
	
	
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Data getNascimento(){
		return this.nascimento;
	}
	public void setNascimento(Data nascimento){
		this.nascimento = nascimento;
	}	

}
