/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package by.epam.javatraining.Zamoiski.maintask3;
import java.util.Vector;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;
/**
 *
 * @author Zamoiski Roman 
 */
public class GeneralClass {
    //private final static Logger log=Logger.getLogger(GeneralClass.class);
    private Vector<Double> v = new Vector<Double>();
    //private static final Logger log = LogManager.getLogger(GeneralClass.class);
    
    /**
     * 
     * constructor
     */
    GeneralClass(){
        initializer((int)(Math.random()*50));
        //log.error("Constructor");
    }
    
    /**
     * 
     * initialize vector's elements
     */
    public void initializer(int size){
        //log.trace("Initializing Vector v");
        for(int i = 0; i < size; i++){
            this.v.add((double)(Math.random()*999));
        }
    }
    
    /**
     * 
     * prints out vector's elements in a row
     */
    public void printVector(){
        //log.trace("Printing Vector, with print");
        System.out.println(v);
    }
    
    /**
     * 
     * prints out vector's elements in colomn
     */
    public void printlnVector(){
        //log.trace("Printing Vector, with println");
        for(int i = 0; i < v.size(); i++){
            System.out.println(v.get(i));
        }
    }
    
    /**
     * Exercise 1
     * returns -1 if array length less than 1
     * returns first array element if array length equals 1
     * else it will find maxValue and return it
     * 
     *@return 
     */
    public double maxElement(){
        double max;
        try{
            max = v.get(0);
            for(int i = 0; i < v.size(); i++){
                if(max<v.get(i)){
                    max=v.get(i);
                }
            }
            System.out.println("max: " + max);
            return max;
        }
        catch(Exception e){
            System.out.println("max: -1");
            return -1;
        }
    }
    
    /**
     * Exercise 1
     * returns -1 if array length less than 1
     * returns first array element if array length equals 1
     * else it will find minValue and return it
     * 
     *@return 
     */
    public double minElement(){
        double min;
        try{
            min = v.get(0);
            for(int i = 0; i < v.size(); i++){
                if(min > v.get(i)){
                    min = v.get(i);
                }
            }
            System.out.println("min: " + min);
            return min;
        }
        catch(Exception e){
            System.out.println("min: -1");
            return -1;
        }
    }
    
    /**
     * Exercise 2
     * return 0 if array length less than 1
     * finds and returns vecrtor's average value
     * 
     *@return 
     */
    public double average(){
        double average = 0;
        try{
            for(int i = 0; i < v.size(); i++){
                average+=v.get(i);
            }
            System.out.println("average: " + average/v.size());
            return average/v.size();
        }
        catch(Exception e){
            System.out.println("average: " + 0);
            return 0;
        }
    }
    
    /**
     * Exercise 2
     * returns 0 if array length less than 1
     * finds and returns vecrtor's geometric mean
     * 
     *@return 
     */
    public double geometricMean(){
        double geometricMean, composition=1;
        try{
            for(int i = 0; i < v.size(); i++){
                composition*=v.get(i);
            }
            System.out.println("geometric mean: " +
                    + (geometricMean=Math.pow(composition, 1./v.size())));
            return geometricMean;
        }
        catch(Exception e){
            System.out.println("geometric mean: " + 0);
            return 0;
        }
    }
    
    /**
     * Exercise 3
     * returns false if array length less than 1
     * if elements are arranged in ascending order returns true, else 
     * returns false
     * 
     *@return 
     */
    public boolean isAccending(){
        int num = 0;
        try{
            for (int i = 0; i < v.size()-1; i++) {
                if (v.get(i + 1) > v.get(i)) {
                    num++;
                }
            }
            System.out.println("isAccending: " + (num==v.size()-1));
            return num==v.size()-1;
        }
        catch(Exception e){
            System.out.println("isAccending: " + false);
            return false;
        }
    }
    
    /**
     * Exercise 3
     * returns false if array length less than 1
     * if elements are arranged in descending order returns true, else 
     * returns false
     * 
     *@return 
     */
    public boolean isDescending(){
        int num = 0;
        try{
            for (int i = 0; i < v.size()-1; i++) {
                if (v.get(i + 1) < v.get(i)) {
                    num++;
                }
            }
            System.out.println("isDescending: " + (num==v.size()-1));
            return num==v.size()-1;
        }
        catch(Exception e){
            System.out.println("isDescending: " + false);
            return false;
        }
    }
    
    /**
     * Exercise 4
     * returns -1 if array length less than 1
     * finds and teruns vector's local minimum, if it doesnt exist returns -1;
     * 
     *@return 
     */
    public int localMinimum(){
        int i=0;
        while(i < (v.size()-1)){
            i++;
            
            try{
                if(v.get(i) < v.get(i-1) && v.get(i) < v.get(i+1)){
                    System.out.println("Local minimum: " + i);
                    return i;
                }
            }
            catch(Exception e){
                System.out.println("No local minimum, returns -1");
                return -1;
            }    
        }
        return -1;
    }
    
