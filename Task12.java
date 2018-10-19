/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg2;
import java.util.*;
/**
 *
 * @author Roman
 */
public class Task12 {

    /**
     * @param args the command line arguments
     */
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
