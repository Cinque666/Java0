/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task1.pkg7;
import java.util.Scanner;

/**
 *
 * @author Roman Zamoiski
 */
public class Task17 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        System.out.println("Введие числа a, b: ");
        int a=c.nextInt(),b=c.nextInt();
        
        a+=b;
        b=a-b;
        a-=b;
                
        System.out.println(a + " " + b);
    }
    
}
