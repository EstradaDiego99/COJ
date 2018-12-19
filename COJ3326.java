import java.util.Scanner;
public class COJ3326{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for (int h=0; h<t; h++) {
			int n = scan.nextInt();
			String[] palabras = new String[n];
			for (int i=0; i<n; i++) { palabras[i] = scan.next();
			}
			for (int i=0; i<n; i++) {
				if (i==n-1) { System.out.println("-1");
				}
				else if(palabras[i+1].compareTo(palabras[i])>0){ System.out.print(i+2 + " ");
				}
				else{ System.out.print("-1 ");
				}
			}
		}
	}
}