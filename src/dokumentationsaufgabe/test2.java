package dokumentationsaufgabe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class test2 {



    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String[]> arrays = new ArrayList<>();

            while (true) {
                System.out.println("Gib vier Werte für das Array ein (oder \"exit\" zum Beenden): ");
                String input = scanner.nextLine();

                if (input.equals("exit")) {
                    break;
                }

                String[] values = input.split(",");
                if (values.length != 4) {
                    System.out.println("Bitte gib genau 4 Werte ein.");
                    continue;
                }

                String[] array = new String[4];
                for (int i = 0; i < 4; i++) {
                    array[i] = values[i];
                }

                arrays.add(array);
            }

            editArrays(arrays, scanner);
        }

        public static void editArrays(ArrayList<String[]> arrays, Scanner scanner) {
            System.out.print("Möchtest du einen Kontakt bearbeiten oder zur ersten Schleife zurückkehren? 1 für Ja, 0 für Nein: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Welchen Kontakt möchtest du bearbeiten? Gib bitte den Index des Kontakts ein: ");
                int index = scanner.nextInt();
                index --;
                if (index >= 0 && index < arrays.size()) {
                    System.out.print("Welchen Wert des Kontakts möchtest du ändern? Gib bitte den Index des Werts ein: ");
                    int valueIndex = scanner.nextInt();
                    valueIndex --;
                    if (valueIndex >= 0 && valueIndex < arrays.get(index).length) {
                        System.out.print("Bitte gib den neuen Wert ein: ");
                        String newValue = scanner.next();
                        changeArrayValue(arrays, index, valueIndex, newValue);

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

                        editArrays(arrays, scanner); // rekursiver Aufruf der editArrays-Methode
                    } else {
                        System.out.println("Ungültiger Wertnummer.");
                    }
                } else {
                    System.out.println("Ungültiger Kontaktnummer.");
                }
            }
        }

        public static void changeArrayValue(ArrayList<String[]> arrays, int arrayIndex, int elementIndex, String newValue) {
            String[] array = arrays.get(arrayIndex);
            array[elementIndex] = newValue;
            arrays.set(arrayIndex, array);
        }
    }

}
