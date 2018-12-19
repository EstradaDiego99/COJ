import java.util.Scanner;
public class COJ2264{
	
	public static void main(String[] args) { //ACEPTADO
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		int y = scan.nextInt();
		int x = scan.nextInt();
		int c = scan.nextInt();

		char[] dir = new char[c];
		int[] dist = new int[c];

		for (int i=0; i<c; i++) {
			dir[i]=scan.next().charAt(0);
			dist[i]=scan.nextInt();
		}

		for (int i=0; i<c; i++) {
			switch(dir[i]){
				case 'E': x = x-dist[i];
				break;
				case 'N': y = y+dist[i];
				break;
				case 'S': y = y-dist[i];
				break;
				case 'W': x = x+dist[i];
				break;
			}
		}

		System.out.println(y+" " +x);
	}
}