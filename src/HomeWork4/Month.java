package HomeWork4;

public class Month {
    public static void monthDaysOut(int month) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("In the month number " + month + " = 31 days! ");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("In the month number " + month + " = 30 days! ");
                break;
            case 2:
                System.out.println("In the month number " + month + " = 28 days! ");
                break;
            default:
                System.out.println("month does not exist");

        }
    }
}
