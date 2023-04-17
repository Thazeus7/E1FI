package exercise05;

import java.util.Scanner;

public class ex0502 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte ganze Zahl angeben: ");
        int hoch = 0;
        int end = sc.nextInt();
        while (true) {
            hoch++;
            {
                System.out.print(hoch + ", ");
                if (hoch == end - 1) {
                    hoch++;
                    System.out.print(hoch);
                    break;
                } else {
                    continue;
                }

            }

        }
    }
}
