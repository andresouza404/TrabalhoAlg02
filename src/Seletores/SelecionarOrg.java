package Seletores;

import java.util.Random;
import Objetos.Palestrante;

public class SelecionarOrg {
	
	public static Palestrante run(Palestrante a[]){
		Random rand = new Random();
		Palestrante s = a[rand.nextInt(a.length)];
		return s;
	}
}
