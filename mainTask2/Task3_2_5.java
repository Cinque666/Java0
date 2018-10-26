/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg2.pkg5;

/**
 *
 * @author Roman
 */
public class Task3_2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=45, y=31;
        if(isNaturalNum(x) && isNaturalNum(y)){
            System.out.println("НОД: " + greatestСommonDivisor(x, y));
            System.out.println("НОК: " + x*(y/greatestСommonDivisor(x, y)));
        }
    }
    
    public static boolean isNaturalNum(int num){
        if(num<0){
            return false;
        }
        else return true;
    }
    
    public static int greatestСommonDivisor(int num1, int num2){
        while(num1!=0 && num2!=0)
            if(num1 > num2){
                num1%=num2;
            }
            else{
                num2%=num1;
            }
        
        return num1+num2;
        }
    
}
