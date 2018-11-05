/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.ZamoiskiRoman.tasks.mainTask03;
import java.util.Vector;
/**
 *
 * @author Roman
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Double> v = new Vector<Double>();
        v.add(1.0); v.add(123.345);
        
        linearSearch(v, 1.0);
        binarySearch(v, 1.0);
    }
    
    public static void linearSearch(Vector<Double> v, double num){
        for(int i=0; i < v.size(); i++){
            if(v.get(i)==num){
                System.out.println("Элемент находится в векторе под номером: " 
                        + i);
                break;
            }
        }
    }
    
    public static void binarySearch(Vector<Double> v, double num){
        int position, first=0, last=v.size()-1;
        
        position=(first+last)/2;
        
        while((v.get(position)!=num) && (first<=last)){
            if(v.get(position)>num){
                last=position-1;
            }
            else{
                first=position+1;
            }
            position=(first+last)/2;
        }
        if(first<=last){
            System.out.println(num + "Находится на позиции: "+ ++position);
        }
        else{
            System.out.println(num + " Не является элементом вектора");
        }
    }
    
    
}
