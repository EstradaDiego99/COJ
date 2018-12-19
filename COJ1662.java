import java.util.Scanner;
public class COJ1662{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for(int h=1; h<=t; h++){
            String str = scan.next();
            String[] part = str.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
            System.out.print("Case "+h+": ");
            for(int i=0; i<part.length; i+=2){
                for(int j=0; j<Integer.parseInt(part[i+1]); j++){
                    System.out.print(part[i]);
                }
            }
            System.out.println();
        }

    }
    
}