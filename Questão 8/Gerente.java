
public class Gerente extends Funcionario {
	private String area;
	
	public Gerente(String nome, Data nascimento, double salario, String area){
		super(nome, nascimento, salario);
		this.area = area;		
	}
	
	public double calculaImposto(){
		double imposto = (0.05*this.getSalario());
		return imposto;
	}
	
	public String imprimeDados() {
		return("Nome: "+this.getNome()+"\n"+"Nascimento: "+this.getNascimento()+"\n"+"Salário: R$"+this.getSalario()+"\n"+"Imposto: R$"+this.calculaImposto()+"\n"+"Área: "+this.area+"\n");
	}

}
