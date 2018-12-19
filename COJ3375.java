import java.util.Scanner;
public class COJ3375{
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int a=0; a<t; a++){
            String[] lines = new String[2];
            lines[0] = scan.next();
            lines[1] = scan.next();
            int c = 0;
            for(int i=0; i<lines[0].length(); i++){
                if(lines[0].charAt(i)!=lines[1].charAt(i)){
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}