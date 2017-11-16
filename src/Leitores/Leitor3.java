package Leitores;

import java.io.*;
import java.util.Scanner;

import Objetos.Palestra;
import Principal.CriarStrings;
import Seletores.SelecionarResto;

public class Leitor3 {

	public static Palestra[] run(String arquivoCSVString, Palestra a[]) throws FileNotFoundException{
		
		File arquivo = new File(arquivoCSVString);
		Scanner s = new Scanner(arquivo);
		s.useDelimiter("[,\n]");
		int x = 0;
					
		while(s.hasNextLine()){
			a[x] = new Palestra(s.next(), s.next(), SelecionarResto.run(CriarStrings.Sala));
			x++;
		}
		s.close();
		return a;
			
		}
}
