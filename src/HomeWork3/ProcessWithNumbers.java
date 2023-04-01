package HomeWork3;

import java.util.Scanner;

public class ProcessWithNumbers {
    public static int showSum(int numb) {
        int firstNumb = numb / 100;
        int secondNumb = numb / 10 % 10;
        int thirdNumb = numb % 10;

        return firstNumb + secondNumb + thirdNumb;
    }

    public static int showSum(String firstWord, String secondWord) {
        return firstWord.length() + secondWord.length();
    }

    public static boolean showSum() {
        int numb = 0;
        System.out.println("Enter your number");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            numb = scan.nextInt();
        }

        return numb > 0;
    }
}