package privat;

import java.util.Scanner;

public class Struktogramm {
    public static void main(String[] args) {

        double gehalt = 0.0;
        int AnzahlProjekt = 0;

      Scanner sc = new Scanner(System.in);

      do {
          System.out.println("Bitte das gehalt des mitarbeiters eingeben.");
          gehalt= sc.nextDouble();
      }while(gehalt < 400 || gehalt > 30000);


        do {
            System.out.println("Ban wie vielen erfolgreischen projwekten war der mitarbeiter beteiligt");
            AnzahlProjekt= sc.nextInt();
        }while(AnzahlProjekt < 0 || AnzahlProjekt > 11);

        if(AnzahlProjekt < 3){
            gehalt = gehalt +(1+AnzahlProjekt/100.0);
        }else{
            if(AnzahlProjekt < 8) {
                gehalt=gehalt*(1+AnzahlProjekt/50.0);
            } else {
                gehalt= gehalt *(1+AnzahlProjekt/25.0);
            }
        }
System.out.println("Das gehalt mit provision beträgt " + gehalt);




    }
}
