public class Programm {

    public static void main(String[] args) {
        Raum raum = new Raum("208");
        Stuhl stuhl1 = new Stuhl("192", "Toller Drehstuhl");
        stuhl1.setMaterial("Eisen und Stoff");
        stuhl1.setGewicht(9.8);
        stuhl1.setBeschreibung("Bla Bla Bla");
        stuhl1.setSitzhoehe(60.5);


        Stuhl stuhl2 = new Stuhl("kjwqhd821", "Kaputter Drehstuhl");
        stuhl2.setMaterial("Eisen und Stoff");
        stuhl2.setGewicht(9.8);
        stuhl2.setBeschreibung("Bla Bla Bla");
        stuhl2.setSitzhoehe(60.5);

        Tisch tisch1 = new Tisch("0821098", "Tisch voll mit Kratzern");
        tisch1.setMaterial("Holz und Titan");
        tisch1.setGewicht(90.98);
        tisch1.setBeschreibung("Krasses Teil");
        tisch1.setBreite(120.0);
        tisch1.setHoehe(90.9);
        tisch1.setLaenge(55.5);

        Kontakt kontakt1 = new Kontakt("a.d@mail.de", "981273921", "09213");
        Techniker andy = new Techniker("Andreas", "Döpke", kontakt1);

        raum.setTechniker(andy);
        raum.addMoebel(stuhl1);
        raum.addMoebel(stuhl2);
        raum.addMoebel(tisch1);

        System.out.println(raum.toString());
    }
}
