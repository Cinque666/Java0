/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ZamoiskiRoman.mainTask03;
import java.util.*;
/**
 *
 * @author User
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Double> v = new Vector<Double>();
        int n = (int)(Math.random()*10);
        
        for(int i = 0; i < n; i++){
            v.add((double)Math.random()*999);
        }
        
        double[] vector = new double[v.size()];
        for(int i = 0; i < n; i++){
            System.out.println(v.get(i));
        }
        
        for(int i = 0; i < n; i++){
            vector[i]=v.get(i);
        }
        
        System.out.println(isAccending(vector));
        System.out.println(isDescending(vector));
    }
    
    public static boolean isAccending(double[] accend){
        int num = 0;
 
         for (int i = 0; i < accend.length-1; i++) {
             if (accend[i + 1] > accend[i]) {
                 num++;
             }
         }
 
         return num==accend.length-1;
     }
    
    public static boolean isDescending(double[] accend){
        int num = 0;
 
         for (int i = 0; i < accend.length-1; i++) {
             if (accend[i + 1] < accend[i]) {
                 num++;
             }
         }
 
         return num==accend.length-1;
     }
}


