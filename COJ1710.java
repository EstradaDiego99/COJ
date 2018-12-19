import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class COJ1710{
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        for(int i=0; i<t; i++){
            int n = scan.nextInt();
            int c = 0;
            for(int primo : primos){
                if(primo>n){
                    break;
                }
                if(n%primo==0){
                    c++;
                }
            }
            System.out.println(c);
        }*/
        //HashSet<Integer> primos = getPrimos();
        int t = scan.nextInt();
        HashMap<Integer,Integer> primos = new HashMap<>();
        for(int k=0; k<t; k++){
            int n = scan.nextInt();
            System.out.println(getPrimos(primos,n,n));
        }
    }

    public static HashSet<Integer> getPrimos(){
        HashSet<Integer> primos = new HashSet<>();
        for(int i=0; i<=1000000000; i++){
            System.out.println("i: "+i);
            primos.add(i);
        }
        int i=2;
        while(i<1000000000){
            System.out.println("i: "+i);
            int j=i;
            while(i*j<1000000000){
                primos.remove(i*j);
            }
            i++;
            while(!primos.contains(i)){
                i++;
            }
        }
        return primos;
    }

    public static int getPrimos(HashMap<Integer,Integer> primos, int n, int lastPrime){
        if(n==1){
            return 0;
        } else if(primos.containsKey(n)){
            return primos.get(n);
        }
        int i=2;
        while(n%i!=0 && i<n){
            i++;
        }
        if(i==lastPrime){
            primos.put(n, getPrimos(primos, n/i,i));
        } else{
            primos.put(n, getPrimos(primos, n/i,i)+1);
        }
        return primos.get(n);
    }
}