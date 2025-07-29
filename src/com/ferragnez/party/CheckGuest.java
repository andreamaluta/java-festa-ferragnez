package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guest = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
                "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String name = sc.nextLine();

        // int i = 0;
        boolean check = false;

        // while (!check || i < guest.length) {
        // if (name.trim().equalsIgnoreCase(guest[i])) {
        // check = true;
        // System.out.println("Invitato presente nella lista");
        // break;
        // } else {
        // if (i < guest.length - 1) {
        // i++;
        // } else {
        // break;
        // }
        // }

        // }

        for (int i = 0; i < guest.length; i++) {
            if (name.trim().equalsIgnoreCase(guest[i])) {
                check = true;
                System.out.println("Invitato presente nella lista");
                break;
            }
        }

        if (check) {
            System.out.println("L'invitato può entrare");
        } else {
            System.out.println("Puoi tornare a casa");
        }

    }
}
