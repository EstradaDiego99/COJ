import java.util.Scanner;
public class COJ1375{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		while(scan.hasNext()){

			String input = scan.next();
			char[] array = input.toCharArray();

			boolean isPalindrome = isPalindrome(array);
			boolean isMirroredString = isMirroredString(array);

			if (isPalindrome == false && isMirroredString == false) {
				System.out.println(input + " -- is not a palindrome.");
			}
			else if(isPalindrome == true && isMirroredString == false){
				System.out.println(input + " -- is a regular palindrome.");
			}
			else if(isPalindrome == false && isMirroredString == true){
				System.out.println(input + " -- is a mirrored string.");
			}
			else if(isPalindrome == true && isMirroredString == true){
				System.out.println(input + " -- is a mirrored palindrome.");
			}

			System.out.println();
		}
	}

	public static boolean isPalindrome(char[] array){
		for (int i=0; i<array.length; i++) {
			if (array[i]!=array[array.length-i-1]) { return false;
			}
		}
		return true;
	}

	public static boolean isMirroredString(char[] array){
		char[] newArray = mirror(array);
		if (newArray==null) { return false;
		}
		for (int i=0; i<array.length; i++) {
			if (array[i]!=newArray[array.length-i-1]) { return false;
			}
		}
		return true;
	}

	public static char[] mirror(char[] array){
		char[] newArray = new char[array.length];
		boolean invalid;
		for (int i=0; i<array.length; i++) {
			switch(array[i]){
				case 'A': newArray[i]='A'; break;
				case 'E': newArray[i]='3'; break;
				case 'H': newArray[i]='H'; break;
				case 'I': newArray[i]='I'; break;
				case 'J': newArray[i]='L'; break;
				case 'L': newArray[i]='J'; break;
				case 'M': newArray[i]='M'; break;
				case 'O': newArray[i]='O'; break;
				case 'T': newArray[i]='T'; break;
				case 'U': newArray[i]='U'; break;
				case 'V': newArray[i]='V'; break;
				case 'W': newArray[i]='W'; break;
				case 'X': newArray[i]='X'; break;
				case 'Y': newArray[i]='Y'; break;
				case 'Z': newArray[i]='5'; break;
				case '1': newArray[i]='1'; break;
				case '2': newArray[i]='S'; break;
				case '3': newArray[i]='E'; break;
				case '5': newArray[i]='Z'; break;
				case '8': newArray[i]='8'; break;
				default: return null;
			}
		}
		return newArray;
	}
}