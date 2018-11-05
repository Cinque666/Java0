/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ZamoiskiRoman.maintask03;
import java.util.Vector;
/**
 *
 * @author Roman
 */
public class ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Double> v = new Vector<Double>();
        int n=(int)(Math.random()*20);
        
        for(int i=0; i<n; i++){
            v.add(Math.random()*999);
        }
        for(int i=0; i<n; i++){
            System.out.println(v.get(i));
        }
        
        System.out.println(reverseVector(v));        
    }
    
    public static Object reverseVector(Vector<Double> v){
        for(int i=0; i<v.size()/2; i++){
            double tmp=v.get(i);
            v.setElementAt(v.get(v.size()-1-i), i);
            v.setElementAt(tmp, v.size()-1-i);
        }
        return v;
    }
    
}
