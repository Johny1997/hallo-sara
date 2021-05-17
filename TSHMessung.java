package progr1.module08;

import java.util.Date;

/**
 * Die TSHMessung repräsentiert einen Wert zu einem bestimmten Zeitpunkt.
 * Einmal erzeugt, kann es nicht mehr verändert werden.
 * Es hat aber nicht nur Getter, sondern auch eine Methode, die überprüft,
 * ob der Wert im Normbereich liegt oder nicht.
 */
public class TSHMessung {
    // Grenzwerte als Konstanten
    private static final double UNTERGRENZE = 0.3;
    private static final double OBERGRENZE = 2.5;
    // Instanzvariablen
    private final Person person;
    private final double wert;
    // Datum repräsentiert als Millisekunden seit 1. Januar 1970 00:00
    private final long zeitStempel;

    // Konstruktor
    public TSHMessung(Person person, double wert) {
        this.person = person;
        this.wert = wert;
        // setzt die aktuelle Zeit
        this.zeitStempel = System.currentTimeMillis();
    }

    // Getter
    public long getZeitStempel() {
        return zeitStempel;
    }
    public double getWert() {
        return wert;
    }
    public Person getPerson() {
        return person;
    }

    /**
     * @return wahr, wenn der gemessene Wert im Normbereich liegt, sonst falsch.
     */
    public boolean istNormal() {
        return  wert >= UNTERGRENZE && wert <= OBERGRENZE;
    }

    // überschriebene Methoden
    @Override
    public String toString() {
        // TODO: Messbericht gemäss Aufgabe.
        // mit java.util.Date kann der Zeitstempel formatiert werden.

        String returnString = "************\n";
        returnString += person.getVorname() + ", " + person.getNachname() + ", " + person.getGeburtsDatum() + "\n";

        if (!this.istNormal()){
            returnString += "Bitte klären Sie das Ergebnis ab \n";
        }
        returnString += new Date((this.zeitStempel)) + ": "+ this.getWert() + "\n";

        return returnString;

    }
}
