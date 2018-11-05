/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ZamoiskiRoman.mainTask03;
import java.util.Vector;
/**
 *
 * @author User
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Double> v = new Vector<Double>();
        
        int n = (int)(Math.random()*20);
        
        for(int i = 0; i < n; i++){
            v.add((double)Math.random()*999);
        }
        double[] vector = new double[v.size()];
        
        for(int i = 0; i < n; i++){
            vector[i]=v.get(i);
        }
        
        for(int i = 0; i < n; i++){
            System.out.println(v.get(i));
        }
        System.out.println(average(vector)+ " " + geometricMean(vector));
        
    }
    
    public static double average(double aver[]){
        double average, sum=0;
        try{
            for(int i = 0; i < aver.length; i++){
                sum+=aver[i];
            }
            average=sum/(aver.length);
            return average;
        }
        catch(Exception e){
            return 0;
        }
        
    }
    
    public static double geometricMean(double geom[]){
        double geometricMean, composition=1;
        try{
            for(int i = 0; i < geom.length; i++){
                composition*=geom[i];
            }
            geometricMean=Math.pow(composition, 1./geom.length);
            return geometricMean;
        }
        catch(IndexOutOfBoundsException e){
            return 0;
        }
    }
    
}
