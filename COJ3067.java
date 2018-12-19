import java.util.Scanner;
import java.util.Arrays;
public class COJ3067{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		long[] lista = new long[n];
		for (int i=0; i<n; i++) { lista[i] = scan.nextLong();
		}

		int q1 = scan.nextInt();
		int q2 = scan.nextInt();
		for (int i=0; i<q1; i++) {
			long pregunta = scan.nextLong();
			boolean sad = true;
			for (int j=0; j<lista.length; j++) {
				if (pregunta==lista[j]) { System.out.println(":)"); sad=false; break;
				}
			}
			if (sad==true) { System.out.println(":(");
			}
		}
		Arrays.sort(lista);
		for (int i=0; i<q2; i++) { System.out.println(lista[scan.nextInt()-1]);
		}
	}
}