import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzeń = new ArrayList<>();
    private ArrayList<Klient> listaKlientów = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
    }
    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwację(wydarzenie);
        } else {
            System.out.println("Brak dostępnych miejsc na " + wydarzenie.getNazwa());
        }
    }
    public Wydarzenie znajdźWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzeń) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }
    public Klient znajdźKlienta(String nazwisko) {
        for (Klient k : listaKlientów) {
            if (k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }
    public void zmieńCenęWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdźWydarzenie(nazwa);
        if (w != null) {
            w.setCena(nowaCena);
        }
    }
}