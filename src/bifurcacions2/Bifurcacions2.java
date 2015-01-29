
package bifurcacions2;
import java.util.Scanner;

public class Bifurcacions2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String ciutat;
        int r;
        
        ciutat = in.nextLine();
        r = in.nextInt();
        
        if (ciutat.equals("Tokio") && r == 1) System.out.print("Bé\n");
        else if (ciutat.equals("New York") && r == 2) System.out.print("Bé\n");
        else if (ciutat.equals("Mexic") && r == 3) System.out.print("Bé\n");
        else System.out.print("Mal\n");
    }
    
}
