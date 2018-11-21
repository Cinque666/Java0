/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg2.pkg5;

/**
 *
 * @author Roman Zamoiski
 */
public class Task3_2_5 {

    /**
     * Test
     */
    public static void main(String[] args) {
        int x=45, y=31;
        if(isNaturalNum(x) && isNaturalNum(y)){
            System.out.println("НОД: " + greatestСommonDivisor(x, y));
            System.out.println("НОК: " + x*(y/greatestСommonDivisor(x, y)));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    public static int greatestСommonDivisor(int num1, int num2){
        while(num1!=0 && num2!=0)
            if(num1 > num2){
                num1%=num2;
            }
            else{
                num2%=num1;
            }
        
        return num1+num2;
        }
    
}
