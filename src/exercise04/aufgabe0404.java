package exercise04;

public class aufgabe0404 {
    public static void main(String[] args) {

System.out.println("hallole melone willkommen beim zylinder volumen berehner");
        System.out.print("gib jetz deinen wert für Den Radius (r) ein:");
        double r = new java.util.Scanner(System.in).nextDouble();
        System.out.print("gebe jetz deine Höhe (h) ein: ");
        double h = new java.util.Scanner(System.in).nextDouble();
        System.out.println("Dein radius (r) beträgt " + r + "cm");
        System.out.println("Dein Höhe (h) beträgt " + h + "cm");
        double v = Math.PI * Math.pow(r, 2)*h;
        if (r == 0){
            System.out.println("joo was geht du geringverdiener scheint so als wärst du dumm");
            System.out.println("dein Radius muss schon größer sein als 0");
            System.out.println("wenn dir das zu anstrengend ist und du eine auszeit brauchst schau dir das hier an ");
            System.out.println("https://puginarug.com/");
        }

        if (h == 0) {
            System.out.println("joo was geht du geringverdiener scheint so als wärst du dumm");
            System.out.println("deine Höhe  muss schon größer sein als 0");
            System.out.println("ich glaube das ist dir zu anstrengend, ich habe mal ein buch für dich was dich rettet ");
            System.out.println("https://alwaysjudgeabookbyitscover.com/");

        }
        System.out.printf("dein Ergebniss beträgt:\n " + " %.2f cm²", v);














    }
}
