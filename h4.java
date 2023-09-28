import java.util.Scanner;

public class h4{
    public static void main(String[] args) {

        String[] nimed = {"Gregori Saarna"};
        int[] vanused = {17};
        
        for (int i = 0; i < vanused.length; i++) {
        System.out.printf("%-20s %d%n",nimed[i], vanused[i]);           //See kood prindib vormindatud teksti, kus %s tähistab stringi ja %d tähistab täisarvu.
    
    Scanner scanner = new Scanner (System.in);

    System.out.print("Sisesta suvalist teksti: "); 

    String nimi = scanner.nextLine();                                   //see kood loeb kasutaja sisestatud teksti (string) ja salvestab selle muutujasse nimega

    System.out.println(nimi);
    System.out.print("sisesta tekst väikeste tähtedega (see teeb ise suureks) ");

    String tekst = scanner.nextLine();
    String suurtähedTekst = tekst.toUpperCase();                        //see teeb su väikesed tähed suurteks tähtedeks

    System.out.println("suurtähtedega tekst: " + suurtähedTekst);
    System.out.println("märkide arv: ");                                //see prindib välja palju märke on tekstisaaaa
    System.out.println(tekst.length());

    String[] sõnad = tekst.split("\\s+");
        int sõnadeArv = sõnad.length;
        System.out.println("sonade arv tekstis: " + sõnadeArv);         //see prindib välja palju sonu tekstis on

    String esimeneSõna = sõnad[0];
        System.out.printf("esimene sona: %s%n", esimeneSõna);           //see prindib välja esimese sona

        scanner.close();
        }
        }
       }
 
//Väljund
//Gregori Saarna       17
//Sisesta suvalist teksti: ...
//...
//...
//sisesta tekst väikeste tähtedega (see teeb ise suureks) Suurtähtedega tekst: ...
//Märkide arv:
//...'
//Sõnade arv tekstis: ...
//Esimene sõna: ...

        
