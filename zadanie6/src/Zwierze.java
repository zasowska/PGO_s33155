public abstract class Zwierze {
    protected String nazwa;
    protected int wiek;
     public Zwierze(String nazwa, int wiek) {
         this.nazwa = nazwa;
         this.wiek = wiek;
     }
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
    public abstract String wydajDzwiek();
    public abstract String poruszajSie();
    public abstract String srodowiskoNaturalne();
    public void wyswietlInformacje(){
        System.out.println("Nazwa " + nazwa);
        System.out.println("Wiek " + wiek);
        System.out.println("Dźwięk: " + wydajDzwiek());
        System.out.println("Porusza się: " + poruszajSie());
        System.out.println("Srodowisko naturalne: " + srodowiskoNaturalne());
    }

}
