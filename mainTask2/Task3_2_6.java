/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3.pkg2.pkg6;

/**
 *
 * @author Roman
 */
public class Task3_2_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m=122121111;
        if(isNaturalNum(m)){
            System.out.println(numOfDifferentDigits(m));
        }
    }
    
    public static int numOfDifferentDigits(int num){
        String c = String.valueOf(num);
        int count=0;
        for(int i = 0; i <= 9; i++){
            if(c.contains(String.valueOf(i))){
                count++;
            }
        }
        return count;
    }
    
    public static boolean isNaturalNum(int num){
        if(num<=0){
            return false;
        }
        return true;
    }
}
