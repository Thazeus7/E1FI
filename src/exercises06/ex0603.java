package exercises06;
import java.util.ArrayList;
import java.util.Scanner;

public class ex0603 {
    public static void main(String[] args) {
        int anzahl = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true){
            System.out.println("[1] Note eingeben");
            System.out.println("[2] Zeugnisnote ausgeben");
            System.out.println("[0] Programm beenden");

            System.out.print("Bitte treffen wählen Sie aus dem Menü aus:  ");
            int menue = sc.nextInt();


            // bei einer erweiterung der notten variable mit ++ erhöhen
            if (menue == 1){

                System.out.println("Guten abend gebe deine Note ein ");
                list.add(sc.nextDouble());

                anzahl ++;
              continue;
            }
            if( menue == 2) {
                double summe = 0.0;
                for (Double note : list) {
                    summe += note;
                }
                double durchschnitt = summe / list.size();
                System.out.println(durchschnitt);
               }
            }
        }





    }

