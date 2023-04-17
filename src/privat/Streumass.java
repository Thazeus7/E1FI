package privat;
import java.util.ArrayList;
import java.util.Scanner;

public class Streumass {
    public  static void main(String[] args){
        ArrayList<Integer> punkte = new ArrayList<Integer>();
        int anzahl = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
           System.out.println("gebe einen punkt ein");
                   punkte.add(sc.nextInt());
                   anzahl ++;
                   System.out.println("willst du einen weiteren punkt hinzufügen: 0: nein, 1: ja");
                  int yn = sc.nextInt();
                   if (yn == 1) {
                       continue;
                   } if(yn == 0) {
                       anzahl --;
                        break;
                   } else {
                       System.out.println("du Arschprirat hast mies verkackt");
            }
        }
        int summe = 0;
        for(double n:punkte){
           summe += n;
        }
        double mittelwert= summe/anzahl;
        double sui = punkte.get(1);
int lauf = -1;
        ArrayList<Double> abweichungen = new ArrayList<Double>();
       while(true){
           lauf ++;
           double abweichung = punkte.get(lauf) - mittelwert;
           abweichungen.add(abweichung);
           if (lauf == anzahl ){
               lauf = -1;
               break;
           } else {
               continue;
           }
       }

        ArrayList<Double> quadrierteAbweichungen = new ArrayList<Double>();
       while (true){

           lauf ++;
           double quadrierteAbweichung = Math.pow(abweichungen.get(lauf), 2);
           quadrierteAbweichungen.add(quadrierteAbweichung);
           if (lauf == anzahl){
               lauf = -1;
               break;
           }
       }
        double summeQuadrierteAbweichungen = 0;

       while (true){
           lauf ++ ;
           summeQuadrierteAbweichungen += quadrierteAbweichungen.get(lauf);
           if (lauf == anzahl){
               anzahl++;
               break;
           }
       }
        double varianz = summeQuadrierteAbweichungen / anzahl;
        double standardabweichung = Math.sqrt(varianz);
        System.out.println("Standardabweichung: " + standardabweichung);
    }
}
