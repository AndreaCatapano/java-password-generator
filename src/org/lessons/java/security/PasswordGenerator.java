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

        name = input.nextLine();
        System.out.println("Il tuo nome è: " + name);
        surname = input.nextLine();
        System.out.println("Il tuo cognome è: " + surname);
        color = input.nextLine();
        System.out.println("Il tuo colore preferito è: " + color);
        year = input.nextInt();
        System.out.println("Il tuo anno di nascita è: " + year);
        month = input.nextInt();
        System.out.println("Il tuo mese di nascita è: " + month);
        day = input.nextInt();
        System.out.println("Il tuo giorno di nascita è: " + day);

        String password = name + "-" + surname + "-" + color + "-" + year;
        System.out.println("La tua password è:" + password);

    }
}
