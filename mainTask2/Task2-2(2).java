/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg2.pkg2;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_2_2 {

    /**
     * Test
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=12321;
        String x1 = String.valueOf(x);
        if(isNaturalNum(x)){
            if(reverseNum(x).equals(x1)){
                System.out.println("Число - полиндром");
            }
            else{
                System.out.println("Число не является полиндромом");
            }
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    public static String reverseNum(int num){
        String x="";
        while (num > 0){
            x+=num%10;
            num/=10;
        }
        return x;
    }
    
}
