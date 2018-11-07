/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package by.epam.javatraining.Zamoiski.maintask3;

/**
 *
 * @author Roman
 */
public class AdditionalTask {
    public double[][] arr;
    
    AdditionalTask(){
        arr=new double[(int)(Math.random()*50)][(int)(Math.random()*50)];
        initializer();
        //log.error("Constructor");
    }
    
    public final void initializer(){
        try{
            for(int i=0; i < arr.length; i++){
                for(int j=0; i < arr[i].length; i++){
                    this.arr[i][j]=(double)(Math.random()*999);
                }
            }
            for(int i=0; i < arr.length; i++){
                for(int j=0; i < arr[i].length; i++){
                    System.out.println(arr[i][j]);
                }
            }
        }
        catch(Exception e){
        
        }
    }
    
    public void minElement(){
        double min=arr[0][0];
        for(int i=0; i < arr.length; i++)
            for(int j=0; i < arr[i].length; i++){
                if(min<arr[i][j]){
                    min=arr[i][j];
                }
            }
    }
    
    public void maxElement(){
        double max=arr[0][0];
        for(int i=0; i < arr.length; i++){
            for(int j=0; i < arr[i].length; i++){
                if(max>arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
    }
    
    public void symmetry(){
        boolean symm=true;
        for (int i = 0; i < arr.length; ++i){
            for (int j = 0; j < arr[i].length; ++j)
                if (arr[i][j] != arr[j][i]){
                    symm = false;
                    break;
                }
        if (!symm) break;
            }
    }
    
    public void average(){
        double aver=0;
        int counter=1;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                aver+=arr[i][j];
                counter++;
            }
        }
        System.out.println(aver/counter);
    }
    
    public void geometricMean(){
        double composition=1;
        int counter=1;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                composition*=arr[i][j];
                counter++;
            }
        }
        System.out.println(Math.pow(composition, 1./counter));
    }
    
    public void transponation(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                double temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
