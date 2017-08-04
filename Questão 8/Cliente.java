
public class Cliente extends Pessoa{
	private int codigo;
	
	public Cliente(String nome, Data nascimento, int codigo){
		super(nome, nascimento);
		this.codigo = codigo;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}

	public String imprimeDados() {
		return("Nome: "+this.getNome()+"\n"+"Nascimento: "+this.getNascimento()+"\n"+"Código: "+this.codigo+"\n");
	}
}
