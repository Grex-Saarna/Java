public class Ruumalad {

	public static double ristahuka(String a, String h, String l) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        float laius = Float.parseFloat(l);
        double s = alus * korgus * laius;
        return s;
    } 

    public static double parallelepipedi(String a, String l, String h) {
        float alus = Float.parseFloat(a);
        float laius = Float.parseFloat(l);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus * laius;
        return s;
    }

    public static double Ristkülik(String a, String l, String h) {
        float alus = Float.parseFloat(a);
        float laius = Float.parseFloat(l);
        float korgus = Float.parseFloat(h);        
        double s = laius * korgus * alus;
        return s;
    }
    
}
