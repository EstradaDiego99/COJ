import java.util.Scanner;
import java.text.DecimalFormat;
public class COJ2650{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		float x = scan.nextFloat();
		float y = scan.nextFloat();

		float output = (x-y)/x;
		DecimalFormat df = new DecimalFormat("0.00"); 

		System.out.println(df.format(output));
	}
}