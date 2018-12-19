import java.util.Scanner;
public class COJ2362{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int output = 0;
        int m = scan.nextInt();
        while(m>0){
            int n = scan.nextInt();
            output = 1;
            while(n>1){
                output += 4*(n-1);
                n--;
            }
            System.out.println(""+output);
            m--;
        }
    }
}