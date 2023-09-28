// Gregori Saarna IT-22
import java.util.Scanner;

public class h5 {
    public static void main(String[] args) {
        Scanner sisestus = new Scanner(System.in);

        System.out.print("Sisesta esimene arv: ");      //see tahab et sisestaksid esimese arvu
        double arv1 = sisestus.nextDouble();

        System.out.print("Sisesta teine arv: ");        //see tahab et sisestaksid teise arvu
        double arv2 = sisestus.nextDouble();
        
        if (arv2 != 0) {
            double tulemus = arv1 / arv2;
            System.out.println("Jagamistulemus: " + tulemus);       //see jagab need tulemused
        } else {
            System.out.println("VIGA!!!: Nulliga ei saa jagada.");      //see on error tuleb kui paned 0 jagamis tehte ette näiteks 0123
        }

        sisestus.close();
    }
}

