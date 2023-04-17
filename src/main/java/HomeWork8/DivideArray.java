package main.java.HomeWork8;
import java.util.Arrays;

public class DivideArray {

    public static void main(String[] args) {
        double[] arr = {1.55, 33, 31, 155, 78};
        int divisor = 2;
        DivideArray.divideArrayParts(arr, divisor);
    }

    public static void divideArrayParts(double[] arr, double divisor) {
        double[] result = new double[arr.length];
        try {
            for (int i = 0; i < arr.length; i++) {
                result[i] = arr[i] / divisor;
            }
            System.out.println("Divide Result:");
            System.out.println(Arrays.toString(result));
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is impossible!");
        }
    }
}