package Seletores;

import java.util.Random;;

public class SelecionaResto {
	
	public static String run(String x[]){
		Random rand = new Random();
		String a = x[rand.nextInt(x.length)];
		System.out.println("//////////");
		return a;
	}
}
