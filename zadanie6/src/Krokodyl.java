public class Krokodyl extends Zwierze{
    private int liczbaZebow;
    public Krokodyl(String nazwa, int wiek, int liczbaZebow) {
        super(nazwa, wiek);
        this.liczbaZebow = liczbaZebow;
    }
    public int getLiczbaZebow() {
        return liczbaZebow;
    }
    public void setLiczbaZebow(int liczbaZebow) {
        this.liczbaZebow = liczbaZebow;
    }
    public void nurkuj(){
        System.out.println("Krokodyl nurkuje w rzece");
    }
    @Override
    public String wydajDzwiek(){
        return "Warczy";
    }
    @Override
    public String poruszajSie(){
        return "Pełza i pływa w wodzie";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Rzegi i bagna tropikalne";
    }
}
