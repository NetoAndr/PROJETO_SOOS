package projeto;

public class FactoryFuncionario {
	
public Funcionario criaUsuario(String nome, String dataNascimento, String cargo){
		
	Funcionario novoFuncionario = null;

		if(cargo.equals("Diretor Geral")){
			novoFuncionario = new Diretor(nome, dataNascimento, cargo);
		
		}else if(cargo.equals("Medico")){
			novoFuncionario = new Medico(nome, dataNascimento, cargo);
			
		}else if(cargo.equals("Tecnico Administrativo")){
			novoFuncionario = new TecnicoAdm(nome, dataNascimento, cargo);
		}	
		return novoFuncionario;
	}

}
