/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg1;
import java.util.*;

/**
 *
 * @author Roman
 */
public class Task11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int a = 0, b = 0, d = 0;
        
        System.out.print("Введите первое число для сравнения (а) : ");
        a=c.nextInt();
                
        System.out.print("Введите второе число для сравнения (b) : ");
        b=c.nextInt();
                
        System.out.print("Введите третье число для сравнения (d) : ");
        d=c.nextInt();
        
        if(a==b && b==d){
            System.out.println("Числа равны");
        }
        else System.out.println("Числа различны");
        
    }
    
}
