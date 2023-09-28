public class Pyramiidid {
    public static void main(String[] args) {
        KTH12_A();
        KTH12_B();
        KTH12_C();
        KTH12_D();
    }

    public static void KTH12_A() {
        int[] pyramid = {1, 3, 5, 3, 1};

        for (int i = 0; i < pyramid.length; i++) {
            for (int j = 0; j < pyramid[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void KTH12_B() {
        int pyramidHeight = 5;

        for (int i = 0; i < pyramidHeight; i++) {
            for (int j = 4; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < pyramidHeight - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void KTH12_C() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void KTH12_D() {
        int pyramidHeight = 5;

        for (int i = 0; i < pyramidHeight; i++) {
            for (int j = 4; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < pyramidHeight - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = pyramidHeight - 2; i >= 0; i--) {
            for (int j = 4; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < pyramidHeight - i; k++) {
                System.out.print("*");
            }
            System.out.println();   
        }
    }
}