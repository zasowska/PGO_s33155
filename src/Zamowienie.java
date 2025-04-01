public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt [] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;
    //to-do getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double obliczWartoscZamowienia(){
        //to-do
        double wartoscZamowienia = 0;
        for(int i = 0; i<produkty.length; i++){
            wartoscZamowienia += produkty[i].getCena()*ilosci[i];
        }
        return wartoscZamowienia;
    }
    public void zastosujZnizke(){
        //to-do
        double wartosc = obliczWartoscZamowienia();
        if (klient.isCzyStaly()) {
            wartosc*= 0.9;
            System.out.println("Zastosowano zniżkę dla stałego klienta. Nowa wartość zamówienia: " + wartosc);
        }
    }
    public void wyswietlSzczegoly(){
        //to-do
        System.out.println("Wyświetl szczegóły");
        System.out.println("Data zamówienia: " + getDataZamowienia());
        System.out.println("Status zamówienia: " + getStatus());
        System.out.println("Produkty: ");
        for(int i = 0; i<produkty.length; i++){
            System.out.println(produkty[i].getNazwa() + " x" + ilosci[i]);
        }
        if (klient.isCzyStaly()) {
            zastosujZnizke();
        }else{
            System.out.println("Wartość zamówienia: " + obliczWartoscZamowienia());
        }
    }
}
