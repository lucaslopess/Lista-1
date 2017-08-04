
public class Funcionario extends Pessoa{
	private double salario;
	
	
	public Funcionario(String nome, Data nascimento, double salario){
		super(nome, nascimento);
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public double calculaImposto(){
		double imposto = (0.03*this.salario);
		return imposto;
	}

	public String imprimeDados() {
		return("Nome: "+this.getNome()+"\n"+"Nascimento: "+this.getNascimento()+"\n"+"Salário: R$"+this.salario+"\n"+"Imposto: R$"+this.calculaImposto()+"\n");
	}
	
	
}
