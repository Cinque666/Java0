/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg3.pkg3;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_3_3 {

    /**
     * Test
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        if(isNaturalNum(x)){
            System.out.println(isPrimeNum(x));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    public static boolean isPrimeNum(int num){
                
        for(int i=2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}
