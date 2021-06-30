public abstract class Moebelstueck {

    private String inventarNr;
    private String bezeichnung;
    private String material;
    private double gewicht;
    private String beschreibung;

    public Moebelstueck(String inventarNr, String bezeichnung) {
        this.inventarNr = inventarNr;
        this.bezeichnung = bezeichnung;
    }

    public String getInventarNr() {
        return inventarNr;
    }


    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    @Override
    public String toString() {
        return
                "inventarNr='" + inventarNr + '\'' +
                        ", bezeichnung='" + bezeichnung + '\'' +
                        ", material='" + material + '\'' +
                        ", gewicht=" + gewicht +
                        ", beschreibung='" + beschreibung + '\''
                ;
    }
}
