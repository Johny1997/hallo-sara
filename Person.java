package progr1.module08;

import java.util.Arrays;

//TODO implementieren
public class Person {
    private String vorname;
    private String nachname;
    private String geburtsDatum;
    private Adresse adresse;

    private Rechnung[] rechnungen = new Rechnung[100];
    private int anzahlRechnungen = 0; // status
    private String messBericht = "";

    public Person(String vorname, String nachname, String geburtsDatum, Adresse adresse){
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
        this.adresse = adresse;
    }

    public void hinzufuegen(Rechnung rechnung){ // Rechnung von der Klasse Rechnung
        this.rechnungen[this.anzahlRechnungen] = rechnung;
        this.anzahlRechnungen ++;
    }

    public void hinzufuegen(String messbericht){

        this.messBericht = this.messBericht + messbericht;
    }

    public void zahlen(Versicherung versicherung){
        for (int i = 0; i < anzahlRechnungen; i++) {
            if(!rechnungen[i].isBezahlt() && versicherung.getTyp().equals("Tiers Garant")){
                rechnungen[i].setBezahlt(true);
            }
        }
    }
    public Rechnung[] offeneRechnungen(){
        Rechnung[] rechnungenOffen = new Rechnung[100];
        int count = 0;

        for (int i = 0; i < anzahlRechnungen; i++) {
            if (!rechnungen[i].isBezahlt()){
                rechnungenOffen[count] = rechnungen[i];
                count++;
            }
        }
        return rechnungenOffen;
    }

    public int getAnzahlRechnungen() {
        return anzahlRechnungen;
    }

    public Rechnung[] getRechnungen() {
        return rechnungen;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeburtsDatum() {
        return geburtsDatum;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public String getMessBericht() {
        return messBericht;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsDatum='" + geburtsDatum + '\'' +
                ", adresse=" + adresse +
                ", rechnungen=" + Arrays.toString(rechnungen) +
                ", anzahlRechnungen=" + anzahlRechnungen +
                ", messBericht='" + messBericht + '\'' +
                '}';
    }
}
