public class Pindalad {
    public static double roopkylikS(String a, String h) { //rööpkülika valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus; //valem
    return s;
    }
    
    public static double ristkylikS(String a, String h) { //rist küliku pindala valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus; //valem mis korrutab ühe aluse korgusega
    return s;
    }
    
    public static double kolmnurkS(String a, String h) { //Kolmnurga pindala valem
    float alus = Float.parseFloat(a);
    float korgus = Float.parseFloat(h);
    double s = alus * korgus/2; //valem
    return s;
    }  
}






    