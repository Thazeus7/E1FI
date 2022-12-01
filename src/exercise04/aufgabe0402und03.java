package exercise04;

public class aufgabe0402und03 {
    public static void main(String[] args) {
        System.out.println("hey Willkomen beim Kreis Flächen berechner");
        System.out.println("gebe jetz deinen wert für deinen durchmesser ein");
    System.out.print("wenn du nur den radius gegeben hast rechne ihn einfach x2 um den durchmesser zu erhalten:");
        double a = new java.util.Scanner(System.in).nextDouble();
        double r= a/2;
        double pi = Math.PI;

        System.out.println("dein Durchmesser beträgt " + a);
double A = pi*Math.pow(r, 2);
double u = Math.round(A*100.0)/100.0;


        if (a <= 0 ) {
            System.out.println("scheint so als bist du dumm lmao, dein wert kann nicht null sein wenn du weiter hilfe brauchst");
            System.out.print("geh da hin https://de.wikipedia.org/wiki/Grundschule");
        }


        System.out.printf(" %.5f cm²",u);







    }

}
