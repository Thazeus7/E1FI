/*
==========================================
file : printf
autor : pierre.fuchs
date : 13.10.2022
package: exercises01
==========================================
*/
package exercises01;

public class printf {
    public static void main(String[] args) {
        System.out.printf("%8d", 1);
        System.out.printf("\n%8d", 10);
        System.out.printf("\n%8d", 100);
        System.out.printf("\n%8d", 1000);
        System.out.printf("\n%8d", 10000);
        System.out.printf("\n");
        int x=1;
        do {
            System.out.printf("\n%8d", x);
            x= x*10;
        } while (x<1000000);





    }










}



