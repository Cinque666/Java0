/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task1.pkg2;
import java.util.*;
/**
 *
 * @author Roman Zamoiski
 */
public class Task12 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        double m=0;
        
        System.out.print("Введите массу динозавра: ");
        m=c.nextDouble();
                
        System.out.println("Масса динозавра в милиграммах: " 
                + m*1_000_000 + "мг");
        System.out.println("Масса динозавра в граммах: " + m*1000 + "г");
        System.out.println("Масса динозавра в тоннах: " + m/1000 + "т");
    }
    
}
