/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package task1.pkg3;
import java.util.Scanner;
/**
 *
 * @author Roman Zamoiski
 */
public class Task13 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int r1 = 0, r2 = 0;
        double S = 0;
        
        while(true){
            System.out.print("Введите внешний радиус кольца R1,"
                    + "он должен быть больше внутреннего: ");
            r1=c.nextInt();
            System.out.print("Введите внутренний радиус кольца R2,"
                    + "он должен быть меньше внешнего: ");
            r2=c.nextInt();
            
            if(r1>r2){
                break;
            } else System.out.println("Попробуйте еще раз");
        }
        
        S=Math.PI*Math.pow(r1,2)-Math.PI*Math.pow(r2,2);
        System.out.println("Площадь кольца равна: "+ S);
    }
    
}
