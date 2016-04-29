package projeto;


public class Funcionario {

	private String nome;
	private String dataNascimento;
	private String cargo;
	private String matricula;
	
	public Funcionario(String nome, String dataNascimento, String cargo){
		
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cargo = cargo;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	

}
