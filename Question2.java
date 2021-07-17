package question2;
/**
 *
 * @author kardelen çetin
 */
import java.util.*;

public class Question2 {

    public static void main(String[] args) {
      int  playerA = 0;
      int  playerB = 0;
      int  activePlayer = chooseFirstPlayer();
      int  dice = 0; // for the total number of dice rolled
      
      // for the total number of moves of the winner
      int  totalMoveA = 0;
      int  totalMoveB = 0;
      
      
      //playerA = rollDice(playerA);
      //System.out.println(playerA);
      
      boolean gameOver = false;
      while(!gameOver){
          
       // for the moves played by the first player
       if(activePlayer == 1){
          
          activePlayer = 2;
          playerA = rollDice(playerA);
          dice += 1;
          totalMoveA += 1;
          System.out.println("PlayerA moved " + playerA);
          playerA = checkState(playerA);
       }   
       
       // for the moves played by the second player
       else if(activePlayer == 2){
       
          activePlayer = 1;
          playerB = rollDice(playerB);
          dice += 1;
          totalMoveB += 1;
          System.out.println("PlayerB moved " + playerB);
          playerB = checkState(playerB);
       }   
          
          
      // winner-set condition structure    
      if(playerA >= 100){
          
          gameOver = true;
          System.out.println("Player A is winner.");
          System.out.println("total move of playerA: " + totalMoveA);
      }
      else if(playerB >= 100){
          
          gameOver = true;
          System.out.println("Player B is winner");  
          System.out.println("total move of playerB: " + totalMoveB);
      }
      
       
    }
        
        System.out.println("total dice: " + dice); // display of the total rolled dice
        
      
      
  }
    
    // A method created to randomly select the first player to start.
    
    public static int chooseFirstPlayer(){
        
      Random rand = new Random();
      int firstPlayer = 1+rand.nextInt(2);
      if(firstPlayer == 1){
      System.out.println("Player to start the game: Player A ");
      }
      else if(firstPlayer == 2){
      System.out.println("Player to start the game: Player B ");
      }
      return firstPlayer;
    }
    
    
    // The method created for the player to roll the dice and start the game
    public static int rollDice(int player){
        
        Random rand = new Random();
        player += 1 + rand.nextInt(6);
        
     
    return player;
    
    }
    
    
    /* The method, which we check whether it is a two-digit number and whether it is a prime,
        also checks whether it is divided by 10 and performs the operations.*/
    
    public static int checkState(int player){
        
        boolean prime = true;
        
        if(player == 0 || player == 1){
            
            prime = false;
        
        }
        
        for(int i = 2; i < player; i++){
            if(player % i == 0){
                prime = false;
                break;
            }
        
            
        }
        
        
        if(player >=10 && player < 100 ){
            
            if(prime){
                
                player -= 1;
                System.out.println("Then moved: " + player);
                
            }
        
            if(player % 10 == 0){
                
                player += 2;
                System.out.println("Then moved: " + player);
            }
        
        }
        return player;
        
        
    
    }
    
    
}