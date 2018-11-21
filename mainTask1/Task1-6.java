/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task1.pkg6;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Roman Zamoiski
 */
public class Task16 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        ArrayList<Integer> b = new ArrayList<Integer>();
        int N=0, k=0;
        String num="";
        
        while(true){
            System.out.print("Введите cемизначное число: ");
            N=c.nextInt();
            if(N >= 1000000 && N <= 9999999){
                break;
            } 
            else {
                System.out.println("Попробуйте еще раз");
            }
        }
        
        while(N > 0.1){
            k=N%10;
            N/=10;
            b.add(k);
        }
        
        for(int i = 0; i < b.size(); i++){
            num+=b.get(i);
        }
        
        N=Integer.parseInt(num);
        System.out.println(N);
    }
    
}
