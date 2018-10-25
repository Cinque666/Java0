/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg2.pkg2;

/**
 *
 * @author Roman
 */
public class Task3_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=12321;
        String x1 = String.valueOf(x);
        if(isNaturalNum(x)){
            if(reverseNum(x).equals(x1)){
                System.out.println("Число - полиндром");
            }
            else{
                System.out.println("Число не является полиндромом");
            }
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<0){
            System.out.println("Число не является натуральным");
            return false;
        }
        else return true;
    }
    
    public static String reverseNum(int num){
        String x="";
        int k=0;
        while (num > 0){
            k=num%10;
            num/=10;
            x+=k;
        }
        return x;
    }
    
}
