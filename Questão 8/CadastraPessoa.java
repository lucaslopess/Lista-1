import java.util.ArrayList;
import java.util.List;

public class CadastraPessoa {
	private List<Pessoa> pessoas;
	
	public CadastraPessoa(){
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	
	public void cadastraPessoa(Pessoa p){
		this.pessoas.add(p);
	}
	
	public String imprimeCadastro(){
		String junta = "";
		for(Pessoa p: this.pessoas){
			if(p instanceof Gerente){
				junta+=p.imprimeDados();
			}else if(p instanceof Funcionario){
				junta+=p.imprimeDados();				
			}else if(p instanceof Cliente){
				junta+=p.imprimeDados();
			}
			
		}
		return junta;
	}

}
