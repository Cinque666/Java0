/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg3.pkg3;

/**
 *
 * @author Roman
 */
public class Task3_3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        if(isNaturalNum(x)){
            System.out.println(isPrimeNum(x));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<0){
            System.out.println("Число не является натуральным");
            return false;
        }
        else return true;
    }
    
    public static boolean isPrimeNum(int num){
        for(int i=2; i < num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}
