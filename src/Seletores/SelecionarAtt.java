package Seletores;

import java.util.Random;
import Objetos.Participante;

public class SelecionarAtt {

	public static Participante[] run(Participante[] p) {
		Participante[] a = new Participante[5];
		Random rand = new Random();
		
		for (int x = 0 ; x < a.length ; x++){
			a[x] = p[rand.nextInt(p.length)];
		}
		return null;
	}

}
