import java.util.ArrayList;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient (String imię, String nazwisko){
        this.imię = imię;
        this.nazwisko = nazwisko;
    }
    public Klient (String imię, String nazwisko, String email){
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public String getImię() {
        return imię;
    }

    public void setImię(String imie) {
        this.imię = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void dodajRezerwację(Wydarzenie wydarzenie){
        listaRezerwacji.add(wydarzenie);
    }
    public void wyświetlRezerwacje(){
        for(Wydarzenie w : listaRezerwacji){
            System.out.println(w);
        }
    }
    public void anulujRezerwację(Wydarzenie wydarzenie){
        if(listaRezerwacji.remove(wydarzenie)){
            wydarzenie.zwolnijMiejsce();
        }
    }
}
