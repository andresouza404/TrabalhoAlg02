package Objetos;

public class Participante {

	private String nome;
	private String email;
	private boolean l1;
	private boolean l2;
	private boolean l3;
	private boolean l4;
	
	public Participante(String nome, String email) {
		this.nome = nome;
		this.email = email;
		this.l1 = false;
		this.l2 = false;
		this.l3 = false;
		this.l4 = false;
	}
		
	@Override
	public String toString() {
		return"Participante: " + nome + "\n E-mail: " + email;
	}

	public String getNome() {
		return nome;
	}
	 
	public String getEmail() {
		return email;
	}

	public boolean isL1() {
		return l1;
	}

	public void setL1(boolean l1) {
		this.l1 = l1;
	}

	public boolean isL2() {
		return l2;
	}

	public void setL2(boolean l2) {
		this.l2 = l2;
	}

	public boolean isL3() {
		return l3;
	}

	public void setL3(boolean l3) {
		this.l3 = l3;
	}

	public boolean isL4() {
		return l4;
	}

	public void setL4(boolean l4) {
		this.l4 = l4;
	}

}
