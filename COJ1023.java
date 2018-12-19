import java.util.Scanner;
public class COJ1023{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double sum = 0;
        double c = 12;
        while(c>0){
            sum += scan.nextDouble();
            c--;
        }

        System.out.print("$");
        System.out.printf("%.2f",sum/12.0);
    }
}