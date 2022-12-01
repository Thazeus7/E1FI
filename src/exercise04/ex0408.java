package exercise04;

public class ex0408 {

    public static void main(String[] args) {
        System.out.print("Eingang A eingeben: ");
        boolean a = new java.util.Scanner(System.in).nextBoolean();
        System.out.print("Eingang B eingeben: ");
        boolean b = new java.util.Scanner(System.in).nextBoolean();

        if (!(a && b)) {

            System.out.print("Ausgang Y=1");
        }
        else {
            System.out.print("Ausgang Y=0");
        }






    }
}
