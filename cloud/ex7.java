/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.RomaZamoiski.maintask03;
import java.util.Vector;
/**
 *
 * @author Roman
 */
public class ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Double> v = new Vector<Double>();
        Vector<Double> d = new Vector<Double>();
        int n = (int)(Math.random()*20);
        
        for(int i=0; i<n; i++){
            v.add((double)Math.random()*999);
            d.add((double)Math.random()*999);
        }
        
        for(int i=0; i<n; i++){
            System.out.println(v.get(i));
        }
        
        System.out.println("selection sort " + selectionSort(v));
        System.out.println("bubble sort " + bubbleSort(v));
        System.out.println("insertion sort" + insertionSort(v));
        System.out.println("merge sort" + mergeSort(v,d));
    }
    
    public static Object selectionSort(Vector<Double> v){
        for(int i=0; i<v.size(); i++){
            double min=v.get(i);
            int minI=i;
            
            for(int j=i+1; j<v.size(); j++){
                if(v.get(j)<min){
                    min=v.get(j);
                    minI=j;
                }
            }    
                if(i!=minI){
                    double tmp=v.get(i);
                    v.setElementAt(v.get(minI), i);
                    v.setElementAt(tmp, minI);
                }
            
        }
        return v;
    }
    
    public static Object bubbleSort(Vector<Double> v){
        for(int i=v.size()-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(v.get(j)>v.get(j+1)){
                    double tmp = v.get(j);
                    v.setElementAt(v.get(j+1), j);
                    v.setElementAt(tmp, j+1);
                }
            }
        }
        return v;
    }
    
    public static Object insertionSort(Vector<Double> v){
        for(int i=1;i<v.size();i++){
		for(int j=i; j>0 && v.get(j-1)>v.get(j);j--){
			double tmp=v.get(j-1);
                        v.setElementAt(v.get(j), j-1);
			v.setElementAt(tmp, j);
			
                }
        }
        return v;
    }
    
    public static Object mergeSort(Vector<Double> v, Vector<Double> d){
        Vector<Double> vd = new Vector<Double>();
        for(int i=0; i<v.size()+d.size();i++){
            vd.add(1.0);
        }
        int i=0, j=0;
    for (int k=0; k<(v.size()+d.size()); k++) {

        if (i > (v.size()-1)) {
            double a = d.get(j);
            vd.setElementAt(a, k);
            j++;
        }
        else if (j > (d.size()-1)) {
            double a = v.get(i);
            vd.setElementAt(a, k);
            i++;
        }
        else if (v.get(i) < d.get(j)) {
            double a = v.get(i);
            vd.setElementAt(a, k);
            i++;
        }
        else {
            double a = d.get(j);
            vd.setElementAt(a, k);
            j++;
        }
    }
        return vd;
    }
}
