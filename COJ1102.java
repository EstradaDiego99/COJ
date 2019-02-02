// Diego Estrada Talamantes
// devdiegoest@gmail.com

import java.math.BigInteger;
import java.util.Scanner;
public class COJ1102{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String num = scan.next();
        while(!num.equals("0")){
            if(isMultiploDe11(num)){
                System.out.println(num + " is a multiple of 11.");
            } else{
                System.out.println(num + " is not a multiple of 11.");
            }
            num = scan.next();
        }

        
    }

    // No hay necesidad de BigIntegers, ahora que lo pienso XD
    /*
    public static boolean isMultiploDe11(String num){
        BigInteger sumA = new BigInteger("0");
        BigInteger sumB = new BigInteger("0");
        for(int i=0; i<num.length(); i++){
            if(i%2==0){
                sumA.add(new BigInteger(""+num.charAt(i)));
            } else{
                sumB.add(new BigInteger(""+num.charAt(i)));
            }
        }
        if(sumA.subtract(sumB).equals(BigInteger.ZERO)){
            return true; 
        } else if(){
            return false;
        } else{
            return isMultiploDe11(""+sumA.subtract(sumB).toString());
        }
    }
    */

    public static boolean isMultiploDe11(String num){

        // num can be up to 1000 digits

        short sumA = 0;
        short sumB = 0;

        for(int i=0; i<num.length(); i++){
            if(i%2==0){
                sumA += Character.getNumericValue(num.charAt(i));
            } else{
                sumB += Character.getNumericValue(num.charAt(i));
            }
        }

        // max value of sumA, sumB and their difference
        // can be 500*9 = 4500

        if((sumA-sumB)%11==0){
            return true;
        } else{
            return false;
        }

    }

    
    
}