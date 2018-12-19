import java.util.Scanner;
public class COJ3658{ //ACEPTADO
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		long[] primero = new long[3];
		primero[0] = scan.nextLong();
		primero[1] = scan.nextLong();
		primero[2] = scan.nextLong();

		long[] segundo = new long[3];
		segundo[0] = scan.nextLong();
		segundo[1] = scan.nextLong();
		segundo[2] = scan.nextLong();

		boolean next=false;
		if (primero[0]>primero[1] && primero[0]>primero[2] && Math.pow(primero[0],2)==Math.pow(primero[1],2)+Math.pow(primero[2],2)) { next=true;
		}
		else if (primero[1]>primero[0] && primero[1]>primero[2] && Math.pow(primero[1],2)==Math.pow(primero[2],2)+Math.pow(primero[0],2)) { next=true;
		}
		else if (primero[2]>primero[0] && primero[2]>primero[1] && Math.pow(primero[2],2)==Math.pow(primero[0],2)+Math.pow(primero[1],2)) { next=true;
		}

		boolean[] ocup = new boolean[3];
		if (next==true) {
			int yes=0;
			for (int i=0; i<3; i++) {
				for (int j=0; j<3; j++) {
					if (primero[i]==segundo[j] && ocup[j]==false) { yes++; ocup[j]=true; break;
					}
				}
			}
			if (yes==3) { System.out.println("YES");
			}
			else{ System.out.println("NO");
			}
		}
		else{ System.out.println("NO");
		}
	}
}