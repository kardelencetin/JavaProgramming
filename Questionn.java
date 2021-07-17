package questionn;

/**
 *
 * @author kardelen çetin
 */

import java.util.*;

public class Questionn {
    
    public static void main(String[] args) {
        
        System.out.println(findLowest(createArray()));
        
    }
    
    public static int[][] createArray(){
        
         Random rand = new Random();
        int[][] matrix = new int [5][5];
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                 matrix[i][j] = rand.nextInt(20) + 1 ;
                 System.out.print(matrix[i][j]+"\t");

            }
            System.out.println("");
    
        
        }
        
        return matrix;
        
    }
    
    public static String findLowest(int[][] matrix){
        
        int min = 21;
        int count = 0;
        for(int i=0; i<5;i++){
            for(int j = 0; j<5;j++){
                if( matrix[i][j] < min){
                    min = matrix[i][j];
                    count = 1;
                }else if(matrix[i][j] == min){
                    count++;
                   
                }

            }
        }
        
        return "Lowest value is " + min + ", " + count + " times";
        

    }
    
}