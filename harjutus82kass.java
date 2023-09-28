public class harjutus82kass {
    public String nimi;
    public int vanus;
    public String tüüp;
    public String riik;
    public String auto;

    public harjutus82kass(String nimi, int vanus, String tüüp, String riik, String auto) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.tüüp = tüüp;
        this.riik = riik;
        this.auto = auto;
    }
    public void nimi() {
        System.out.println("Mjau mina olen " + nimi + " meow " + vanus + " maow sööda mina ma vana kiisu"); //prindib välja kassi nime ja ta vanuse
    }

    public void vanus() {
        System.out.println("" + nimi + "" + tüüp + " anna süüa mul koht tühi");                             //prindib välja kassi nime ja tüübi
    }

    public void tüüp() {
        System.out.println("meow ma olen..." + tüüp);                                                       //Prindib välja kassi tüübi solona
    }

    public void riik() {        //kassi klass mille see votab this.riik = riik; ütlevalt välja toodud osast
        System.out.println("meow ma olen " + nimi + " " + riik + "lt palun anna mulle üks bauget");         //prindib välja kassi nime ja riigi
    }

    public void auto() {
        System.out.println("Ma olen räpane " + nimi + auto + "ga lapse ema " + riik + "lt ja mul on Lambo" );
    }

}