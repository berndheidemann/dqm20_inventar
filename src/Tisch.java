public class Tisch extends Moebelstueck {

    private double hoehe;
    private double breite;
    private double laenge;


    public Tisch(String inventarNr, String bezeichnung) {
        super(inventarNr, bezeichnung);
    }

    @Override
    public String toString() {
        return "Tisch{" +
                super.toString() +
                ", hoehe=" + hoehe +
                ", breite=" + breite +
                ", laenge=" + laenge +

                '}';
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
}
