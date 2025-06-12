public class Lew extends Zwierze {
    private int dlugoscGrzywy;
    public Lew(String nazwa, int wiek, int dlugoscGrzywy) {
        super(nazwa, wiek);
        this.dlugoscGrzywy = dlugoscGrzywy;
    }
    public int getDlugoscGrzywy() {
        return dlugoscGrzywy;
    }
    public void setDlugoscGrzywy(int dlugoscGrzywy) {
        this.dlugoscGrzywy = dlugoscGrzywy;
    }
    public void ryczenie(){
        System.out.println("Lew głośno ryczy");
    }
    @Override
    public String wydajDzwiek(){
        return "Ryczy";
    }
    @Override
    public String poruszajSie(){
        return "Biega po sawannie";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Sawanna afrykańska";
    }
}
