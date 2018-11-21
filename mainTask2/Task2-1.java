/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task3.pkg1;
import java.util.Random;
/**
 *
 * @author Roman Zamoiski
 */
public class Task31 {

    /**
     * Test method
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int heads=headsOrTails(1000);
        System.out.println("Орёл выпал: " + heads 
                + " раз, решка: " + (1000-heads));
    }
    
    /*
    * 
    * Calculate heads and tails
    */
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
