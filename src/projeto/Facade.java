package projeto;

import easyaccept.EasyAccept;

public class Facade {
	
	HospitalController controller;
	
	Facade(){
		controller = new HospitalController();
	}
	
	public static void main(String[] args) {
	    args = new String[] {
	    		"projeto.Facade", 
	    		"recursos/scripts de testes/usecase_1.txt"}; //separe cada script de teste por virgula.
	    EasyAccept.main(args);
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
