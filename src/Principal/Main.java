package Principal;

import java.io.FileNotFoundException;
import Leitores.Leitor1;
import Leitores.Leitor2;
import Leitores.Leitor3;
import Objetos.Palestra;
import Objetos.Palestrante;
import Objetos.Participante;
import Seletores.SelecionarAtt;
import Seletores.SelecionarOrg;
import Seletores.SelecionarResto;

public class Main {

	public static Participante[] participante = new Participante[10];
	public static Palestrante[] palestrante = new Palestrante[3];
	public static Palestra[] palestra = new Palestra[4];
	static String inst;
	static String even;
	static String data;
	static Palestrante org;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Inicializando novo Evento:\n");
		run();
	}

	private static void run() throws FileNotFoundException {
		CriarStrings.run();
		InicializaLeitores();
		SelecionaAtores();
		CriaEvento();
		EmitirCertificados();
	}

	private static void InicializaLeitores() throws FileNotFoundException {
		String p = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/participantes.csv";
		String s = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/palestrantes.csv";
		String l = "C:/Users/andre/Documents/Java/Workspace/Trabalho01Alg02/data/palestras.csv";
		Leitor1.run(p, participante);
		Leitor2.run(s, palestrante);
		Leitor3.run(l, palestra);
	}

	private static void SelecionaAtores() {
		org = SelecionarOrg.run(palestrante);
		inst = SelecionarResto.run(CriarStrings.Instituicao);
		even = SelecionarResto.run(CriarStrings.Evento);
		data = SelecionarResto.run(CriarStrings.Data);
	}

	private static void CriaEvento() {
		int c = 0;
		System.out.println("Evento: " + even + "\nEm: " + inst + " Data: " + data + "\nOrganizado por: " + org + "\n");
		for (Palestra palestra : palestra) {
			Palestrante l = SelecionarOrg.run(palestrante);

			if (c == 0) {
				l.setL1(true);
			}
			if (c == 1) {
				l.setL2(true);
			}
			if (c == 2) {
				l.setL3(true);
			}
			if (c == 3) {
				l.setL4(true);
			}

			if (l.isL1() && c == 0) {
				Participante[] aux = new Participante[5];
				aux = SelecionarAtt.run(participante);
				aux[0].setL1(true);
				aux[1].setL1(true);
				aux[2].setL1(true);
				aux[3].setL1(true);
				aux[4].setL1(true);
				System.out.println(palestra + "\nCom: " + l + "\n");
			} else if (l.isL2() && c == 1) {
				Participante[] aux = new Participante[5];
				aux = SelecionarAtt.run(participante);
				aux[0].setL2(true);
				aux[1].setL2(true);
				aux[2].setL2(true);
				aux[3].setL2(true);
				aux[4].setL2(true);
				System.out.println(palestra + "\nCom: " + l + "\n");
			} else if (l.isL3() && c == 2) {
				Participante[] aux = new Participante[5];
				aux = SelecionarAtt.run(participante);
				aux[0].setL3(true);
				aux[1].setL3(true);
				aux[2].setL3(true);
				aux[3].setL3(true);
				aux[4].setL3(true);
				System.out.println(palestra + "\nCom: " + l + "\n");
			} else if (l.isL4() && c == 3) {
				Participante[] aux = new Participante[5];
				aux = SelecionarAtt.run(participante);
				aux[0].setL4(true);
				aux[1].setL4(true);
				aux[2].setL4(true);
				aux[3].setL4(true);
				aux[4].setL4(true);
				System.out.println(palestra + "\nCom: " + l + "\n");
			}
			c++;
		}
	}

	private static void EmitirCertificados() {
		for (Participante participante : participante) {
			if (participante.isL1() && participante.isL2() && participante.isL3() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a todas as Palestras");
			}
			else if (participante.isL1() && participante.isL2() && participante.isL3()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a tres Palestras");
			}else if (participante.isL1() && participante.isL2() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a tres Palestras");
			}else if (participante.isL1() && participante.isL3() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a tres Palestras");
			}else if (participante.isL2() && participante.isL3() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a tres Palestras");
			}
			else if (participante.isL1() && participante.isL2()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}else if (participante.isL1() && participante.isL3()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}else if (participante.isL1() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}else if (participante.isL2() && participante.isL3()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}else if (participante.isL2() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}else if (participante.isL3() && participante.isL4()) {
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a duas Palestras");
			}
			else if (participante.isL1() || participante.isL2() || participante.isL3() || participante.isL4()){
				System.out.println(participante.getNome() + " Recebe Certificado por comparecer a uma Palestra");
			}
			
		}
	}
}