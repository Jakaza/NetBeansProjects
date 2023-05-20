
package array;
import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        String[] names = new String[2];
        
        System.out.println("Enter your name");
        
        for (int i = 0; i < names.length; i++) {
            
            names[i] = kb.nextLine();
        }
        
    }
    
}
