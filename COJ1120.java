import java.util.Scanner;
public class COJ1120{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		for (int h=0; h<t; h++) {
			int n = scan.nextInt();
			int suma = 0;
			for (int i=0; true; i++) {

				int auxsuma = suma;

				if (i<=9) { suma = i*(i+1)/2;
				}
				else if(i<=99){ suma = (i*(i+1)/2)+((i-9)*(i-8)/2);
				}
				else if(i<=999){ suma = (i*(i+1)/2)+((i-9)*(i-8)/2)+((i-99)*(i-98)/2);
				}
				else if(i<=9999){
					suma = (i*(i+1)/2)+((i-9)*(i-8)/2)+((i-99)*(i-98)/2)+((i-999)*(i-998)/2);
				}

				if (n<=suma) {
					//System.out.println("nuestra n está en la ronda de "+ i);
					int remainder = n-auxsuma;
					//System.out.println("ocupamos encontrar la pos "+ remainder);
					if (remainder==0) { System.out.println(i-1%10);
					}
					else if (remainder<10) { System.out.println(remainder);
					}
					//Aqui puede haber un error
					else if(remainder<190){
						int auxremainder = remainder - 9;
						if (auxremainder%2==0) {
							System.out.println(((auxremainder%20)-2)/2);
							break;
						}
						else{
							System.out.println(auxremainder/20+1);
						}
						/*
						else{
							System.out.println("No funciona :c");
						}*/
					}

					/*
					else if(remainder<2889){
						int auxremainder = remainder - 189;
						
					}
					else if(remainder<38889){

					}*/


					break;
				}

				/*
				//System.out.println("La suma es "+suma);
				if (n<=suma) {
					//System.out.println("La suma es "+suma);
					System.out.println(n-suma+i);
					break;
				}*/
			}
		}
	}
}