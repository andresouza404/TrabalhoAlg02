package Leitores;

import java.io.*;
import java.util.Scanner;

import Objetos.Palestra;
import Principal.CriaEvento;
import Seletores.SelecionaResto;

public class Leitor3 {

	public static Palestra[] run(String arquivoCSVString, Palestra a[]) throws FileNotFoundException{
		
		File arquivo = new File(arquivoCSVString);
		Scanner s = new Scanner(arquivo);
		s.useDelimiter("[,\n]");
		int x = 0;
					
		while(s.hasNextLine()){
			a[x] = new Palestra(s.next(), s.next(), SelecionaResto.run(CriaEvento.Sala));
			x++;
		}
		s.close();
		System.out.println("====================");
		return a;
			
		}
}
