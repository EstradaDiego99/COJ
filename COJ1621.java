import java.util.Scanner;
public class COJ1621{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int [] palos = new int[n];
		for (int i=0; i<n; i++) { palos[i]=scan.nextInt();
		}

		boolean[] ocup = new boolean[n];
		int d = 0;

		for (int i=0; i<n; i++) {
			if (ocup[i]==false) {
				int c = 1;
				for (int j=i+1; j<n; j++) {
					if (palos[j]==palos[i] && ocup[j]==false) {
						c++;
						ocup[j]=true;
					}
				}
				d = d+(c/2);
			}
		}
		System.out.println(d/2);
	}
}