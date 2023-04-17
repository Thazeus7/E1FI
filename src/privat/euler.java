package privat;

public class euler {
    public static void main (String[] args){
        double e =1.0;
        int nenner = 1;
        for(int k=1; k<10; k++){
           nenner = nenner*k;
            e = e + 1.0/nenner;
            System.out.println(e);
        }

    }

}
