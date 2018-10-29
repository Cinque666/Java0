/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.pkg1;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class Task21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int x1,x2,x3,y1,y2,y3;
        double a,b,d;
        
        System.out.println("Введите координаты первой точки: ");
        System.out.print("x1: ");
            x1=c.nextInt();
        System.out.print("y1: ");
            y1=c.nextInt();
        
        System.out.println("Введите координаты второй точки: ");
        System.out.print("x2: ");
            x2=c.nextInt();
        System.out.print("y2: ");
            y2=c.nextInt();
        
        System.out.println("Введите координаты третьей точки: ");
        System.out.print("x3: ");
            x3=c.nextInt();
        System.out.print("y3: ");
            y3=c.nextInt();
            
        if(y1==y2 && y2==y3 || x1==x2 && x2==x3){
            System.out.println("Вырожденный треугольник");
        }
        else{
           a=Math.sqrt((Math.pow((x2-x1),2) 
                   + Math.pow((y2-y1),2)));
           b=Math.sqrt((Math.pow((x3-x2),2) 
                   + Math.pow((y3-y2),2)));
           d=Math.sqrt((Math.pow((x3-x1),2) 
                   + Math.pow((y3-y1),2)));
           //System.out.println(a + " " + b + " " + d);
           
           if(d==Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)) || 
                   a==Math.sqrt(Math.pow(b, 2)+Math.pow(d, 2)) || 
                   b==Math.sqrt(Math.pow(a, 2)+Math.pow(d, 2))){
               System.out.println("Треугольник прямоугольный");
           }
        }
    }
    
}
