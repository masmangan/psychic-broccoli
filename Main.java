import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int x = a + b;
        System.out.println("X = " + x);
    }

}
