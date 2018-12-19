import java.util.Scanner;
import java.util.StringTokenizer;
public class COJ1680{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            
            //StringTokenizer output = new StringTokenizer(scan.next());
            String str = scan.next();
            String toRemove = scan.next();
            
            System.out.println(str.replaceAll(toRemove, ""));
        }
    }
}