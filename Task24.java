/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2.pkg4;
import java.util.Scanner;
/**
 *
 * @author Roman
 */
public class Task24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner c = new Scanner(System.in);
        int day=0, month=0, year=0;
        
        while(true){
            System.out.print("Введите день в формате ДД: ");
            day = c.nextInt();
        
            System.out.print("Введите месяц в формате ММ: ");
            month = c.nextInt();
        
            System.out.print("Введите год в формате ГГ: ");
            year = c.nextInt();
            
            if(day>31 && month > 12
                    || day>29 && month==2
                    || day>31 && month==3
                    || day>31 && month==5
                    || day>31 && month==7
                    || day>31 && month==8
                    || day>31 && month==10
                    || day>31 && month==12
                    || day>30 && month==4
                    || day>30 && month==6
                    || day>30 && month==9
                    || day>30 && month==11
                    || month<1){
                System.out.println("Попробуйте еще раз. Некорректная дата");
            }
            else if(day==29 && month==2){
                if(((year%4==0)&& !(year%100==0))||(year%400==0)){
                    break;
                } else System.out.println("Попробуйте еще раз. Это невисокосный"
                        + " год");
            }
            else break;
        }
        
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day==31 && month!=12){
                    day=1;
                    month+=1;
                    System.out.println("Следующая дата " + day + " " + month 
                    + " " + year);
                }
                else if(day<31){
                    day+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                else if(day==31 && month==12){
                    day=1;
                    month=1;
                    year+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day==30){
                    day=1;
                    month+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                else if(day<30){
                    day+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                break;
            case 2:
                if(day==29 && (((year%4==0)&& !(year%100==0)) 
                               || (year%400==0))){
                    day=1;
                    month+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                else if(day==28 && !(((year%4==0)&& !(year%100==0)) 
                                     || (year%400==0))){
                    day=1;
                    month+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                } 
                else{
                    day+=1;
                    System.out.println("Следующая дата " + day + " " + month
                    + " " + year);
                }
                break;
        }
    }
    
}
