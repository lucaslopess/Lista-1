
public class Circulo implements FormaGeometrica{
	
	private double raio;
	public static final double PI= 3.14;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	public double getRaio(){
		return this.raio;
	}
	public void setRaio(double novoraio){
		raio = novoraio;
	}
	
	public double calculaPerimetro(){
		return(2*PI*this.raio);
	}
	public double calculaArea(){
		return (PI*this.raio*this.raio);
	}
	public String toString(){
		return("Raio: "+this.raio+"\n"+"Circunferência: "+this.calculaPerimetro()+"\n"+"Área: "+this.calculaArea()+"\n");
	}

}
