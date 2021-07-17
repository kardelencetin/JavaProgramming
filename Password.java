package password;
/**
 *
 * @author kardelen çetin
*/
import java.util.*;

public class Password {
    
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in); 
         String password;
         
        //User continues to enter the password until the password is valid.
        
         do{
            System.out.print("Enter a password: ");
            password = input.nextLine();
         
         }
         while(!validPassword(password));
    
    }
    
    public static boolean validPassword(String password){
    
         int totalDigit = 0;
         int totalLetter = 0;
         boolean invalidCharacter = false;
         boolean valid = true;
         
         //A password must have at least eight characters.
         
         if(password.length() < 8){
             
             System.out.println("-> A password must have at least eight characters.");
             valid = false;
             
         }
         
         //A password consists of only letters and digits.
         
         for(int i = 0; i < password.length(); i++){
             
             if(Character.isLetter(password.charAt(i))){
                 totalLetter++;
            }
             else if(Character.isDigit(password.charAt(i))){
                 totalDigit++;
             }
             else{
                 if(!invalidCharacter){
                 
                     System.out.println("-> Your password must consists of only letters and digits.");
                     valid = false;
                     
                 } 
                 invalidCharacter = true;
             
             }
         
         }
         
         //A password must contain at least two digits and at least two letters.
         
         if(!(totalDigit >= 2 && totalLetter >= 2)){
             System.out.println("-> Your password must contain at least two digits and at least two letters.");
             valid = false;
         }
         if(valid){
             System.out.println("Your password is valid.");
            
         }
         
         return valid;
    }
 
}