import java.util.Scanner;
public class COJ2445{ //ACEPTADO
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char[] array = input.toCharArray();
		int[] intArray = new int[array.length];

		int record = 0;
		int maximo = 0;
		for (int i=0; i<array.length; i++) {
			for (int j=i+1; j<array.length; j++) {
				if (array[i]<91) { //Mayúscula
					if (array[j]<91) { //Dos mayúsculas
						if (array[i]>array[j]) { intArray[i]++;
						}
						else{ break;
						}
					}
					else{ intArray[i]++; //Mayúscula y minúscula
					}
				}
				else if (array[j]>96 && array[i]>array[j]) {
					//Minúscula pero mayor que la otra minúscula
					intArray[i]++;
				}
				else{ break;
				}
				/*
				if (array[i]<array[j]) { intArray[i]++;
				}
				else{ break;
				}
				*/
			}
			//System.out.println("El char "+i+" se puede comer a "+intArray[i]);
			if (intArray[i]>record) { record = intArray[i]; maximo = i;
			}
			else if(intArray[i]==record){
				if (array[i]>array[maximo]) { maximo = i;
				}
			}
		}

		System.out.println(array[maximo]);


	}
}