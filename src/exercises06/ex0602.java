package exercises06;
import java.awt.*;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class ex0602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int zahl = 0;
        while (zahl == 0) {
            System.out.println("[1] Zeit ausgeben");
            System.out.println("[2] Zahl PI ausgeben");
            System.out.println("[3] Hello World asugeben");
            System.out.println("[0] Programm beenden");
            num = sc.nextInt();
            if (num == 1) {
                SimpleDateFormat date = new SimpleDateFormat(
                        "HH:mm:ss");
                String date1 = date.format(new Date());
                System.out.println(date1);
                continue;
            } else if (num == 2) {
                System.out.println(Math.PI);
                continue;
            } else if (num == 3){
                System.out.println("Hello world");
                continue;
            } else if (num == 0){
                zahl = 2;
            } else {
                System.out.println("falsche zahl");
            }



        }

    }
}

