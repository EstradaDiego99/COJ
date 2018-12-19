import java.util.Scanner;
import java.math.BigInteger;
public class COJ3093{ //ACEPTADO
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String input = scan.next();
		char[] letras = input.toCharArray();

		BigInteger multiplicacion = new BigInteger("1");
		for (int i=0; i<letras.length; i++) {
			multiplicacion = multiplicacion.multiply(BigInteger.valueOf(letras[i]-64));
		}

		BigInteger mod = new BigInteger("26");
		//System.out.println(multiplicacion);
		BigInteger output = multiplicacion.mod(mod);

		if (output.compareTo(BigInteger.TEN) < 0) {
			System.out.print("0");
			System.out.println(output);
		}
		else{
			System.out.println(output);
		}
	}
}