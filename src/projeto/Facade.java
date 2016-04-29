package projeto;

public class Facade {
	
	HospitalController controller;
	
	Facade(){
		controller = new HospitalController();
	}
	
	public boolean liberaSistema(String chave){
		return controller.liberaSistema(chave);
	}
	
	public void cadastraFuncionario(String nome, String dataNascimento, String cargo){
		controller.cadastraFuncionario(nome, dataNascimento, cargo);
	}
	
	
	
	
	
	
	public void realizaLogin(String matricula, String senha){
		
	}
	
}
