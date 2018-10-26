/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg2.pkg1;

/**
 *
 * @author Roman
 */
public class Task3_2_1 {
//boolean naturalNum;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=6735;
        if(isNaturalNum(x)){
            System.out.println(greatestNum(x));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        else return true;
    }
        
    public static int greatestNum(int num){
        int x=0, max=num%10;
        while(num > 0){
            x=num%10;
            num/=10;
            
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    
}
