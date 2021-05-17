package progr1.module08;

public class Versicherung {
    private String name;
    private String typ = "Tiers Garant";

    public void bezahlen(){

    }

    public void rechnungErstellen(Person person){
        if (person.getAnzahlRechnungen() == 0){
            System.out.println("Noch keine Rechnung vorhanden --> wird eine erstellt");
            person.hinzufuegen(new Rechnung(1,false,person));
        }
        else {
            Rechnung rechnung = findeRechnungFuer(person);
            rechnung.setAnzahlMessungen(rechnung.getAnzahlMessungen() + 1);
            System.out.println("Rechnung vorhanden --> wird um eins erhöht: " + rechnung.getAnzahlMessungen());
        }

    }

    public void anzahlOffeneRechnungen(){

    }

    public Rechnung findeRechnungFuer(Person person){
        if (person.getAnzahlRechnungen() == 1){
            return person.getRechnungen()[0];
        }
        return null;
    }

    public String getTyp() {
        return typ;
    }
}
