
package oop.ct1.dicegame;
import javax.swing.JOptionPane;
import java.util.Random;
public class DiceGame {

    public static void main(String[] args)
    {
        
      Random rand =new Random();
     String input=JOptionPane.showInputDialog(null,"Guess a number between 1-6"); 
     int num=Integer.parseInt(input);
     
     int number=rand.nextInt(5)+1;
     if(num==number)
     {
     JOptionPane.showMessageDialog(null,"The number are equal");
     }
     else if(num>number)
      {
       JOptionPane.showMessageDialog(null,"The number is higher");
      
      }
     if(num<number)
     {
     JOptionPane.showMessageDialog(null,"The number is lower");
     }
     
    }
    
}
