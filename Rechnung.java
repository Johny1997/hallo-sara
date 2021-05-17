package progr1.module08;


public class Rechnung {
    private int anzahlMessungen = 0;
    private boolean bezahlt = false;
    private Person person;

    public Rechnung(int anzahlMessungen, boolean bezahlt, Person person) {
        this.anzahlMessungen = anzahlMessungen;
        this.bezahlt = bezahlt;
        this.person = person;
    }

    public int getAnzahlMessungen() {
        return anzahlMessungen;
    }

    public void setAnzahlMessungen(int anzahlMessungen) {
        this.anzahlMessungen = anzahlMessungen;
    }

    public boolean isBezahlt() {
        return bezahlt;
    }

    public void setBezahlt(boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
