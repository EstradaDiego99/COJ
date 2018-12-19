import java.util.Scanner;
public class COJ1603{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        while(!input.equals("0 0")){
            String[] separado = input.split("\\s+");
            int a = Integer.valueOf(separado[0]);
            int b = Integer.valueOf(separado[1]);
            int c = 0;
            while(a>0 && b>0){
                if(a%10 + b%10 >= 10){
                    c++;
                }
                a /= 10;
                b /= 10;
            }
            switch (c){
                case 0:
                System.out.println("No carry operation.");
                break;
                case 1:
                System.out.println("1 carry operation.");
                break;
                default:
                System.out.println(c +" carry operations.");
                break;
            }
            input = scan.nextLine();
        }
    }
    
}