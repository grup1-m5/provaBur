
package bifurcacions2;
import java.util.Scanner;
/**
 *
 * @author Aleix
 * @version 2.0
 */


public class Bifurcacions2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escriu algo");
        
        String ciutat;
        int r22;
        
        ciutat = in.nextLine();
        r22 = in.nextInt();
        

        if (ciutat.equals("Italia") && r22 == 1) System.out.print("Bé\n");
        else if (ciutat.equals("EU") && r22 == 2) System.out.print("Bé\n");
        else if (ciutat.equals("UE") && r22 == 3) System.out.print("Bé\n");

        
        
        if (ciutat.equals("Tokio") && r22 == 1) System.out.print("Bé\n");
        else if (ciutat.equals("New York") && r22 == 2) System.out.print("Bé\n");
        else if (ciutat.equals("Mexic") && r22 == 3) System.out.print("Bé\n");

        else System.out.print("Mal\n");
    }
    
}
