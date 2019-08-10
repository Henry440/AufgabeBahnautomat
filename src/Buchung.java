public class Buchung {
    Fahrziel fahrziel;
    int anzahl;
    int klasse;
    boolean bahncard;
    int zeit;

    public Buchung(Fahrziel fahrziel, int anzahl, int klasse, boolean bahncard, int zeit) {
        this.fahrziel = fahrziel;
        this.anzahl = anzahl;
        this.klasse = klasse;
        this.bahncard = bahncard;
        this.zeit = zeit;
    }

    public Buchung() {}

    public double Kaufen(){
        double ret = 0;
        fahrziel.setBuys(fahrziel.getBuys() + anzahl);

        ret = fahrziel.getPreis() * anzahl;

        if(klasse == 1) {
            ret = ret * 110 / 100;
        }

        if(bahncard){
            ret = ret * 75 / 100;
        }

        if(zeit >= 7){
            ret = ret * 60 / 100;
        }else if( zeit >= 3){
            ret = ret * 75 / 100;
        }
        fahrziel.setUmsatz(fahrziel.getUmsatz() + ret);
        return ret;
    }

    public Fahrziel getFahrziel() {
        return fahrziel;
    }

    public void setFahrziel(Fahrziel fahrziel) {
        this.fahrziel = fahrziel;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public int getKlasse() {
        return klasse;
    }

    public void setKlasse(int klasse) {
        this.klasse = klasse;
    }

    public boolean isBahncard() {
        return bahncard;
    }

    public void setBahncard(boolean bahncard) {
        this.bahncard = bahncard;
    }

    public int getZeit() {
        return zeit;
    }

    public void setZeit(int zeit) {
        this.zeit = zeit;
    }
}
