
public class Quadrado  extends Quadrilatero{
private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	public double getLado(){
		return this.lado;
	}
	public void setLado(double novolado){
		this.lado = novolado;
	}
	@Override
	public double calculaArea(){
		return (this.lado*this.lado);
	}
	@Override
	public double calculaPerimetro(){
		return(this.lado*4);
	}
	@Override
	public String toString(){
		return("Lado: "+this.lado+"\n"+"Perimetro: "+this.calculaPerimetro()+"\n"+"Área: "+this.calculaArea()+"\n");
	}

}
