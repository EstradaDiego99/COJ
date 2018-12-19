import java.util.Scanner;
public class COJ1807{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		scan.nextLine();
		for (int h=0; h<t; h++) {
			String s = scan.nextLine();
			if (s.length()>0) {
				int errores = 0;
				for (int i=0; i<s.length(); i++) {
					if (s.charAt(i)=='#') {
						errores++;
					}
				}
				double efRatio = 100;
				if (errores>0) {
					efRatio = (s.length()-errores)*100/((double) s.length());
				}
				System.out.println("Efficiency ratio is "+ String.format("%.1f",efRatio)+"%");
			} else{
				h--;
			}
		}
	}
}