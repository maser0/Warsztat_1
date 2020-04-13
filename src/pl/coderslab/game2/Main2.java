package pl.coderslab.game2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Integer[] arrRandom = new Integer[49];
        for (int i = 0; i < arrRandom.length; i++) {
            arrRandom[i] = i + 1;
        }

        //System.out.println(Arrays.toString(arrRandom));
        Collections.shuffle(Arrays.asList(arrRandom));
        //System.out.println(Arrays.toString(arrRandom));

        int[] array3 = new int[6];
        int[] arrayComp = new int[6];
        for (int i = 0; i < arrayComp.length; i++) {
            arrayComp[i] = arrRandom[i];
        }
        // System.out.println(Arrays.toString(arrayComp));         // losuje 6 liczb losowych do porownania


        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Wprowadz 6 liczb: ");
        //System.out.println(Arrays.toString(arrayComp));
        while (count < 6) {
            System.out.println("Wprowadz " + (count + 1) + " liczbę: ");
            while (!scanner.hasNextInt()) {
                scanner.next();    // po co to tu jest musi byc? ! Wsadziłem to co z innego zadania tu było ?
                System.out.println("To nie jest liczba. Wprowadz jeszcze raz");
            }

            int income = scanner.nextInt();   // to powtarzam
            if (income > 50) {
                System.out.println("Wprowadziłeś liczbe poza zakresem.");
               continue;  // przerywa i wraca do tego while gdzie jest count
            }
            if (ArrayUtils.contains(array3, income)) {
                System.out.println("Wprowadziłeś już taka liczbę. Wprowadz inną: ");
                continue;
            }


            array3[count] = income;
            count++;
        }

        int hit = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3.length; j++) {
                if (array3[i] == arrayComp[j]) {
                    hit++;           // to sprawdza ile trafionych i wyrzuca te ktore sie pokrywaja
                }
            }
        }

        System.out.println("Szczęśliwe liczby wylosowane przez komputer to :" + Arrays.toString(arrayComp));
        System.out.println("Twoje liczny :" + Arrays.toString(array3));
        System.out.println("Trafiłeś "+hit+" liczb");
    }
}


//   while (!scanner.hasNextInt()) {
//            scanner.next();
//            System.out.println("To nie jest liczba cwaniaku");
