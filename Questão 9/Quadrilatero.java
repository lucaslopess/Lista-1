
public abstract class Quadrilatero implements FormaGeometrica{
	private double altura;
	private double largura;
	
	public Quadrilatero(double altura, double largura){
		this.altura = altura;
		this.largura = largura;
		
	}	
	
	public Quadrilatero(){
		this.altura = 0.0;
		this.largura = 0.0;
		
	}
	
	public abstract double calculaPerimetro();
	public abstract double calculaArea();
	public abstract String toString();


}
