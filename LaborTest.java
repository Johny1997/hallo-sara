package progr1.module08;

public class LaborTest {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("Ilfisgraben","97","3550","Langnau");
        Adresse adresse1 = new Adresse("Ilfisgraben","97","3550","Langnau");
        Person jonas = new Person("Jonas","Lüthi", "28.07.1997",adresse);
        System.out.println(jonas);
        Versicherung versicherung = new Versicherung();

        System.out.println("Person hat: " +jonas.getAnzahlRechnungen() + " Rechnungen " ); // 0


        jonas.hinzufuegen(new Rechnung(5,true, jonas));


        System.out.println("Person hat: " +jonas.getAnzahlRechnungen() + " Rechnungen " ); // 1

        jonas.zahlen(versicherung);


        versicherung.rechnungErstellen(jonas);

        System.out.println("---------------------------------------------");

        Person samuel = new Person("Samuel", "Lüthi", "20.06.1995", adresse1);
        versicherung.rechnungErstellen(samuel);
        System.out.println("Person hat: " +samuel.getAnzahlRechnungen() + " Rechnungen " ); // 1


        System.out.println("Anzahl Rechnungen:  " + jonas.offeneRechnungen().length);


        System.out.println("---------------------------------------------");

        TSHMessung messung = new TSHMessung(jonas,1);
        jonas.hinzufuegen(messung.toString());
        System.out.println(jonas.getMessBericht());

        TSHMessung messung1 = new TSHMessung(samuel,5);
        samuel.hinzufuegen(messung1.toString());
        System.out.println(samuel.getMessBericht());

    }
}
