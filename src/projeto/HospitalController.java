package projeto;

import java.util.HashMap;


public class HospitalController {
	
	private HashMap<String, Funcionario> funcionarios;
	private final String CHAVE;
	private FactoryFuncionario factory;
	
	public HospitalController(){
		this.funcionarios = new HashMap<String, Funcionario>();
		this.CHAVE = "c041ebf8";
	
	}
	
	public boolean liberaSistema(String chave){
		if(chave == CHAVE){
			return true;
		}
		return false;
	}
	
	public void cadastraFuncionario(String nome, String dataNascimento, String cargo){
		Funcionario novoFuncionario = factory.criaUsuario(nome, dataNascimento, cargo);
		
		//int matricula = geraMatricula();
		
		//funcionarios.put(matricula, novoFuncionario);
		
	}

	
	public String geraMatricula() {
		
		return "";
	}
	
}
