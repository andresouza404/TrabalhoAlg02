package Principal;

import java.io.FileNotFoundException;
import Leitores.Leitor1;
import Leitores.Leitor2;
import Leitores.Leitor3;
import Objetos.Palestra;
import Objetos.Palestrante;
import Objetos.Participante;
import Seletores.SelecionaOrg;
import Seletores.SelecionaResto;

public class Main {

	public static Participante[] participante = new Participante [10];
	public static Palestrante[] palestrante = new Palestrante [3];
	public static Palestra[] palestra = new Palestra [4];	
	static String inst;
	static String even;
	static String data;
	static Palestrante org;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Inicializando novo Evento: ");
		run();
		System.out.println(org +" "+ inst +" "+ even +" "+ data);
	}

	private static void run() throws FileNotFoundException {
		CriaEvento.run();
		InicializaLeitores();
		selecionaAtores();
		
	}
	
	private static void InicializaLeitores() throws FileNotFoundException {
		String p = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/participantes.csv";
		String s = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/palestrantes.csv";
		String l = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/palestras.csv";
		Leitor1.run(p, participante);
		Leitor2.run(s, palestrante);
		Leitor3.run(l, palestra);
	}

	private static void selecionaAtores() {
		org = SelecionaOrg.run(palestrante);
		inst = SelecionaResto.run(CriaEvento.Instituicao);
		even = SelecionaResto.run(CriaEvento.Evento);
		data = SelecionaResto.run(CriaEvento.Data);
	}
	
}
