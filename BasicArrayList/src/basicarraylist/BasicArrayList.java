/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarraylist;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

 
public class BasicArrayList {

   
    public static void main(String[] args) 
    {
       ArrayList<String> namesofcolors = new ArrayList<>();
          namesofcolors.add("pink");
          namesofcolors.add("Red");
          namesofcolors.add("Orange");
          namesofcolors.add("Purple");
      
          namesofcolors.add(0,"Black");  
          namesofcolors.remove(2);
          Collections.reverse(namesofcolors);
          
         if(namesofcolors.equals("RED"))
         {
          JOptionPane.showMessageDialog(null, "is part of the list");
         }else
         {
           JOptionPane.showMessageDialog(null,  "is not part of the list");
         }
          JOptionPane.showMessageDialog(null,namesofcolors);
       
        
        

    }
    
}
