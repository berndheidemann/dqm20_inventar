public class MoebelNichtGefundenException extends Exception {


    private String inventarNr;

    public MoebelNichtGefundenException(String inventarNr) {
        this.inventarNr = inventarNr;
    }

    public String getMessage() {
        return "Moebel mit der Nummer " + this.inventarNr + " nicht gefunden";
    }
}
