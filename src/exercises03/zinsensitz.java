package exercises03;

public class zinsensitz {
    public static void main(String[] args) {
        System.out.println("Bitte geben sie ihr startkapital ein:");
        double S = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Bitte gebe sie ihren zinssatz ein");

        double Z = new java.util.Scanner(System.in).nextDouble();
        System.out.println("wie lange wollen sie berechnen ");
        double l = new java.util.Scanner(System.in).nextDouble();



        int u=0;
        do {
            S = S*(1+(Z/100));
            u++;

        } while (u < l);

        System.out.println("Das Endkapital nach jahren beträgt: " + S + "€");










    }
}
