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
public class Tariff implements Comparable<Tariff>{
    private String name;
    private int numberOfUsers;
    private int pricePerMonth;
    private int amountOfInternetTraffic;
    private int amountOfFreeMinutes;
    private int network;
    private int amountOfFreeSMS;
    
    public Tariff(){
		name = " ";
        numberOfUsers = 0;
        pricePerMonth = 0;
        amountOfInternetTraffic = 0;
        amountOfFreeMinutes = 0;
        network = 3;
		amountOfFreeSMS = 0;
    }
    
    public Tariff(String name, int numberOfUsers, int pricePerMonth, 
            int amountOfInternetTraffic, int amountOfFreeMinutes, 
            int network, int amountOfFreeSMS){
        this.name = name;
        this.numberOfUsers = numberOfUsers;
        this.amountOfInternetTraffic = amountOfInternetTraffic;
        if(network < 3 && network > 4){
            this.network = 3;
        } else this.network = network;
        this.pricePerMonth = pricePerMonth;
        this.amountOfFreeMinutes = amountOfFreeMinutes;
        this.amountOfFreeSMS = amountOfFreeSMS;
    }
    
    public void setNumberOfUsers(int numberOfUsers){
        this.numberOfUsers = numberOfUsers;
    }
    
    public void setPricePerMount(int pricePerMonth){
        this.pricePerMonth = pricePerMonth;
    }
    
    public void setAmountOfInternetTraffic(int amountOfInternetTraffic){
        this.amountOfInternetTraffic = amountOfInternetTraffic;
    }
    
    public void setAmountOfFreeMinutes(int amountOfFreeMinutes){
        this.amountOfFreeMinutes = amountOfFreeMinutes;
    }
    
    public void setNetwork(int network){
        if(network < 3 && network > 4){
            this.network = 3;
        } else this.network = network;
    }
    
    public void setAmountOfFreeSMS(int amountOfFreeSMS){
        this.amountOfFreeSMS = amountOfFreeSMS;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNumberOfUsers(){
        return numberOfUsers;
    }
    
    public int getPricePerMonth(){
        return pricePerMonth;
    }
    
    public int getAmountOfInternetTraffic(){
        return amountOfInternetTraffic;
    }
    
    public int getAmountOfFreeMinutes(){
        return amountOfFreeMinutes;
    }
    
    public int getNetwork(){
        return network;
    }
    
    public int getAmountOfFreeSMS(){
        return amountOfFreeSMS;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public int compareTo(Tariff tar){
        return (this.pricePerMonth - tar.pricePerMonth);
    }
    
    @Override
    public String toString(){
        return "[name=" + this.name + ", numberOfUsers=" + this.numberOfUsers + 
               " pricePerMonth=" + this.pricePerMonth + 
               " amountOfInternetTraffic=" + this.amountOfInternetTraffic + 
               " amountOfFreeMinutes" + this.amountOfFreeMinutes + 
               " network=" + this.network + "G" + 
               " amountOfFreeSMS=" + this.amountOfFreeSMS + "]\n";
    }
    
    public static Comparator<Tariff> UsersComparator = 
            new Comparator<Tariff>() {
 
        @Override
        public int compare(Tariff t1, Tariff t2) {
            return (int) (t1.getNumberOfUsers() - t2.getNumberOfUsers());
        }
    };
 
    public static Comparator<Tariff> InternetTrafficComparator = 
            new Comparator<Tariff>() {
 
        @Override
        public int compare(Tariff t1, Tariff t2) {
            return t1.getAmountOfInternetTraffic() - 
                    t2.getAmountOfInternetTraffic();
        }
    }; 
    
    public static Comparator<Tariff> FreeMinutesComparator = 
            new Comparator<Tariff>() {
 
        @Override
        public int compare(Tariff t1, Tariff t2) {
            return t1.getAmountOfFreeMinutes()- t2.getAmountOfFreeMinutes();
        }
    };
}