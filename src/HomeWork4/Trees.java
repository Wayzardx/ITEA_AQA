package HomeWork4;

public class Trees {

    public static void main(String[] args) {

        tree(); // run model 1 tree method
        tree2(); // run model 2 tree method
        System.out.println();
        tree3(); // run model 3 tree method
    }


    public static void tree() {
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void tree2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void tree3() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}

