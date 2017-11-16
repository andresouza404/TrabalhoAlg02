package Seletores;

import java.util.Random;;

public class SelecionarResto {
	
	public static String run(String a[]){
		Random rand = new Random();
		String s = a[rand.nextInt(a.length)];
		return s;
	}
}
