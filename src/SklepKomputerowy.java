import java.time.LocalDate;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[10];
    private Klient [] klienci = new Klient [10];
    private Zamowienie[] zamowienia = new Zamowienie[10];
    private int liczbaProduktow;
    private int liczbaKlientow;
    private int liczbaZamowien;

    public void dodajProdukt(Produkt produkt) {
        //to-do
        produkty[liczbaProduktow++] = produkt;
    }

    public void dodajKlienta(Klient klient) {
        //to-do
        klienci[liczbaKlientow++] = klient;
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produktyZamowienia, int[] ilosciZamowienia) {
        Zamowienie zamowienie = new Zamowienie();
        zamowienie.setId(0);
        zamowienie.setKlient(klient);
        zamowienie.setProdukty(produktyZamowienia);
        zamowienie.setIlosci(ilosciZamowienia);
        zamowienie.setStatus("Nowe");
        zamowienie.setDataZamowienia(LocalDate.now().toString());
        zamowienia[liczbaZamowien++]= zamowienie;
        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        //to-do?
        for (int i = 0; i < zamowienie.getProdukty().length; i++){
            Produkt produkt = zamowienie.getProdukty()[i];
            int nowaIlosc = produkt.getIloscWMagazynie() - zamowienie.getIlosci()[i];
            if(nowaIlosc < 0){
                nowaIlosc = 0;
            }else{
                produkt.setIloscWMagazynie(nowaIlosc);
            }
        }
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        //to-do; pętla?
        System.out.println("Produkty w kategorii: " + kategoria);
        for (int i = 0; i <liczbaProduktow; i++){
            if(produkty[i].getKategoria().equals(kategoria)){
                produkty[i].wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamowienie klienta: " + idKlienta);
        for (int i = 0; i < liczbaZamowien; i++) {
            if(klienci[i].getId() == idKlienta){
                zamowienia[i].wyswietlSzczegoly();
            }
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (int i = 0; i < liczbaZamowien; i++) {
            if (zamowienia[i].getId() == idZamowienia){
                zamowienia[i].setStatus(nowyStatus);
                return;
            }
        }
        System.out.println("Nie znaleziono zamówienia o ID: " + idZamowienia);
    }
}

