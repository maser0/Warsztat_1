package pl.coderslab.game4;


import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Main4 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz jaką kostka rzucasz np. 2D6 +10 ?");
        String data = scanner.nextLine();
       String data1 = data.toLowerCase();
//        while (!(data.length()<=2)){
//            System.out.println("Nie poprawne dane");
//            data = scanner.nextLine();
//        }
//        int placeOfD = StringUtils.indexOfIgnoreCase(data, "d");
//        while (placeOfD != -1){
//            System.out.println("Nie wpisałeś litery D.");
//            data = scanner.nextLine();
        String numberOfRolls = StringUtils.substringBefore(data, "d");
        int numberOfRolls1 = Integer.parseInt(numberOfRolls);
        int x;
        int placeOfD = StringUtils.indexOfIgnoreCase(data, "d");
//        int diceNumber = StringUtils.substring(placeOfD, place)
//        if (data.contains("d6")) {
//
//             dice result = r.nextInt(x)
//
        }




    }

