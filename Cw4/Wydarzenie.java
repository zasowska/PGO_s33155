public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 100;
    private double cena;

    public Wydarzenie (String nazwa, double cena){
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie (String nazwa, double cena, String data){
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }

    public Wydarzenie (String nazwa, double cena, String data, String miejsce){
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;

    }
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getMiejsce() {
        return miejsce;
    }
    public void setMiejsce(String miejsce) {
        this.miejsce = miejsce;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }
    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }
    public void setDostępneMiejsca(int dostępneMiejsca) {
        this.dostępneMiejsca = dostępneMiejsca;
    }
    public String toString(){
        return "Nazwa: " + nazwa + '\n' + "Data: " + data + '\n' + "Miejsce: " + miejsce + '\n' + "Cena: " + cena; //null wyświetlany w zmiennych, które nie mają przypisanych wartości
    }
    public boolean zarezerwujMiejsce(){
        if (dostępneMiejsca > 0){
            dostępneMiejsca --;
            return true;
        }
        return false;
    }

    public void zwolnijMiejsce() {
        if(dostępneMiejsca < maxLiczbaMiejsc){
            dostępneMiejsca++;
        }
    }
}
