import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bahnautomat {
    public static List <Fahrziel> ziele = new ArrayList<>();
    public static void main(String[] args) {
        ziele.add(new Fahrziel("Berlin",            100, 0));
        ziele.add(new Fahrziel("München",           150, 0));
        ziele.add(new Fahrziel("Nürnberg",          70,  0));
        ziele.add(new Fahrziel("Kleinkleckersdorf", 30,  0));
        ziele.add(new Fahrziel("Hintertupfingen",   250, 0));
        KaufenStarten();
        Auswertung();
    }

    private static void Auswertung() {
        System.out.println("---------------------");
        System.out.println("Kaufübersicht : ");
        int count = 1;
        double umsatz = 0;
        int buys = 0;
        for(Fahrziel current : ziele){
            System.out.println(count + ". " +current.getName() + " : " + current.getBuys() + " Einnahme : " + current.getUmsatz() + "€");
            buys = buys + current.getBuys();
            umsatz = umsatz + current.getUmsatz();
            count++;
        }
        System.out.println("---------------------");
        System.out.println("Käufe : " + buys);
        System.out.println("Umsatz: " + umsatz);
        System.out.println("Kosten pro Ticket : " + (umsatz/buys));
        System.out.println("---------------------");

    }

    private static void KaufenStarten() {
        boolean kaufprozess = true;
        Scanner s = new Scanner(System.in);
        Buchung buchung = new Buchung();
        int auswahl;

        while (kaufprozess){
            System.out.println("Fahrzeile:");
            int count = 1;
            for(Fahrziel current : ziele){
                System.out.println(count + ". " + current.getName());
                count++;
            }
            System.out.print("Nummer : ");

            auswahl = s.nextInt() - 1;
            Fahrziel select = ziele.get(auswahl);
            buchung.setFahrziel(select);

            System.out.print("Anzahl : ");
            auswahl = s.nextInt();
            buchung.setAnzahl(auswahl);

            System.out.print("Klasse : ");
            auswahl = s.nextInt();
            buchung.setKlasse(auswahl);

            System.out.println("0. Ohne Bahncard");
            System.out.println("1. Mit Bahncard");
            System.out.print("Bahncard : ");
            auswahl = s.nextInt();
            if(auswahl == 1){
                buchung.setBahncard(true);
            }else{
                buchung.setBahncard(false);
            }

            System.out.print("Abreise in Tagen : ");
            auswahl = s.nextInt();
            buchung.setZeit(auswahl);

            System.out.println("Endpreis : " + buchung.Kaufen() + "€");

            System.out.println("Weiter Kaufen :");
            System.out.println("0. Nein");
            System.out.println("1. Ja");
            System.out.print("Nummer : ");
            auswahl = s.nextInt();
            if(auswahl == 1){
                System.out.println("----------------\n");
                continue;
            }else{
                kaufprozess = false;
                break;
            }
        }
    }
}
