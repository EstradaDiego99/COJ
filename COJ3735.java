import java.util.Scanner;
public class COJ3735{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int h=0; h<t; h++) {
			
			int n = scan.nextInt();

			char[] c = scan.next().toCharArray();
			int[] letras = new int[26];

			for (int i=0; i<c.length; i++) {
				letras[c[i]-65]++;
			}

			
		}
	}

}