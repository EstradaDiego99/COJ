import java.util.Scanner;
public class COJ1049{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        /*
        int output = (n*(n+1))/2;
        */

        int output = 0;

        if(n<0){
            output = ((Math.abs(n)*(n-1))/2)+1;
        } else{
            output = (n*(n+1))/2;
        }
        
        System.out.println(output);

    }
}