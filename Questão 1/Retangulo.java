
public class Retangulo {
	private double altura;
	private double largura;
	
	public Retangulo(){
		this.largura = 0.0;
		this.altura = 0.0;
	}
	public Retangulo(double altura, double largura){
		largura = this.largura;
		altura = this.altura;
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
	
	public double getPerimetro(){
		return ((2*this.altura)+(2*this.largura));		
	}
	public double getArea(){
		return(this.altura*this.largura);
	}
	public String toString(){
		return("Altura : "+this.altura+"\n"+"Largura: "+this.largura);
	}
	@Override
	public boolean equals(Object o){
		if(o == null){
			return false;
		}if(o instanceof Retangulo){
			Retangulo r = (Retangulo) o;
			if(this.altura == r.altura && this.largura == r.largura){
				return true;
			}			
		}
		return false;
	}

}
 