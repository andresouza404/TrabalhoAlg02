package Objetos;

public class Palestra {
	
	private String titulo;
	private String resumo;
	private String sala;
	
	public Palestra(String titulo, String resumo, String sala) {
		this.titulo = titulo;
		this.resumo = resumo;
		this.sala = sala;
	}

	@Override
	public String toString() {
		return "Palestra: " + titulo + "\nResumo: " + resumo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getResumo() {
		return resumo;
	}
	public String getSala() {
		return sala;
	}
}
