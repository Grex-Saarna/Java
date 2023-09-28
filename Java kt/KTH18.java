public class KTH18 {
    public static void main(String[] args) {
        int[] arvud = {3, 5, 4, 12, 5};

        System.out.print("Paaritud arvud");
        for (int arv : arvud) {
            if (arv % 2 != 0) {
                System.out.print(arv + " ");
            }
        }

        System.out.println();

        System.out.print("Paarisarvud arvud");
        for (int arv : arvud) {
            if (arv % 2 == 0) {
                System.out.print(arv + " ");
            }
        }
    }
}