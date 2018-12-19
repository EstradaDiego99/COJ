import java.util.Scanner;
public class COJ1003{
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while(t>0){
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] votes = new int[n];
            while(m>0){
                for(int i=0; i<n; i++){
                    votes[i] += scan.nextInt();
                }
                m--;
            }

            int aux = n-1;
            while(n>0){
                if(votes[n-1]>=votes[aux]){
                    aux = n-1;
                }
                n--;
            }

            aux++;

            System.out.println(aux);

            t--;
        }
        
    }
}