/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.pkg2;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class Task22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int heads = 3, eyes=heads*2;
        
        System.out.print("Введите количество лет: ");
        int N = c.nextInt();
        
        for(int i = 1; i <= N; i++){
            if(i<200){
                heads+=3;
                eyes=heads*2;
            }
            if(i<300){
                heads+=2;
                eyes=heads*2;
            }
            if(i>=300){
                heads+=1;
                eyes=heads*2;
            }
        }
        System.out.println("Количество голов и глаз: "+ heads + " " + eyes);
    }
    
}
