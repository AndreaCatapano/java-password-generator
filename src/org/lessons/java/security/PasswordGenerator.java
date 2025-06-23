package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        String name;
        String surname;
        String color;
        int year;
        int month;
        int day;

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        name = input.nextLine();
        System.out.println("Il tuo nome è: " + name);

        System.out.print("Inserisci il tuo cognome: ");
        surname = input.nextLine();
        System.out.println("Il tuo cognome è: " + surname);

        System.out.print("Inserisci il tuo colore preferito: ");
        color = input.nextLine();
        System.out.println("Il tuo colore preferito è: " + color);

        System.out.print("Inserisci il tuo anno di nascita: ");
        year = input.nextInt();
        System.out.println("Il tuo anno di nascita è: " + year);

        System.out.print("Inserisci il tuo mese di nascita: ");
        month = input.nextInt();
        System.out.println("Il tuo mese di nascita è: " + month);

        System.out.print("Inserisci il tuo giorno di nascita: ");
        day = input.nextInt();
        System.out.println("Il tuo giorno di nascita è: " + day);

        String password = name + "-" + surname + "-" + color + "-" + year;
        System.out.println("La tua password è: " + password);

    }
}
