package exercises06;
import java.awt.*;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class ex0601 {
    public static void main(String[] args) {


        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("[1] Zeit ausgeben");
            System.out.println("[2] Zahl PI ausgeben");
            System.out.println("[3] Hello World asugeben");
            System.out.println("[0] Programm beenden");
            int num = sc.nextInt();
            if (num == 1) {

                SimpleDateFormat date = new SimpleDateFormat(
                        "HH:mm:ss");
                String date1 = date.format(new Date());
                System.out.println(date1);
                continue;
            } else if (num == 2) {
                System.out.println(Math.PI);
                continue;
            } else if (num == 3)
            {
                System.out.println("Hello world");
                continue;
            }else if (num == 0){

                break;
            } else {
                System.out.println("flasch lol");
                continue;
            }


        }

    }
}

