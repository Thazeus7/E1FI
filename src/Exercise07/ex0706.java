package Exercise07;

public class ex0706 {
    public static void main(String[] args) {
     boolean [] werte;
     werte = new boolean[2];
     werte[0]= false;
     werte[1] = true;
     int i = 0;
     while (true){

         System.out.println("wert an der stelle " + i + " wert["+ i+"]" + "=" + werte[i]);
         i++;
         if(i == werte.length){
             break;

         }
     }
    }
}
