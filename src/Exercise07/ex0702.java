package Exercise07;

public class ex0702 {
    public static void main(String[] args) {
        int[] wert = {10, 22, 90, 77, 12, 8};
        int i = 0;

        // neu ab 1.5
        for (int elem : wert) {

            System.out.println("wert an der stelle " + i + " wert[" + i + "]" + "=" + elem);
            i++;
        }
    }

    }