    /**
     * Exercise 4
     * returns -1 if array length less than 1
     * finds and teruns vector's local maximum, if it doesnt exist returns -1;
     * 
     *@return 
     */
    public int localMaximum(){
        int i=0;
        while(i < (v.size()-1)){
            i++;
            
            try{
                if(v.get(i) > v.get(i-1) && v.get(i) > v.get(i+1)){
                    System.out.println("Local maximum: " + i);
                    return i;
                }
            }
            catch(Exception e){
                System.out.println("No local maximum, returns -1");
                return -1;
            }
            
        }
        return -1;
    }
    
    /**
     * Exercise 5
     * finds and prints element's index which equals num or prints message
     * "Item doesn't exist "
     * 
     * @param num
     */
    public void linearSearch(double num){
        int count = 0;
        for(int i = 0; i < v.size(); i++){
            if(v.get(i) == num){
                System.out.println("Элемент находится в векторе под номером: " 
                        + i);
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println("Элемент отсутствует в векторе");
        }
    }
    
    /**
     * Exercise 5
     * finds and prints element's index which equals num or prints message
     * "Item doesn't exist "
     * 
     * @param num
     */
    public void binarySearch(double num){
        int position, first=0, last = v.size()-1;
        
        position = (first+last)/2;
        
        while((v.get(position)!= num) && (first<=last)){
            if(v.get(position) > num){
                last = position-1;
            }
            else{
                first = position+1;
            }
            position = (first+last)/2;
        }
        if(first <= last){
            System.out.println(num + "Находится на позиции: " + ++position);
        }
        else{
            System.out.println(num + " Не является элементом вектора");
        }
    }
    
    /**
     * Exercise 6
     * rearranges the elements of the vector in reverse order
     * 
     */
    public void reverseVector(){
        for(int i = 0; i < v.size()/2; i++){
            double tmp = v.get(i);
            v.setElementAt(v.get(v.size()-1-i), i);
            v.setElementAt(tmp, v.size()-1-i);
        }
    }
    
    /**
     * Exercise 7
     * sort vector's elemnts
     * bubble sort
     * 
     */
    public void bubbleSort(){
        for(int i = v.size()-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(v.get(j) > v.get(j+1)){
                    double tmp = v.get(j);
                    v.setElementAt(v.get(j+1), j);
                    v.setElementAt(tmp, j+1);
                }
            }
        }
    }
    
    /**
     * Exercise 7
     * sort vector's elemnts
     * selections sort
     * 
     */
    public void selectionSort(){
        for(int i = 0; i < v.size(); i++){
            double min = v.get(i);
            int minI = i;
            
            for(int j = i+1; j < v.size(); j++){
                if(v.get(j) < min){
                    min = v.get(j);
                    minI = j;
                }
            }    
                if(i != minI){
                    double tmp=v.get(i);
                    v.setElementAt(v.get(minI), i);
                    v.setElementAt(tmp, minI);
                }
            
        }
    }
    
    /**
     * Exercise 7
     * sort vector's elemnts
     * insertion sort
     * 
     */
    public void insertionSort(){
        for(int i = 1;i < v.size(); i++){
		for(int j = i; j > 0 && v.get(j-1) > v.get(j); j--){
			double tmp = v.get(j-1);
                        v.setElementAt(v.get(j), j-1);
			v.setElementAt(tmp, j);
                }
        }
    }
    
    /**
     * Exercise 7
     * sort vector's elemnts
     * merge sort
     * 
     */
    public void mergeSort(){
        int i=0, j=0;
        double[] v2 = {1,8581, 968194,1958};//hardcode
        double[] v3 = new double[(v.size()-1) + (v2.length-1)];
        for (int k=0; k<v3.length; k++) {

            if (i > v.size()-1) {
                double a = v2[j];
                v3[k] = a;
                j++;
            }
            else if (j > v2.length-1) {
                double a = v.get(i);
                v3[k] = a;
                i++;
            }
            else if (v.get(i) < v2[j]) {
                double a = v.get(i); 
                v3[k] = a;
                i++;
            }
            else {
                double b = v2[j];
                v3[k] = b;
                j++;
            }
        }
        for(i = 0; i < v.size(); i++){
            v.setElementAt(v3[i], i);
        }
    }
    
    /**
     * Exercise 7
     * sort vector's elemnts
     * quick sort
     * 
     */
    public void quickSort(int low, int high){
        
        if(v.size() == 0){
            return;
        }
        
        if (low >= high){
            return;
        }
        int middle = (int)(low + (high - low) / 2);
        double sup = v.get(middle);
        int i = low, j = high;
        while (i <= j) {
            while (v.get(i) < sup) {
                i++;
            }
 
            while (v.get(j) > sup) {
                j--;
            }
 
            if (i <= j) {
                double temp = v.get(i);
                v.setElementAt(v.get(j),i);
                v.setElementAt(temp, j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(low, j);
 
        if (high > i)
            quickSort(i, high);
    
        //System.out.println(v);
    }
    
}

