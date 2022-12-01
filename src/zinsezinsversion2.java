import java.io.IOException;

public class zinsezinsversion2 {
    public static void main(String[] args) throws IOException {

        System.out.print("Bitte geben sie ihr startkapital ein:");
        double S = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Bitte gebe sie ihren zinssatz ein");

        double Z = new java.util.Scanner(System.in).nextDouble();
        System.out.print("wie lange wollen sie berechnen ");
        double m;

        double l = new java.util.Scanner(System.in).nextDouble();

        double o = 1+(Z/100);
        double p = S*Math.pow(o, l);
System.out.println("Das Endkapital nach 50 Jahren beträgt: " + p + "€");









    }
    }
