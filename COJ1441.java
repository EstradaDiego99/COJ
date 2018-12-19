import java.util.Scanner;
import java.util.Arrays;
public class COJ1441{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*
        String input = scan.nextLine();
        while(!input.equals("0 0 0")){
            String[] lados = input.split(" ");
            int[] valores = new int[3];
            valores[0] = Integer.valueOf(lados[0]);
            valores[1] = Integer.valueOf(lados[1]);
            valores[2] = Integer.valueOf(lados[2]);
            Arrays.sort(valores);
            if((valores[0]*valores[0])+(valores[1]*valores[1])==(valores[2]*valores[2])){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
            input = scan.nextLine();
        }
        */
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
            valores[1] = scan.nextInt();
            valores[2] = scan.nextInt();
        }
    }
    
}