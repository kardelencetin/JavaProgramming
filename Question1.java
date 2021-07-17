package question1;
/**
 *
 * @author kardelen çetin
 */

import java.util.*;

public class Question1 {

    
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in); 
      boolean valid = false; // I have created a boolean type variable to use in the while loop. This variable will check whether the data entered by the user is appropriate.
      System.out.print("Enter a message: ");
      String message = input.nextLine();
      message = message.toUpperCase(); // I capitalized the whole message.
      
      //System.out.println(message);
      
    
      while(!valid){
          
      valid = true;
      
      // İ to I
      for(int i = 0; i < message.length(); i++){
        
        if((int)message.charAt(i) == (int)'İ'){
            
            message = message.substring(0,i) + 'I' + message.substring(i+1);
            //System.out.println(message);
        }
          
          
            // I looked at each character and asked them to ask the user again if the ascii code is less than 65 or greater than 90 and no spaces until the user input a valid message.
            if(((int)message.charAt(i) < 65 || (int)message.charAt(i) > 90 ) && (int)message.charAt(i) != (int)' '){
            
                System.out.print("Enter an another message: ");
                message = input.nextLine();
                message = message.toUpperCase();
                valid = false;
                break; 
            
            }
        
      }
      
     
    }
      System.out.println("The encrypted message is " + encrypted(message, 3));
      System.out.println("The decrypted message is " +  message);
        
    }
    
    
    /*This methods looks each character and concatanates shifted character to an empty string 
    if it is letter but if it space, 
    concatanates space to this string and returns the result string*/
    
    public static String encrypted(String message, int shift){
        
        String encryptedMessage = "";
        
      /*  for(int i = 0; i < message.length(); i++ ){
            if((int)message.charAt(i) == (int)' ')
                System.out.print(" ");
            else
                System.out.print((((int)message.charAt(i) - 65 ) % 26 ) + " ");
        }   
        System.out.println(" ");
       
        for(int i = 0; i < message.length(); i++ )
            if((int)message.charAt(i) == (int)' ')
                System.out.print(" ");
            else
                System.out.print((((int)message.charAt(i) - 65 + shift) % 26 ) + " ");*/

        for(int i = 0; i < message.length(); i++){
            
            if((int)message.charAt(i) == (int)' '){
                
                encryptedMessage += " ";
                
            
            }
            else{
                
                encryptedMessage += (char)(((int)message.charAt(i) - 65 + shift) % 26 + 65);
               
           
            }
        }
       
        
    return encryptedMessage;
    
    }
}
