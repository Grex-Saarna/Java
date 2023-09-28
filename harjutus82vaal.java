public class harjutus82vaal {
    public String nimi;
    public int vanus;
    public String rahvus;
    public String riik;

    public harjutus82vaal(String nimi, int vanus, String rahvus, String riik) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.rahvus = rahvus;
        this.riik = riik;
    }
    public void nimi() {
        System.out.println("Tere mina olen " + nimi + "ma olen " + vanus + ".");
    }
    public void vanus() {
        System.out.println("jo wassap ma " + nimi + " also ma olen " + vanus + "aasntane.");
    }
    public void rahvus() {
        System.out.println("yo waddap ma ise olen " + rahvus + "ist.");
    }
    public void riik() {
        System.out.println("mul mul mul mul mulm mul liigun praegu " +rahvus+ "-->" + riik + "i joudu ja jaksu TSÄU");
    }
    

    

}