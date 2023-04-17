package privat;

public class Programablauf {
    public static void main(String[] args) {

        int i = 1;
        System.out.println(i);
        do{
            System.out.println(i + " louser");
            if(i== 39){
                i = 61;
                continue;
            }
            i = i+1;
        }while(i <= 100);
        //ende
    }
}
