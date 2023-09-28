public class h3 {
    public static void main(String[] args) {
        int arvud[] = {12, 5, 10, 10, 28, 17, 5, 19, 0, 13, 0, 22, 7, 0, 17, 2, 24, 1, 13, 29, 0, 7, 16, 8, 7, 4, 27, 8, 8, 23, 26, 25, 15, 2, 26, 1};
        
        System.out.println("Esimene arv massivist: " + arvud[0]);
        System.out.println("Viimane arv massivist: " + arvud[arvud.length - 1]);
        System.out.println("Elementide arv: " + arvud.length);

        int summa = 0;
        for (int i = 0; i < 10; i++) {                  //see kood algatab tsükli mis läbib massiivi või kollektsiooni (nagu arvud) esimesed 10 elementi ja lisab need kokku muutujasse summa.
            summa += arvud[i];
        }

        System.out.println("Summa esimesest 10-st elemendist: " + summa);
        System.out.println("Elementide keskmine: " + (float) summa / arvud.length);

        int[][] data = {
            {1, 23}, {2, 15}, {3, 29}, {4, 15}, {5, 26}, {6, 17}, {7, 26}, {8, 15}, {9, 28}, {10, 12},
            {11, 24}, {12, 16}, {13, 21}, {14, 10}, {15, 10}, {16, 26}, {17, 27}, {18, 19}, {19, 14},
            {20, 14}, {21, 14}, {22, 26}, {23, 20}, {24, 28}, {25, 29}, {26, 11}, {27, 28}, {28, 19},
            {29, 25}, {30, 12}
        };

        System.out.println("Temperatuurid:");
        for (int i = 0; i < data.length; i++) {     //üleval on väja toodud [DATA] see votab data asjad ja valib sealt väja koige suurema ja prindib selle välja
            System.out.println(data[i][1]);         //see prindib välja suuremad temperatuurid
        }
    }
}