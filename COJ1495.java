// Diego Estrada Talamantes
// devdiegoest@gmail.com

import java.util.Scanner;
import java.util.Arrays;
public class COJ1495{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] nums = new int[n];

        while(n>0){
            nums[n-1] = scan.nextInt();
            n--;
        }

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    
}