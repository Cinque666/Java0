/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package by.epam.javatraining.Zamoiski.maintask4;
import java.util.Arrays;
/**
 * version 2.0
 * @author Zamoiski Roman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Tariff tar = new Tariff("tariff1", 123, 5, 1000, 300, 4, 100);
        Tariff[] tariff = new Tariff[3];
        tariff[0] = new Tariff("tariff1", 123, 5, 1000, 300, 4, 100);
        tariff[1] = new Tariff("tariff2", 100, 4, 800, 200, 3, 100);
        tariff[2] = new Tariff("tariff3", 1000, 6, 2000, 300, 4, 200);
        Arrays.sort(tariff);
        System.out.println("CompareTo method in Tariff class: \n" + 
                Arrays.toString(tariff));
        //Tariff.compareTo(tariff);
        
        Arrays.sort(tariff, Tariff.FreeMinutesComparator);
        System.out.println("Free Minutes Comporator: \n" + 
                Arrays.toString(tariff));
        
        Arrays.sort(tariff, Tariff.InternetTrafficComparator);
        System.out.println("Internet Traffic Comparator: \n" + 
                Arrays.toString(tariff));
        
        Arrays.sort(tariff, Tariff.UsersComparator);
        System.out.println("Users Comporator: \n" + 
                Arrays.toString(tariff));
        
        Arrays.sort(tariff, new CompByPriceAndName());
        System.out.println("CompByPriceAndName class: \n" + 
                Arrays.toString(tariff));
    }
    
    public void nameSearch(Tariff[] tariff, String element){
        for(Tariff cell : tariff){
            if(cell.getName().equals(element)){
                System.out.println(cell);
            }
        }
    }
}
