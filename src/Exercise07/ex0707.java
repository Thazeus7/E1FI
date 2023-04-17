package Exercise07;

public class ex0707 {
    public static void main(String[] args) {
        boolean[] werte = {true, false};

        boolean und = werte[0] && werte[1];
        System.out.println("werte[0]=true UND werte[1]=false = " + und);
        boolean oder = werte[0] || werte[1];
        System.out.println("werte[0]=true ODER werte[1]=false = " + oder);
        boolean xor = werte[0] ^ werte[1];
        System.out.println("werte[0]=true XOR werte[1]=false = " + xor);
        boolean nicht1 = !werte[0];
        System.out.println("werte[0]=true NICHT = " + nicht1);
        boolean nicht2 = !werte[1];
        System.out.println("werte[1]=false NICHT = " + nicht2);
    }
}
