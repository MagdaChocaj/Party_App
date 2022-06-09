package pl.partyapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnotherClass {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;
        Party party = new Party();

        while(shouldContinue) {
            System.out.println("Wybierz opcję");
            System.out.println("1. Wyświetl gości.");
            System.out.println("2. Dodaj gościa.");
            System.out.println("3. Wyświetl listę posiłków");
            System.out.println("4. Znajdź gościa po numerze telefonu");
            System.out.println("5. Wyjdź");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> System.out.println("3");
                case 4 -> System.out.println("4");
                case 5 -> shouldContinue = false;


            }
        }
    }
}

