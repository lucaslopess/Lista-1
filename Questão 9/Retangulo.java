
public class Retangulo extends Quadrilatero {
	private double altura;
	private double largura;
	
	public Retangulo(double altura, double largura){
		super(altura, largura);
		this.altura = altura;
		this.largura = largura;
	}
	
	public double getAltura(){
		return this.altura;
	}
	public void setAltura(double alt){
		this.altura = alt;
	}
	public double getLargura(){
		return this.largura;
	}
	public void setLargura(double larg){
		this.largura = larg;
	}
	@Override
	public double calculaArea(){
		return(this.altura*this.largura);
	}
	@Override
	public double  calculaPerimetro(){
		return((this.altura*2)+(this.largura*2));
	}
	@Override
	public String toString(){
		return("Altura: "+this.altura+"\n"+"Largura: "+this.largura+"\n"+"Perimetro: "+this.calculaPerimetro()+"\n"+"Área: "+this.calculaArea()+"\n");
	}
	
	

}
