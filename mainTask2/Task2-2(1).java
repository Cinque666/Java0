/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg2.pkg1;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_2_1 {
//boolean naturalNum;
    /**
     * Test method
     */
    public static void main(String[] args) {
        int x=6735;
        if(isNaturalNum(x)){
            System.out.println(greatestNum(x));
        }
    }
    
    /*
    * 
    * checks numbers for naturalness 
    */
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    /*
    * Finds greatest number 
    * 
    */
    public static int greatestNum(int num){
        int x=0, max=num%10;
        while(num > 0){
            x=num%10;
            num/=10;
            
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    
}
