import java.util.Scanner;
//import java.math.BigInteger;
public class COJ3426{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//BigInteger a = scan.nextBigInteger();
		//BigInteger b = scan.nextBigInteger();

		//BigInteger dos = new BigInteger("2");

		//BigInteger c = (a.add(b).subtract(BigInteger.ONE)).multiply(a.add(b)).divide(dos).subtract(a.subtract(b));

		long a = scan.nextLong();
		long b = scan.nextLong();

		long c = (a+b-1)*(a+b)/2;
		//System.out.println(c);
		c = c - (Math.abs(a-b))*(Math.abs(a-b)+1)/2;

		System.out.println(c);
	}
}