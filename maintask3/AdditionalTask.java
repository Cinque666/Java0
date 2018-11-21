/*
 * copyrighted.
 * 
 * authors e-mail: roma.zamoiski@gmail.com
 */
package by.epam.javatraining.Zamoiski.maintask3;

/**
 *
 * @author Roman Zamoiski
 */
public class AdditionalTask {
    public double[][] arr;
    
    AdditionalTask(){
        arr=new double[(int)(Math.random()*50)][(int)(Math.random()*50)];
        initializer();
        //log.error("Constructor");
    }
    
    /*
     * Initialize two-demensional array
     *
     */
    public final void initializer(){
        try{
            for(int i=0; i < arr.length; i++){
                for(int j=0; j < arr[i].length; j++){
                    this.arr[i][j]=(double)(Math.random()*999);
                }
            }
            for(int i=0; i < arr.length; i++){
                for(int j=0; j < arr[i].length; j++){
                    System.out.println(arr[i][j]);
                }
            }
        }
        catch(Exception e){
        
        }
    }
    
    /*
     * finds minimal Element in two-demensional array
     *
     */
    public void minElement(){
        double min=arr[0][0];
        for(int i=0; i < arr.length; i++)
            for(int j=0; j < arr[i].length; j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
    }
    
    public void maxElement(){
        double max=arr[0][0];
        for(int i=0; i < arr.length; i++){
            for(int j=0; i < arr[i].length; i++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
    }
    
    /*
     * Cheks two-demensional array to symmetry
     *
     */
    public void symmetry(){
        boolean symm=true;
        for (int i = 0; i < arr.length; ++i){
            for (int j = 0; j < arr[i].length; ++j)
                if (arr[i][j] != arr[j][i]){
                    symm = false;
                    break;
                }
        if (!symm) break;
            }
    }
    
    /*
     * Cheks two-demensional array to symmetry
     *
     */
    public void average(){
        double aver=0;
        int counter=1;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                aver+=arr[i][j];
                counter++;
            }
        }
        System.out.println(aver/counter);
    }
    
    /*
     * Finds geometric mean
     *
     */
    public void geometricMean(){
        double composition=1;
        int counter=1;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++){
                composition*=arr[i][j];
                counter++;
            }
        }
        System.out.println(Math.pow(composition, 1./counter));
    }
    
    /*
     * Transponate two-demensional array
     *
     */
    public void transponation(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[i].length; j++) {
                double temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
