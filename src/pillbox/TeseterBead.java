/*
 *  Jaskaran Singh
 *  Student ID: 991427368
 *  SYST10199  - Web Programming
 */
package pillbox;

/**
 *
 * @author Owner
 */
public class TeseterBead {
    
    
    public static void main(String[]args){
        Bead b1 = new Bead("Blue",'S');
        
        System.out.println(b1.getColor());
        //Array of Objects (Bead)
        Bead[] b = new Bead[7];
          
       // char [] array = new char[7]; just for reference.
       
        b[0]=b1;
        b[1]= new Bead("Red",'J');
         b[2]= new Bead("Silver",'K');
      
       System.out.println(b1.getColor()); 
       System.out.println(b[1].getColor());
        
    }
}
