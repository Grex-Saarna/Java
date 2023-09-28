public class Harjutus82 {
    public static void main(String[] args) {

        harjutus82kass kiisu = new harjutus82kass("Krants", 69, "kodutu", "prantsusmaa", "auto");
        kiisu.tüüp();
        kiisu.nimi();
        kiisu.vanus();
        kiisu.riik(); 
        kiisu.auto();

        harjutus82vaal vaal = new harjutus82vaal("Mirko", 56, "Canadas", "Japan");
        vaal.nimi();
        vaal.vanus();
        vaal.rahvus();
        vaal.riik();

    }

}