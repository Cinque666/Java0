/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg2.pkg4;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_2_4 {

    /**
     * Test
     */
    public static void main(String[] args) {
        int x=12;
        if(isNaturalNum(x)){
            for(int i = 1; i <= x; i++){
                if(x%i==0 && isPrimeNum(i) && i%2!=0){
                    System.out.println(i);
                }
            }
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    public static boolean isPrimeNum(int num){
        
        for(int x=2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}
