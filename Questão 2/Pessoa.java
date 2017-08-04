
public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private String sexo;
	
	
	public Pessoa(){
		this.nome = "";
		this.idade = 0;
		this.altura = 0.0;
		this.peso = 0.0;
		this.sexo = "";
	}
	public Pessoa(String nome, int idade, int altura, double peso, String sexo){
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.sexo = sexo;
	}
	
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	
	public double getPeso(){
		return this.peso;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public String getSexo(){
		return this.sexo;
	}
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	
	
	
	public double CalculaIMC(){
		double IMC = ((this.peso/(this.altura*this.altura)));
		return(IMC);
		
	}
	

	
	public String toString(double IMC){
		if(IMC <= 18.5){
			return("Nome:" +this.nome+"\n"+"Abaixo do peso");
		}else if(18.5 <IMC && IMC <= 25){
			return("Nome: "+this.nome+"\n"+"Peso normal");
		}else if( 25<IMC && IMC <= 30){
			return("Nome: "+this.nome+"\n"+"Acima do peso");
		}else if(IMC > 30){
		return("Nome: "+this.nome+"\n"+"Obesidade");
		}
		return null;
	}
	

}
