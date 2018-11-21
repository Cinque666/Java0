/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package by.epam.javatraining.Zamoiski.maintask4;
import java.util.Comparator;
/**
 * version 2.0
 * @author Zamoiski Roman
 */
public class CompByPriceAndName implements Comparator<Tariff>{
    
    @Override
    public int compare(Tariff tariff1, Tariff tariff2){
        int flag = tariff1.getPricePerMonth() - tariff2.getPricePerMonth();
        
        //if 0 sort by name
        if(flag==0){
            tariff1.getName().compareTo(tariff2.getName());
        }
        return flag;
    }
}
