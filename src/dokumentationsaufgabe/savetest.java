package dokumentationsaufgabe;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static dokumentationsaufgabe.doku.changeArrayValue;


public class savetest {


        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String[]> arrays = new ArrayList<>();

            boolean addingArrays = true;
            while (addingArrays) {
                System.out.println("Gib vier Werte für das Array ein (oder \"exit\" zum Beenden, du kannst deine Kontakte später noch bearbeiten, trenne deine Eingaben immer mit einem Leerzeichen, wenn du alle 4 eingegeben hast drücke keine Leertaste mehr): ");
                String input = scanner.nextLine();

                if (input.equals("exit")) {
                    break;
                }

                String[] values = input.split(" ");
                if (values.length != 4) {
                    System.out.println("Bitte genau 4 Werte eingeben.");
                    continue;
                }

                arrays.add(values);

                boolean editingArrays = true;
                while (editingArrays) {
                    System.out.print("Möchtest du einen Kontakt bearbeiten oder ist alles so richtig? 1 für Ja, 0 für Nein: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    if (choice == 1) {
                        System.out.print("Welchen Kontakt möchtest du bearbeiten? Gib bitte den Index des Kontakts ein: ");
                        int index = scanner.nextInt();
                        index --;
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
                                valueIndex --;
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


                    System.out.println("Aktuelles Kontaktbuch:");
                    for (String[] arr : arrays) {
                        StringBuilder sb = new StringBuilder();
                        for (String elem : arr) {
                            sb.append(elem).append(", ");
                        }
                        String formattedArray = sb.toString().substring(0, sb.length() - 2);
                        System.out.println(formattedArray);
                    }
                }

                System.out.print("Möchtest du die Änderungen speichern? 1 für Ja, 0 für Nein: ");
                int saveChoice = scanner.nextInt();
                if (saveChoice == 1) {
                    System.out.print("Bitte gib den Dateinamen ein: ");
                    String filename = scanner.next();
                    //saveToCSV(arrays, filename);
                    System.out.println("Daten wurden erfolgreich gespeichert.");

                }}}}



