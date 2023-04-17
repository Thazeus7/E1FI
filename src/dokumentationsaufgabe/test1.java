package dokumentationsaufgabe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> arrays = new ArrayList<>();

        while (true) {
            System.out.print("Gib vier Werte für das Array ein (oder \"exit\" zum Beenden): ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] values = input.split(" ");
            if (values.length != 4) {
                System.out.println("bist du blöd, genau 4 werte ");
                continue;
            }

            String[] array = new String[4];
            for (int i = 0; i < 4; i++) {
                array[i] = values[i];
            }

            arrays.add(array);
        }

        for (int i = 0; i < arrays.size(); i++) {
            String[] array = arrays.get(i);
            System.out.print("Array " + i + ": ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();

        }
        // Ändern des zweiten Elements im ersten Array
        changeArrayValue(arrays, 0, 1, "neues Wort");

// Ausgabe aller Arrays in der ArrayList mit formatiertem String
        for (String[] arr : arrays) {
            StringBuilder sb = new StringBuilder();
            for (String elem : arr) {
                sb.append(elem).append(", ");
            }
            String formattedArray = sb.toString().substring(0, sb.length() - 2);
            System.out.println(formattedArray);
        }

// Alle Arrays in der ArrayList ausgeben
        for (String[] array : arrays) {
            System.out.println(Arrays.toString(array));
        }


    }
    public static void changeArrayValue(ArrayList<String[]> arrays, int arrayIndex, int elementIndex, String newValue) {
        String[] array = arrays.get(arrayIndex);
        array[elementIndex] = newValue;
        arrays.set(arrayIndex, array);


    }

    }




//ich werde das programm wegwerfen und das einfahc mit einer ARRAYLIST BAUEN
