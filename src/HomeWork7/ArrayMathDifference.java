package HomeWork7;

public class ArrayMathDifference {

    public static void main(String[] args) {
        int[] arr = {5, 11, 7, 20};
        int[] arr2 = {155, 777, 4, 5553};
        minDifference(arr);
        minDifference(arr2);

    }

    public static void minDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                    num1 = arr[i];
                    num2 = arr[j];
                }
            }
        }
        System.out.println("Minimum difference between numbers " + num1 + " and " + num2 + " = " + minDiff);
    }
}






