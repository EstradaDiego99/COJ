import java.util.Scanner;
import java.util.Arrays;
public class COJ1099{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int[] valores = new int[3];
        valores[0] = scan.nextInt();
        valores[1] = scan.nextInt();
        valores[2] = scan.nextInt();
        while(valores[0]!=0 && valores[1]!=0 && valores[2]!=0){
            Arrays.sort(valores);
            if((valores[0]*valores[0])+(valores[1]*valores[1])==(valores[2]*valores[2])){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
            valores[0] = scan.nextInt();
            if(valores[0]==0){
                break;
            }
            valores[1] = scan.nextInt();
            valores[2] = scan.nextInt();
        }
    }
    
}