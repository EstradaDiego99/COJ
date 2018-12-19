import java.util.Scanner;
import java.math.BigInteger;
public class COJ3475{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BigInteger a = new BigInteger(""+scan.nextInt());
		BigInteger b = new BigInteger(""+scan.nextInt());
		System.out.println(a.multiply(b));
	}
}