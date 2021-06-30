


public class Kontakt {

    private String email;
    private String mobileNummer;
    private String bueroNummer;

    @Override
    public String toString() {
        return "Kontakt{" +
                "email='" + email + '\'' +
                ", mobileNummer='" + mobileNummer + '\'' +
                ", bueroNummer='" + bueroNummer + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNummer() {
        return mobileNummer;
    }

    public void setMobileNummer(String mobileNummer) {
        this.mobileNummer = mobileNummer;
    }

    public String getBueroNummer() {
        return bueroNummer;
    }

    public void setBueroNummer(String bueroNummer) {
        this.bueroNummer = bueroNummer;
    }

    public Kontakt(String email, String mobileNummer, String bueroNummer) {
        this.email = email;
        this.mobileNummer = mobileNummer;
        this.bueroNummer = bueroNummer;
    }

}
