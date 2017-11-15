package Leitores;

import java.io.*;
import java.util.Scanner;

import Objetos.Participante;

public class Leitor1 {
	
	public static Participante[] run(String arquivoCSVString, Participante a[]) throws FileNotFoundException{
 			
		File arquivo = new File(arquivoCSVString);
 		Scanner s = new Scanner(arquivo);
 		s.useDelimiter("[,\n]");
	 	int x = 0;
	 						
	 	while(s.hasNextLine()){
	 		a[x] = new Participante(s.next(), s.next());
	 		x++;
	 	}
	 	s.close();
	 	System.out.println("====================");
	 	return a;
	 				
	 	}
}
