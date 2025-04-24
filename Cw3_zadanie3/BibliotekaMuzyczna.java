package Cw3_zadanie3;
import java.util.ArrayList;
public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> listaUtworow = new ArrayList<>();
    private ArrayList<Playlista> listaPlaylist = new ArrayList<>();

    public BibliotekaMuzyczna(String nazwa, String wlasciciel){
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
    }
    //Operacje na utworach
    public void dodajUtwor(String nazwaUtworu){
        listaUtworow.add(nazwaUtworu);
    }
    public void usunUtwor(String utwor){
        listaUtworow.remove(utwor);
        for (Playlista p : listaPlaylist){
            p.usunUtwor(utwor);
        }
    }
    public void wyswietlUtwory(){
        for(String utwor : listaUtworow){
            System.out.println(utwor);
        }
    }
    public void wyszukajUtwory(String fraza){
        System.out.println("Wyniki wyszukiwania utworów zawierających: " + fraza);
        for (String utwor : listaUtworow){
            if (utwor.toLowerCase().contains(fraza.toLowerCase())){
                System.out.println(utwor);
            }
        }
    }
    //Operacje na playlistach
    public void utworzPlayliste(String nazwaPlaylisty){
        if(znajdzPlayliste (nazwaPlaylisty) == null){
            listaPlaylist.add(new Playlista(nazwaPlaylisty));
        }
    }
    private Playlista znajdzPlayliste (String nazwa){
        for (int i = 0; i < listaPlaylist.size(); i++){
            Playlista p = listaPlaylist.get(i);
            if (p.getNazwa().equals(nazwa)){
                return p;
            }
        }
        return null;
    }
    public void dodajUtworDoPlaylisty(String utwor, String playlista){
        Playlista p = znajdzPlayliste(playlista);
        if(p==null){
            throw new IllegalArgumentException("Taka playlista nie istnieje");
        }
        p.dodajUtwor(utwor);
    }
    public void wyswietlPlayliste(String nazwaPlaylisty){
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if(p != null){
            p.wyswietlUtwory();
        }else{
            System.out.println("Nie znaleziono playlisty o nazwie: " + nazwaPlaylisty);
        }
    }
    public void wyswietlWszystkiePlaylisty(){
        System.out.println("Wszystkie Playlisty: ");
        for (Playlista p : listaPlaylist){
            System.out.println(p.getNazwa());
        }
    }
    public int getLiczbaUtworow(){
        return listaUtworow.size();
    }
    public int getLiczbaPlaylist(){
        return listaPlaylist.size();
    }
}
