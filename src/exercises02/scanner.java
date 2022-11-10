/*
==========================================
file : scanner
autor : pierre.fuchs
date : 13.10.2022
package: exercises02
==========================================
*/
package exercises02;

public class scanner {
    public static void main(String[] args) {


        System.out.println("hallo du louser gebe jetz u (Spannung) ein");

        double U = new java.util.Scanner(System.in).nextDouble();
        System.out.println("hallo du louser gebe jetz R (Wiederstans) ein");

        double R = new java.util.Scanner(System.in).nextDouble();
double I = U/R;
        System.out.printf("Dein ergebniss ist %.5f", I );











    }







}
