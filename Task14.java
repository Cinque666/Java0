/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1.pkg4;
import java.util.*;
/**
 *
 * @author Roman
 */
public class Task14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] arr = new int[4];
        Scanner c = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        int a, k = 0; //curNum=1, oldNum=2;
        
        while(true){
            System.out.print("Введите четырехзначное число для проверки: ");
            a=c.nextInt();
            if(a >= 1000 && a <= 9999){
                break;
            } 
            else {
                System.out.println("Попробуйте еще раз");
            }
        }
                
        while(a > 0.1){
            k=a%10;
            a/=10;
            b.add(k);
        }
        
        for(int i=0; i<b.size();i++){
        
            System.out.println(b.get(i));
        }
        
        if(b.get(0) > b.get(1) && b.get(1) > b.get(2) && b.get(2) > b.get(3)){
            System.out.println("Последовательность возрастающая");
        }
        if(b.get(0) < b.get(1) && b.get(1) < b.get(2) && b.get(2) < b.get(3)){
            System.out.println("Последовательность убывающая");
        }
        else{
            System.out.println("Цифры не образуют последовательность");
        }
            
    }
    
}
