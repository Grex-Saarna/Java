public class KTH10 {

    public static void main(String[] args) {
        int arv = 1;
        while (arv <= 66) {
            for (int i = 0; i < 5; i++) {
                if (arv <= 66) {
                    System.out.print(arv);
                    arv++;
                } else {
                    break;
                }
            }
            System.out.println();
        }
    }
}