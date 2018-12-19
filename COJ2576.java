import java.util.Scanner;
public class COJ2576{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int[] letras = new int[26];
		for (int i=0; i<t; i++) {
			char letra = scan.next().charAt(0);
			//System.out.println(letra);
			//System.out.println((int) letra);
			letras[(int) letra-97]++;
		}
		boolean ff=true;
		for (int i=0; i<26; i++) {
			if (letras[i]>=5) { System.out.print((char) (i+97)); ff = false;
			}
		}
		if (ff==true) { System.out.println("PREDAJA");
		}
	}
}