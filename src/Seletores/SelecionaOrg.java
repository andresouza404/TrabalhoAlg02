package Seletores;

import java.util.Random;
import Objetos.Palestrante;

public class SelecionaOrg {
	
	public static Palestrante run(Palestrante p[]){
		Random rand = new Random();
		Palestrante org = p[rand.nextInt(p.length)];
		System.out.println("2 + 2 = 4");
		return org;
	}
}
