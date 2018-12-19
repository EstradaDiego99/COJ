import java.util.Scanner;
public class COJ2842{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int q = scan. nextInt();
		for (int h=0; h<q; h++) {
			int a = scan.nextInt();
			int b = scan.nextInt();

			int c = 0; //contador
			for (int i=a; i<b; i++) {
				int d = String.valueOf(i).length();
				boolean palindromo=true;
				for (int j=0; j<Math.ceil(d/2); j++) {
					if (i%Math.pow(10,d)!=i%Math.pow(10,j+1)||) {
						System.out.println("No palindromo");
						palindromo = false;
						break;
					}
				}
				if (palindromo==true) { c++;
				}
			}
			System.out.println(c);
		}
	}
}