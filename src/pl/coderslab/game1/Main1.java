package pl.coderslab.game1;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Random r = new Random();

        int randomNumber = r.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Zgadnij liczbę od 1 do 100: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie jest liczba cwaniaku");
        }
        int value = scanner.nextInt();
        while(true) {
            if (value > randomNumber) {
                System.out.println("Za dużo!");

            } else if (value < randomNumber) {
                System.out.println("Za mało!");
            } else  {
                System.out.println("Zgadłeś!");
                break;
            }
            System.out.println("Spróbuj jeszcze raz:");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("To nie jest liczba cwaniaku");
            }
            value = scanner.nextInt();
        }


    }




}

//while (!scan.hasNextInt()){
//            scan.nextLine();
//            System.out.println("Age must be a number, enter again:");
//        }