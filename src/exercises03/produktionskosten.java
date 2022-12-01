package exercises03;

public class produktionskosten {
    public static void main(String[] args) {

System.out.print("Bitte geben Sie die fixen Kosten x ein:");
        double x = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Bitte geben sie die kosten für das produkt y ein:");
        double y = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Bitte geben Sie den Erlös z für ein Produkt ein:");
        double z = new java.util.Scanner(System.in).nextDouble();
        System.out.print("Wie viele Produkte n sollen hergestellt werden:");
        double n = new java.util.Scanner(System.in).nextDouble();
        double g = n*(z-y)-x;

        System.out.println("Dein gewinn beträgt: " + g);







    }
    }
