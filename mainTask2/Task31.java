/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg1;
import java.util.Random;
/**
 *
 * @author Roman
 */
public class Task31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int heads=headsOrTails(1000);
        System.out.println("Орёл выпал: " + heads 
                + " раз, решка: " + (1000-heads));
    }
    
    public static int headsOrTails(int n){
        int a=0, heads=0;
        for(int i=0; i<n; i++){
            a=(int)(Math.random()*2);
            if(a==0){
                heads++;
            }
        }
        return heads;
    }
    
}

    
