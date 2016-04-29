package projeto;

import java.util.Scanner;

public class Main {

	private static Facade facade = new Facade();
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args){
		
		boolean liberado = false;
		
		do{

			System.out.println("Digite a chave de desbloqueio: ");
			String chave = entrada.nextLine();
			liberado = facade.liberaSistema(chave);
			
		}while(liberado == false);
		
		System.out.println("Sistema liberado");
		System.out.println();
		
		System.out.println("Cadastro do ADM: ");
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite sua data de nascimento dd/mm/aa: ");
		String dataNascimento = entrada.nextLine();
		
		facade.cadastraFuncionario(nome, dataNascimento, "Diretor Geral");
		
		
		
		
	}

}
