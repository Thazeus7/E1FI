/*
==========================================
file : casetest
autor : pierre.fuchs
date : 14.10.2022
package: exercises02
==========================================
*/
package exercises02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class casetest2 {
    public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("was ist gesucht? Spannung (u) dann gebe U ein \n suchst du Strom (I) dann gebe ein I ein \n oder suchst du den wiederstand (R) dann gebe ein R ein \n");

        String i = new java.util.Scanner(System.in).nextLine();
        switch (i) {
            case "R":
                System.out.println("hallo gebe jetz bitte Spannung (U) ein");
String inputU = br.readLine();
                double U2 = Double.parseDouble(inputU);
                System.out.println("jetz der Strom (I) ein");

                double I2 = Double.parseDouble(br.readLine());
                double R2 = U2/I2;
                System.out.printf("Dein ergebniss ist %.5f", R2 );
                break;
            case "I":
                System.out.println("hallo gebe jetz bitte Spannung (U) ein");

                double U = new java.util.Scanner(System.in).nextDouble();
                System.out.println("jetz der Wiederstans (R)");

                double R = new java.util.Scanner(System.in).nextDouble();
                double I = U/R;
                System.out.printf("Dein ergebniss ist %.5f", I );
                break;
            case "U":
                System.out.println("hallo gebe jetz bitte Wiederstand (R) ein");

                double R3 = new java.util.Scanner(System.in).nextDouble();
                System.out.println("jetz der Strom (I) ein");

                double I3 = new java.util.Scanner(System.in).nextDouble();
                double U3 = I3+R3;
                System.out.printf("Dein ergebniss ist %.5f", U3);
                break;


        }


    }
}

