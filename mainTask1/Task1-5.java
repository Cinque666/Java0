/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task1.pkg5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Roman Zamoiski
 */
public class Task15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        int a=0, k=0; 
        double arif=0, geom=1;
        
        while(true){
            System.out.print("Введите шестизначное число: ");
            a=c.nextInt();
            if(a >= 100000 && a <= 999999){
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
        
        for(int i=0; i < b.size(); i++){
            arif+=b.get(i);
        }
        arif/=b.size();
        System.out.println("Среднее арифметическое равно: " + arif);
        
        for(int i=0; i < b.size(); i++){
            geom*=b.get(i);
        }
        geom=Math.pow(geom,b.size());
        System.out.println("Среднее геометрическое равно: " + geom);
    }
    
}
