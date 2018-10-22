/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.pkg3.pkg1;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class Task2_3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        String letter="";
        
        System.out.print("Введите букву для проверки. Латинского алфавита: ");
        letter=c.next();
        
        switch(letter){
            case "a":
            case "e":
            case "y":
            case "u":
            case "i":
            case "o":
                System.out.println("Введённая буква является гласной");
                break;
            default:
                System.out.println("Введённая буква является согласной");
                break;
        }
    }
    
}
