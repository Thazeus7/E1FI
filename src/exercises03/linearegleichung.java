package exercises03;

import java.io.IOException;

public class linearegleichung {
    public static void main(String[] args) throws IOException {
        System.out.print("gebe wert a ein:");
        double a = new java.util.Scanner(System.in).nextDouble();
         System.out.print("gebe jetz deinen wert für b ein:");
         double b = new java.util.Scanner(System.in).nextDouble();
         double x = -b/a;
     System.out.print("dein x wert beträgt " + x);
    }

}
