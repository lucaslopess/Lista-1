
public class Teste {

	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		r.setAltura(8);
		r.setLargura(9);
		System.out.println(r.getPerimetro());
		System.out.println(r.getArea());
		System.out.println(r.toString());
		Retangulo r2 = new Retangulo();
		r2.setAltura(9);
		r2.setLargura(8);
		System.out.println(r2.getPerimetro());
		System.out.println(r2.getArea());
		System.out.println(r2.toString());
		boolean compara = r.equals(r2);
		if(compara == true){
			System.out.println("São iguais!");
		}else if(compara == false){
			System.out.println("São diferentes!");
		}
		
	

	}

}
