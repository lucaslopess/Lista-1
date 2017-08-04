

public class Teste {

	public static void main(String[] args) {
		CadastraPessoa p = new CadastraPessoa();
		Cliente c1 = new Cliente("João",new Data(16,07,1995), 19804);
		Cliente c2 = new Cliente("Paulo", new Data(17,07,1996), 87876);
		Cliente c3 = new Cliente("Clark", new Data(18,07,1997),123123);
		p.cadastraPessoa(c1);
		p.cadastraPessoa(c2);
		p.cadastraPessoa(c3);
		Funcionario f1 = new Funcionario("Maria", new Data(20,07,1992), 1900.00);
		Funcionario f2 = new Funcionario("Gina", new Data(21,07,1993), 1589.99);
		Funcionario f3 = new Funcionario("Clara", new Data(22,07,1994), 1999.99);
		p.cadastraPessoa(f1);
		p.cadastraPessoa(f2);
		p.cadastraPessoa(f3);
		Gerente g1 = new Gerente("Fernando",new Data(23,07,1889),3098.00,"TI");
		Gerente g2 = new Gerente("Áquila",new Data(24,07,1890),2700.89,"RH");
		Gerente g3 = new Gerente("Fernando",new Data(25,07,1891),3100.00,"Lab");
		p.cadastraPessoa(g1);
		p.cadastraPessoa(g2);
		p.cadastraPessoa(g3);
		p.imprimeCadastro();
		String imprime = p.imprimeCadastro();
		System.out.println(imprime);
	
	

	}

}
