/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ZamoiskiRoman.tasks.maintask03;
import java.util.ArrayList;
/**
 *
 * @author Roman
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    ArrayList<Double> v = new ArrayList<Double>();
        int size = (int) (Math.random()*10);
        double[] el = new double[size];
        
        for(int i=0; i<size; i++){
            double element = (double)(Math.random()*999);
            v.add(element);
            el[i]=v.get(i);
        }
        
        System.out.println("max= " + maxElement(el));
        System.out.println("min= " + minElement(el));
    }
    
    /**
     * return -1 if array length less than 1
     * return first array element of array length equals 1
     * else it will find maxValue and return it
     * 
     * @param max
     * @return 
     */
    public static double maxElement(double[] max){
        Double maxValue;
        
            try{
                maxValue=max[0];
            }
            catch(Exception e){
                return -1;
            }
            
        if(max.length==1){
            return max[0];
        }
        else{
            
            for(int i=0; i<max.length; i++){
                if(maxValue<max[i]){
                    maxValue = max[i];
                }
            }
            
            return maxValue;
        }
    }
    
    /**
     * return -1 if array length less than 1
     * return first array element of array length equals 1
     * else it will find minValue and return it
     * 
     * @param min
     * @return 
     */
    public static double minElement(double[] min){
        Double minValue;
            try{
                minValue=min[0];
            }
            catch(Exception e){
                return -1;
            }
            
        if(min.length==1){
                return min[0];
        }
        else{
                
            for(int i=0; i<min.length; i++){
                if(minValue>min[i]){
                    minValue = min[i];
                }
            }
            
            return minValue;
        }
    }
}