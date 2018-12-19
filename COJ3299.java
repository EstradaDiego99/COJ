import java.util.Scanner;
public class COJ3299{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		long a, b;
		do{
			a = scan.nextLong();
			b = scan.nextLong();

			if (a!=0 && b!=0) {
				int c = 0; //contador
				long x = (long) Math.sqrt(a*2); //el numero a gaussear
				while(true){
					if ((x)*(x+1)/2>=a && (x)*(x+1)/2<=b) {
						//System.out.println("Probando");
						c++; x++;
					}
					else if((x)*(x+1)/2>b){ break;
					}
					else if((x)*(x+1)/2<a){ x++;
					}
				}

				System.out.println(c);
			}

		} while(a!=0 && b!=0);
	}
}