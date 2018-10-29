/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.pkg3.pkg2;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class Task2_3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        String[] arr = {"e", "y", "u", "i", "o", "a"};
        String letter="";
        boolean isVowel=false;
        
        System.out.print("Введите букву латинского алфавита для проверки: ");
        letter = c.next();
        
        for(int i=0; i<arr.length;i++){
            if(arr[i].equals(letter)){
                isVowel=true;
                break;
            }else isVowel=false;
        }
        if(isVowel==true){
            System.out.println("Введена гласная буква");
        }else System.out.println("Введена согласная буква");
    }
    
}
