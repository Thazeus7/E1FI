package dokumentationsaufgabe;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> arrays = new ArrayList<>();

        boolean addingArrays = true;


        try {
            //Creating stream to read the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Kundendaten.txt"));

            arrays = (ArrayList<String[]>) in.readObject();

            //closing the stream
            while (addingArrays) {
                int counter = 1;
                System.out.println("Aktuelles Kontaktbuch:");
                for (String[] arr : arrays) {
                    System.out.print(counter + ". Kontakt: ");
                    StringBuilder sb = new StringBuilder();
                    for (String elem : arr) {
                        sb.append(elem).append(", ");
                    }
                    String formattedArray = sb.toString().substring(0, sb.length() - 2);
                    System.out.println(formattedArray);
                    counter++;
                }
                System.out.println("╔═.✵.══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗\n" +
                        "Gib vier Werte ein um einen Kontakt zu erstellen, trenne nach jeden wert also name, Telefonnummer etc immer mit einen , oder gebe be ein um etwas zu bearbeiten oder löschen dein 2 wert sollte die Telefonnummer sein (dort sind nur zahlen erlaubt)\n" +
                        "\n" +
                        "╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════.✵.═╝\n");
                String input = scanner.nextLine();

                if (input.equals("exit")) {
                    System.out.println("Bis zum nächsten mal");
                    System.out.println("──────▄▀▄─────▄▀▄\n" +
                            "─────▄█░░▀▀▀▀▀░░█▄\n" +
                            "─▄▄──█░░░░░░░░░░░█──▄▄\n" +
                            "█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█");
                    try {
                        FileOutputStream fout = new FileOutputStream("Kundendaten.txt");
                        ObjectOutputStream out = new ObjectOutputStream(fout);
                        out.writeObject(arrays);
                        out.flush();
//closing the stream
                        out.close();
                        System.out.println("Gespeichert");

                    } finally {
                    }
                    break;
                }


                if (input.equals("be")){
                    System.out.print("Welchen Kontakt möchtest du bearbeiten? Gib bitte den Index des Kontakts ein: ");
                    int index = scanner.nextInt();
                    index--;
                    if (index > arrays.size() ){
                        System.out.println("ungültige eingabe");
                        continue;
                    }
                    if (index >= 0 && index < arrays.size()) {
                        System.out.print("Möchtest du den Kontakt löschen? 1 für Ja, 0 für Nein: ");
                        int deleteChoice = scanner.nextInt();
                        scanner.nextLine();
                        if (deleteChoice == 1) {
                            arrays.remove(index);
                            System.out.println("Kontakt wurde gelöscht.");
                        } else {
                            System.out.print("Welchen Wert des Kontakts möchtest du ändern? Gib bitte den Index des Werts ein: ");
                            int valueIndex = scanner.nextInt();
                            valueIndex--;
                            if (valueIndex > 4){
                                System.out.println("ungültige eingabe");
                                continue;
                            }


                            if (valueIndex >= 0 && valueIndex < arrays.get(index).length) {
                                scanner.nextLine(); // read the new line character
                                System.out.print("Bitte gib den neuen Wert ein: ");
                                String newValue = scanner.nextLine();
                                changeArrayValue(arrays, index, valueIndex, newValue);
                            } else {
                                System.out.println("Ungültiger Wertnummer.");
                                continue;
                            }
                        }
                    } else {
                        System.out.println("Ungültiger Kontaktnummer.");
                    }
                }

                String[] values = input.split(",");
                if (values.length != 4) {
                    System.out.println("Bitte genau 4 Werte eingeben.");
                    continue;
                }
                // Check if the second value is a number
                if (!values[1].matches("\\d+")) {
                    System.out.println("######################################################################");
                    System.out.println("Der zweite Wert muss eine Zahl sein. Bitte gib den Kontakt erneut ein.");
                    System.out.println("######################################################################");
                    continue;
                }
                String[] array = new String[4];
                for (int i = 0; i < 4; i++) {
                    array[i] = values[i];
                }
                arrays.add(array);
                boolean editingArrays = true;
                while (editingArrays) {
                    System.out.print("Möchtest du einen Kontakt bearbeiten oder ist alles so richtig? 1 für Ja, 0 für Nein: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        System.out.print("Welchen Kontakt möchtest du bearbeiten? Gib bitte den Nummer des Kontakts ein: ");
                        int index = scanner.nextInt();
                        index--;
                        if (index >= 0 && index < arrays.size()) {
                            System.out.print("Möchtest du den Kontakt löschen? 1 für Ja, 0 für Nein: ");
                            int deleteChoice = scanner.nextInt();
                            scanner.nextLine();
                            if (deleteChoice == 1) {
                                arrays.remove(index);
                                System.out.println("Kontakt wurde gelöscht.");
                            } else {
                                System.out.print("Welchen Wert des Kontakts möchtest du ändern? Gib bitte den Werts ein: ");
                                int valueIndex = scanner.nextInt();
                                valueIndex--;
                                if (valueIndex >= 0 && valueIndex < arrays.get(index).length) {
                                    scanner.nextLine(); // read the new line character
                                    System.out.print("Bitte gib den neuen Wert ein: ");
                                    String newValue = scanner.nextLine();
                                    changeArrayValue(arrays, index, valueIndex, newValue);
                                } else {
                                    System.out.println("Ungültiger Wertnummer.");
                                }
                            }
                        } else {
                            System.out.println("Ungültiger Kontaktnummer.");
                        }
                    } else {
                        editingArrays = false;
                    }
                     counter = 1;
                    System.out.println("Aktuelles Kontaktbuch:");
                    for (String[] arr : arrays) {
                        System.out.print(counter + ". Kontakt: ");
                        StringBuilder sb = new StringBuilder();
                        for (String elem : arr) {
                            sb.append(elem).append(", ");
                        }
                        String formattedArray = sb.toString().substring(0, sb.length() - 2);
                        System.out.println(formattedArray);
                        counter++;
                    }
                }
                try {
                    FileOutputStream fout = new FileOutputStream("Kundendaten.txt");
                    ObjectOutputStream out = new ObjectOutputStream(fout);
                    out.writeObject(arrays);
                    out.flush();
//closing the stream
                    out.close();
                    System.out.println("Gespeichert");

                } finally {

                }
            }


        } finally{

        }
    }

    public static void changeArrayValue (ArrayList < String[]>arrays,int arrayIndex, int elementIndex, String
            newValue){
        String[] array = arrays.get(arrayIndex);
        array[elementIndex] = newValue;
        arrays.set(arrayIndex, array);
    }
}
