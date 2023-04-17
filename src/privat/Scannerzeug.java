package privat;
import java.util.Scanner;
import java.awt.*;
public class Scannerzeug {
    public static void main(String[] args) {
            Scanner stringScanner = new Scanner(System.in);
            String string = stringScanner.next();

            String[] tokens = string.split("");

            String numberString0 = tokens[0];
            int numberInt0 = Integer.parseInt(numberString0);
            System.out.println(numberInt0);



            String numberString1 = tokens[1];
            int numberInt1 = Integer.parseInt(numberString1);
            numberInt1 = numberInt1*3;
            System.out.println(numberInt1);

            String numberString2 = tokens[2];
            int numberInt2 = Integer.parseInt(numberString2);
            System.out.println(numberInt2);

            String numberString3 = tokens[3];
            int numberInt3 = Integer.parseInt(numberString3);
            numberInt3 = numberInt3*3;
            System.out.println(numberInt3);

            String numberString4 = tokens[4];
            int numberInt4 = Integer.parseInt(numberString4);
            System.out.println(numberInt4);

            String numberString5 = tokens[5];
            int numberInt5 = Integer.parseInt(numberString5);
            numberInt5 = numberInt5*3;
            System.out.println(numberInt5);

            String numberString6 = tokens[6];
            int numberInt6 = Integer.parseInt(numberString6);
            System.out.println(numberInt6);

            String numberString7 = tokens[7];
            int numberInt7 = Integer.parseInt(numberString7);
            numberInt7 = numberInt7*3;
            System.out.println(numberInt7);

            String numberString8 = tokens[8];
            int numberInt8 = Integer.parseInt(numberString8);
            System.out.println(numberInt8);

            String numberString9 = tokens[9];
            int numberInt9 = Integer.parseInt(numberString9);
            numberInt9 = numberInt9*3;
            System.out.println(numberInt9);

            String numberString10 = tokens[10];
            int numberInt10 = Integer.parseInt(numberString10);
            System.out.println(numberInt10);

            String numberString11 = tokens[11];
            int numberInt11 = Integer.parseInt(numberString11);
            numberInt11 = numberInt11*3;
            System.out.println(numberInt11);

            String numberString12 = tokens[12];
            int numberInt12 = Integer.parseInt(numberString12);
            System.out.println(numberInt12);


int             ergebniss = numberInt0 + numberInt1 + numberInt2 + numberInt3+numberInt4+numberInt5+numberInt6+numberInt7+numberInt8+numberInt9+numberInt10+numberInt11;
                 System.out.println("dein ergbniss ist " + ergebniss);
                int end = ergebniss% 10;

       int eend = ergebniss+ numberInt12;
       int lool= eend% 10;
       System.out.println(" kekw " + lool);
            if ( lool == 0){
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println(" beep :D");
            } else {
                    System.out.println("kein biep :(");
            }

            Scanner keyboard = new Scanner(System.in);
            keyboard.nextLine();




    }
}
