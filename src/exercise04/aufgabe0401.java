package exercise04;

public class aufgabe0401 {
    public static void main(String[] args) {
System.out.print("hey Willkomen beim Rechteck Flächen berechner");
System.out.print("gebe jetz deinen werd für a ein");
double a = new java.util.Scanner(System.in).nextDouble();
System.out.print("gebe jetz deinen b wert ein");
double b = new java.util.Scanner(System.in).nextDouble();
double r = a*b;
System.out.print("Der Wert für Seite a beträgt" + a + "cm");
        System.out.print("Der Wert für Seite a beträgt" + b + "cm");
if (b <= 0 ) {
    System.out.print("scheint so als bist du dumm lmao, dein wert kann nicht null sein wenn du weiter hilfe brauchst");
    System.out.print("geh da hin https://de.wikipedia.org/wiki/Grundschule");
}

        if (a <= 0 ) {
            System.out.println("scheint so als bist du dumm lmao, dein wert kann nicht null sein wenn du weiter hilfe brauchst");
            System.out.print("geh da hin https://de.wikipedia.org/wiki/Grundschule");
        }


System.out.printf(" %.5f cm²", r);







    }

}
