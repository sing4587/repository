/*
 *  Jaskaran Singh
 *  Student ID: 991427368
 *  SYST10199  - Web Programming
 */

package pillbox;
import java.util.Scanner;
/**
 *
 * @author Owner
 */
public class PillBoxReverse {
    
    
   public static void main(String[]args){
       
       
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter a word");
       String userInput = input.nextLine();
       char c []= new char[userInput.length()];
       for(int i=0;i<userInput.length();i++){
           c[i]=userInput.charAt(i);
           
        System.out.println(userInput);
           
       }
       
      for(int i=c.length-1;i>=0;i--)
      {
          
          System.out.println(c[i]);
      }
      
      
       
   }
    
    
   
    
}
