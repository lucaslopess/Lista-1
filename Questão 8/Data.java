
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(){
		this.dia = 0;
		this.mes = 0;
		this.ano = 0;
	}
	
	
	public int getDia(){
		return this.dia;
	}
	public void setDia(int dia){
		this.dia = dia;
	}
	
	
	
	public int getMes(){
		return this.mes;
	}
	public void setMes(int mes){
		this.mes = mes;
	}
	
	
	
	public int getAno(){
		return this.ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public String toString(){
		return(this.dia+"/"+this.mes+"/"+this.ano);
	}

}
