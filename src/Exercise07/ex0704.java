package Exercise07;

public class ex0704 {
    public static void main(String[] args) {
        double[] werte;
        werte = new double[3];
        werte[0] = 1.2;
        werte[1]= 2.5;
        werte[2]= 3.7;

        int i = 0;
        while (i < werte.length){
            System.out.println("wert an der stelle " + i + " wert["+ i+"]" + "=" + werte[i]);
            i++;

        }
    }
}
