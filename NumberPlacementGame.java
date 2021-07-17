package numberplacementgame;

/**
 *
 * @author kardelen çetin
 */

import java.util.*;

public class NumberPlacementGame {

    public static void main(String[] args) {
        
        // create table size
        
        int bsize = 5;
        int[][] table = new int[bsize][bsize];
        
        
        //Initialized the random variables.
        
        Random rand = new Random();
        int positionX = rand.nextInt(bsize);
        int positionY = rand.nextInt(bsize);
        
        // I wanted to show array as empty and empty cells as -1.
        
        for(int i = 0; i< bsize; i++){
        
            for(int j = 0; j < bsize; j++){
                table[j][i] = -1;
                
            }
        }
        
        playGame(table, positionX, positionY, 0);
     
    }
    
    
    // The method that draws the table has been created.
    
    public static void drawTable(int[][] Array){
        
       
        int bsize = 5;
        for(int i = 0; i < bsize; i++){
        
            for(int j = 0; j < bsize; j++){
                
                if(Array[j][i] == -1){
                
                    System.out.print("*\t");
                }
                else{
                System.out.print(Array[j][i]+ "\t"); 
                }
               
            }
            
            System.out.println();
            
        }
    }
    
    // The method that performs the process of playing the game.
    
    public static void playGame(int[][] Arr, int x, int y, int var){
        
        // The function should not continue in the wrong position.
        
        if(x < 0 || x >= 5 || y < 0 || y >= 5 || Arr[x][y] != -1){
        
            return;
        }
        
        // Assigns the var value received by the function to the position.

        
        int[][] Array = Arr;
        Array[x][y] = var;
        
        
        // After assigning var, the function works again for 8 directions in this new array with var + 1.
        
        
        // Vertical and horizontal directions.
        
        playGame(Array, x + 3, y, var + 1);
        playGame(Array, x - 3, y, var + 1);
        playGame(Array, x, y + 3, var + 1);
        playGame(Array, x, y - 3, var + 1);
        
        // Diagonal directions.
        
        playGame(Array, x + 2, y + 2, var + 1);
        playGame(Array, x + 2, y - 2, var + 1);
        playGame(Array, x - 2, y + 2, var + 1);
        playGame(Array, x - 2, y - 2, var + 1);
        
        //  The filled table is emptied again.
        
        Array[x][y] = -1;
        
        // If the table is filled successfully, it will draw it.
        
        if(var == 24){
            
            Array[x][y] = var;
            drawTable(Array);
            Array[x][y] = -1;
            System.out.println("**********************************");
            
        }
        
    }
    
}
