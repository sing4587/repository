/*
 *  Jaskaran Singh
 *  Student ID: 991427368
 *  SYST10199  - Web Programming
 *date : 1/31/2018
 
 */
package pillbox;

/**
 *
 * @author Owner
 */
public class Bead {
    
    
    
    private String color;
    private char letter;
    
    
    public Bead(){
            
    }
    
    public Bead(String newColor,char newLetter){
        
       color = newColor;
       letter = newLetter;
    }
   
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
}
