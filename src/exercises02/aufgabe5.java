package exercises02;
import java.util.Scanner;
public class aufgabe5 {
    public static void main(String[] args) {

        System.out.print("Multilineinput Version 1.0\nGeben Sie bitte 2 Werte ein:");
        Scanner stringScanner = new Scanner(System.in);
        while (stringScanner.hasNext()) {
            System.out.println(stringScanner.next());
        }

    }
}


