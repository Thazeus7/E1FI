package exercises06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class ex0604 {
    public static void main(String[] args) throws IOException {
        int anzahl = 0;
        ArrayList<Double> list = new ArrayList<>();
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("[1] Note eingeben");
            System.out.println("[2] Zeugnisnote ausgeben");
            System.out.println("[0] Programm beenden");

            System.out.print("Bitte treffen wählen Sie aus dem Menü aus:  ");
            int menue = Integer.parseInt(reader.readLine());


            // bei einer erweiterung der notten variable mit ++ erhöhen
            if (menue == 1){

                System.out.println("Guten abend gebe deine Note ein ");
                double note = Double.parseDouble(reader.readLine());
                list.add(note);

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
                break;
            }
        }
    }
}
