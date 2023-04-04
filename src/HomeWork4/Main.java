package HomeWork4;

public class Main {

    public static void main(String[] args) {

        // Enter three words and get the answer which of them is the longest
        longWordFinder("cosmos", "cat", "home");

        // Enter number of month and get hom many days month have!
        Month.monthDaysOut(5);

    }

    public static void longWordFinder(String firstWord, String secondWord, String thirdWord) {
        int word1 = firstWord.length();
        int word2 = secondWord.length();
        int word3 = thirdWord.length();
        String result;

        if (word1 >= word2 && word1 >= word3) {
            result = firstWord;
        } else if (word2 >= word1 && word2 >= word3) {
            result = secondWord;
        } else {
            result = thirdWord;
        }
        System.out.println("Long word find = " + result + " this word have lenght of = " + result.length());

    }
}


