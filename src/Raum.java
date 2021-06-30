import java.util.ArrayList;

public class Raum {

    private ArrayList<Moebelstueck> moebelListe;
    private Techniker techniker;
    private String raumnummer;

    public Raum(String raumnummer) {
        this.raumnummer = raumnummer;
        this.moebelListe = new ArrayList<>();
    }

    public String getRaumnummer() {
        return raumnummer;
    }

    public Techniker getTechniker() {
        return techniker;
    }

    public void setTechniker(Techniker techniker) {
        this.techniker = techniker;
    }

    public void addMoebel(Moebelstueck moebel) {
        moebelListe.add(moebel);
    }

    public Moebelstueck getMoebel(String inventarNr) throws MoebelNichtGefundenException {
        for (Moebelstueck moebel : moebelListe) {
            if (moebel.getInventarNr().equals(inventarNr)) {
                return moebel;
            }
        }
        throw new MoebelNichtGefundenException(inventarNr);
    }

    public void removeMoebel(Moebelstueck moebel) throws MoebelNichtGefundenException {
        if (moebelListe.contains(moebel)) {
            moebelListe.remove(moebel);
        } else {
            throw new MoebelNichtGefundenException(moebel.getInventarNr());
        }
    }

    public int getAnzahlMoebel() {
        return moebelListe.size();
    }

    public double getGewichtGesamt() {
        double gesamtGewicht = 0;
        for (Moebelstueck m : moebelListe) {
            gesamtGewicht = gesamtGewicht + m.getGewicht();
        }
        return gesamtGewicht;
    }

    @Override
    public String toString() {
        String str = " ****** Raum ***** \n";
        str += "Raumnummer: " + raumnummer + "\n";
        str += "Techniker: " + techniker.toString() + "\n";
        for (Moebelstueck m : moebelListe) {
            str += m.toString() + "\n";
        }
        str += "Anzahl der Möbelstücke: " + getAnzahlMoebel() + "\n";
        str += "Gesamtgewicht: " + getGewichtGesamt() + "\n";
        return str;
    }
}
