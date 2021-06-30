public class Stuhl extends Moebelstueck {

    private double sitzhoehe;

    public Stuhl(String inventarNr, String bezeichnung) {
        super(inventarNr, bezeichnung);
    }

    public void setSitzhoehe(double sitzhoehe) {
        this.sitzhoehe = sitzhoehe;
    }

    public double getSitzhoehe() {
        return this.sitzhoehe;
    }

    @Override
    public String toString() {
        return "Stuhl{" +
                super.toString() +
                ", sitzhoehe=" + sitzhoehe +
                '}';
    }

}
