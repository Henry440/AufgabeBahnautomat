public class Fahrziel {
    String name;
    int preis;
    int buys;
    double umsatz;

    public Fahrziel(String name, int preis, int buys) {
        this.name = name;
        this.preis = preis;
        this.buys = buys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getBuys() {
        return buys;
    }

    public void setBuys(int buys) {
        this.buys = buys;
    }

    public double getUmsatz() {
        return umsatz;
    }

    public void setUmsatz(double umsatz) {
        this.umsatz = umsatz;
    }
}
