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
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Double> arr = new ArrayList<Double>();
        int n = (int) (Math.random()*20);
        
        for(int i=0;i<n;i++){
            arr.add(Math.random()*999);
        }
        for(int i = 0; i< n; i++){
            System.out.println(arr.get(i));
        }
        
        System.out.println(localMinimum(arr));
        System.out.println(localMaximum(arr));
    }
    
    public static int localMinimum(ArrayList<Double> arr){
        int i=0;
        //boolean a=true;
        while(i < (arr.size()-1)){
            i++;
            
            try{
                if(arr.get(i) < arr.get(i-1) && arr.get(i) < arr.get(i+1)){
                    return i;
                }
            }
            catch(Exception e){
                return -1;
            }    
        }
        return -1;
    }
    
    public static int localMaximum(ArrayList<Double> arr){
        int i=0;
        //boolean a=true;
        while(i < (arr.size()-1)){
            i++;
            
            try{
                if(arr.get(i) > arr.get(i-1) && arr.get(i) > arr.get(i+1)){
                    return i;
                }
            }
            catch(Exception e){
                return -1;
            }
            
        }
        return -1;
    }
    
}
