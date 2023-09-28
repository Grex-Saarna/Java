// Gregori Saarna It-22


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class h6 {

    public static void main(String[] args) {
        ArrayList<Integer> arvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta täisarvud"); //see tahab täis arve

        while (true) {
            String sisend = scanner.nextLine();

            if (sisend.isEmpty()) {                 //kui midagi ei kirjuta siis see lopetab selle ära
                break;
            }

            if (onTaikeTaisarv(sisend)) {                   
                try {
                    int arv = Integer.parseInt(sisend);         //Kas sisend on väiksem või võrdne teatud taisarvuga ja kui see on, siis proovib see sisendit täisarvuks teisendada
                    arvud.add(arv);
                } catch (NumberFormatException e) {
                    System.err.println("Vigane sisend");
                }
            } else {
                System.err.println("Vigane sisend, sisestage ainult täisarvud."); //see prindib välja sellise errori kui ei sisesta täis arve
            }
        }

        scanner.close();

        int summa = arvudeSumma(arvud);
        double keskmine = arvudeKeskmine(arvud);

        System.out.println("Sisestatud arvude summa: " + summa);
        System.out.println("Sisestatud arvude keskmine: " + keskmine);

        
        try {
            salvestaAndmedFaili("arvud.txt", arvud, summa, keskmine);
            System.out.println("Andmed on salvestatud faili 'arvud.txt'."); //see salvestab faili kus on arvud "arvud.txt" faili
        } catch (IOException e) {
            System.err.println("Viga faili salvestamisel: " + e.getMessage()); // see error tuleb ette kui paned täis arvude asemel näiteks 1,3,5,7,9 jne siis see ei saa enanst salvestada faili
        }
    }

    public static boolean onTaikeTaisarv(String sisend) {
        return sisend.matches("\\d+");
    }
    public static int arvudeSumma(ArrayList<Integer> arvud) { //
        int summa = 0;
        for (int arv : arvud) {                             //see arvutab täisarvude summa ja tagastab selle summa tulemuse.
            summa += arv;
        }
        return summa;
    }

    public static double arvudeKeskmine(ArrayList<Integer> arvud) {
        if (arvud.isEmpty()) {
            return 0.0;                             //jälle kui arvude keskmist pole siis see lopetan ära selle
        }

        int summa = arvudeSumma(arvud);
        return (double) summa / arvud.size();
    }

    public static void salvestaAndmedFaili(String failinimi, ArrayList<Integer> arvud, int summa, double keskmine) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(failinimi))) {
            for (int arv : arvud) {
                writer.write(Integer.toString(arv));  //See Java-skript kirjutab antud täisarvude listi (arvud) faili, mille nimi on failinimi.
            }
        }
    }
}