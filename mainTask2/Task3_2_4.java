/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg2.pkg4;

/**
 *
 * @author Roman
 */
public class Task3_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=12;
        if(isNaturalNum(x)){
            for(int i = 1; i <= x; i++){
                if(x%i==0 && isPrimeNum(i) && i%2!=0){
                    System.out.println(i);
                }
            }
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
    
    public static boolean isPrimeNum(int num){
        
        for(int x=2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        
        return true;
    }
    
}
