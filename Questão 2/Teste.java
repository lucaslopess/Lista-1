
public class Teste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("Lucas");
		p.setIdade(22);
		p.setAltura(1.73);
		p.setPeso(115);
		p.setSexo("Masculino");
		System.out.println(p.getNome());
		System.out.println(p.getIdade());
		System.out.println(p.getAltura());
		System.out.println(p.getPeso());
		System.out.println(p.getSexo());
		System.out.println(p.toString(p.CalculaIMC()));
		

	}

}
