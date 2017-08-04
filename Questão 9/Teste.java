import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<FormaGeometrica> f = new ArrayList<FormaGeometrica>();
		Quadrilatero q1 = new Quadrado(5);
		Quadrilatero q2 = new Quadrado(3);
		f.add(q1);
		f.add(q2);
		Quadrilatero r1 = new Retangulo(5,3);
		Quadrilatero r2 = new Retangulo(3,5);
		f.add(r1);
		f.add(r2);
		Circulo c1 = new Circulo(3);
		Circulo c2 = new Circulo(5);
		f.add(c1);
		f.add(c2);
		for (FormaGeometrica x: f){
			System.out.println(x.toString());
		}
	}

}
