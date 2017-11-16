package Leitores;

import java.io.*;
import java.util.Scanner;

import Objetos.Palestrante;

public class Leitor2 {

	public static Palestrante[] run(String arquivoCSVString, Palestrante a[]) throws FileNotFoundException{
			
		File arquivo = new File(arquivoCSVString);
 		Scanner s = new Scanner(arquivo);
 		s.useDelimiter("[,\n]");
	 	int x = 0;
	 						
	 	while(s.hasNextLine()){
	 		a[x] = new Palestrante(s.next(), s.next(), s.next(), s.next());
	 		x++;
	 	}
	 	s.close();
	 	return a;
	 				
	 	}
}
