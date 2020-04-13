package pl.coderslab.game3;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pomyśl liczbę od 0 do 1000, a ja ją zgadnę w 10 próbach");


        String answer1 = "za dużo";

        String answer2 = "za mało";
        String answer3 = "zgadłeś";

        int min = 0;
        int max = 1000;

        while (true) {

            int gues = ((max - min) / 2) + min;
            System.out.println("Czy jest to liczba " + gues + "? Wybierz jedną z trzech odpowiedzi za dużo, za mało, zgadłeś");


            String answerPlayer = scanner.nextLine();   // poszło z next line
            //while (!answerPlayer.equals(answer1) || !answerPlayer.equals(answer2) || !answerPlayer.equals(answer3)) {
            //scanner.nextLine();
            //   System.out.println("Wprowadz właściwa instrukcje");

            // }

            if (answerPlayer.equals(answer1)) {
                max = gues;

                // zabezpiecznenie podales zla instrukcje. Pamietaj mozesz odpowiedz mi na jeden z trzech mozliwych sposob. jakis while true z breakiem ?
            } else if (answerPlayer.equals(answer2)) {           // tu sie jebie
                min = gues;

            } else if (answerPlayer.equals(answer3)) {
                System.out.println("Wygrałem!");
                break;
            }

        }
    }
}



