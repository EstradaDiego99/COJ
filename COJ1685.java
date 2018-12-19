import java.util.HashSet;
import java.util.Scanner;
public class COJ1685{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i]=scan.nextInt();
        }
        HashSet<Integer> complementos = new HashSet<>();
        int x = scan.nextInt();
        for(int num : nums){
            complementos.add(x-num);
        }
        int sumas = 0;
        for(int num : nums){
            if(complementos.contains(num)){
                sumas++;
            }
        }
        sumas /= 2;
        System.out.println(sumas);

    }
}