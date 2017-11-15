package Objetos;

public class Palestrante {

	private String nome;
	private String email;
	private String telefone;
	private String curriculo;
	
	public Palestrante(String nome, String email,String curriculo, String telefone) {
		this.nome = nome;
		this.email = email;
		this.curriculo = curriculo;
		this.telefone = telefone;
	}
		
	@Override
	public String toString() {
		return getNome();
	}

	public String getNome() {
		return nome;
	}
	 
	public String getEmail() {
		return email;
	}
	
	public String getCurriculo() {
		return curriculo;
	}
	
	public String getTelefone(){
		return telefone;
	}

}
