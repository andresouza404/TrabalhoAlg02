package Principal;

public class CriarStrings {
	
	public static String[] Instituicao = new String [3];
	public static String[] Evento = new String [3];
	public static String[] Data = new String [2];
	public static String[] Sala = new String [2];
	
	public static void run(){
		inst(Instituicao);
		even(Evento);
		data(Data);
		sala(Sala);		
	}
	
	private static String[] inst(String a[]){
		a[0] = "Instituto Xavier.";
		a[1] = "Escola Hogwarts.";
		a[2] = "Cidadela de Vilavelha.";
		return a;
	}
	private static String[] even(String a[]){
		a[0] = "Oktoberfest.";
		a[1] = "Feira do Livro.";
		a[2] = "Festa da Boa Vizinhança.";
		return a;
	}
	private static String[] data(String a[]){
		a[0] = "5/11";
		a[1] = "10/10";
		return a;
	}
	private static String[] sala(String a[]){
		a[0] = "Sala 1";
		a[1] = "Sala 2";
		return a;
	}
}
