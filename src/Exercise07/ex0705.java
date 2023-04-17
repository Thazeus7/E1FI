package Exercise07;

public class ex0705 {
    public static void main(String[] args) {
        float[] werte = new float[3];
        werte[0] =  1.2F;
        werte[1]= 2.5F;
        werte[2]= 3.7F;

        int i = 0;
        while (i < werte.length){
            System.out.println("wert an der stelle " + i + " wert["+ i+"]" + "=" + werte[i]);
            i++;

        }
    }
}
