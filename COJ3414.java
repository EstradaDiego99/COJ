import java.util.Scanner;
public class COJ3414{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		/*
		for (int i=0; i<100000000; i=i+25) {

			if (i==i%Math.pow(10,d-1)*25 && Math.floor(i/Math.pow(10,d-1))==6) {
				System.out.println(i);
			}
		}*/

		System.out.print("625");
		for (int i=1; i<n; i++) { System.out.print("0");
		}
	}
}