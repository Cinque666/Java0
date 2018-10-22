/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg7;
import java.util.Scanner;

/**
 *
 * @author Roman
 */
public class Task17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        System.out.println("Введие числа a, b: ");
        int a=c.nextInt(),b=c.nextInt();
        
        a*=100;
        b*=100;
        a+=b;
        b=a-b;
        a-=b;
        a/=100;
        b/=100;
        
        System.out.println(a + " " + b);
    }
    
}
