/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg3;

/**
 *
 * @author Roman
 */
public class Task3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=8128;
        if(isNaturalNum(num)){
            System.out.println(isPerfectNumber(num));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        return true;
    }
    
    public static boolean isPerfectNumber(int num){
        int del=0;
            for(int i=1; i<num; i++){
                if(num%i==0){
                    del+=i;
                }
            }
            if(del==num) return true;
        return false;
    }
}
