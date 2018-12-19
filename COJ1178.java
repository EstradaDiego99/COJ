import java.util.Arrays;
import java.util.Scanner;
public class COJ1178{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t>0){
            int n = scan.nextInt();
            int[] precios = new int[n];
            for(int i=0; i<n; i++){
                precios[i]=scan.nextInt();
            }
            Arrays.sort(precios);
            int discount = 0;
            while(n>=3){
                discount += precios[n-3];
                n -= 3;
            }
            System.out.println(discount);
            t--;
        }
    }
    
}