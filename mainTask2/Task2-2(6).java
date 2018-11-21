/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg2.pkg6;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_2_6 {

    /**
     * Test
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=122121111;
        if(isNaturalNum(m)){
            System.out.println(numOfDifferentDigits(m));
        }
    }
    
    public static int numOfDifferentDigits(int num){
        String c = String.valueOf(num);
        int count=0;
        for(int i = 0; i <= 9; i++){
            if(c.contains(String.valueOf(i))){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        return true;
    }
}
