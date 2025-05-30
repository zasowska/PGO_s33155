package Cw3_zadanie3;
import java.util.ArrayList;

public class Playlista {
    private String nazwa;
    private ArrayList<String> listaUtworow = new ArrayList<>();

    public Playlista(String nazwa) {
        this.nazwa = nazwa;
    }
    //To-do getter, setter do nazwy
    public String getNazwa() {
        return nazwa;
    }
    public String setNazwa(){
        return nazwa;
    }

    public void dodajUtwor(String nazwaUtworu) {
        if (nazwaUtworu == null || nazwaUtworu.trim().isEmpty()) {
            return;
        }
        if (listaUtworow.contains(nazwaUtworu)) {
            return;
        }
        listaUtworow.add(nazwaUtworu);
    }

    public void usunUtwor(String nazwaUtworu) {
        listaUtworow.remove(nazwaUtworu);
    }

    public void wyswietlUtwory() {
        System.out.println("Playlista: " + nazwa);
        for (int i = 0; i < listaUtworow.size(); i++) {
            System.out.println("Utwor " + i + ": " + listaUtworow.get(i));
        }
    }

    public void wyszukajUtwory(String opis) {
        if(opis == null){
            return;
        }
        System.out.println("Playlista: " + nazwa);
        System.out.println("Nazwy utworów zawierające : " + opis);
        for (int i = 0; i < listaUtworow.size(); i++) {
            if (listaUtworow.get(i).contains(opis)) {
                System.out.println("Utwor " + i + ": " + listaUtworow.get(i));
            }
        }
    }
}