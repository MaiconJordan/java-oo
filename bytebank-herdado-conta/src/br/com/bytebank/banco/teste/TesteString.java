package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

//		String nome = "Alura";
//		
//		
//		String comreplace = nome.replace("A", "C");
//		
//		String minuscula = nome.toLowerCase();
//		
//		
//		System.out.println(comreplace);
//		System.out.println(minuscula);
//		System.out.println(nome);  
//		
		String nome = "Alura";

		String sub = nome.substring(1);
		System.out.println(sub);
		
		String nome1 = "Alura";

		int pos = nome1.indexOf("ur");
		System.out.println(pos);
		
		String nome111 = "Alura";
		System.out.println(nome111.length());
		
		String nome11 = "Alura";
		System.out.println(nome11.length());

		for(int i = 0; i < nome11.length(); i++) {
		    System.out.println(nome11.charAt(i));
		}
		
		String vazio = "";
		System.out.println(vazio.isEmpty());
		
		String vazio1 ="    Alura    ";
		String outroVazio = vazio1.trim(); 

		System.out.println(outroVazio);
		
		String vazio11 ="    Alura    ";
		String outroVazio1 = vazio11.trim(); 

		System.out.println(vazio11.contains("Alu"));
		
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		System.out.println(texto); 
		
	}
}
