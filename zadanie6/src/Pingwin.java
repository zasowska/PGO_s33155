public class Pingwin extends Zwierze {
    private double predkoscPlywania;
    public Pingwin(String nazwa, int wiek, double predkoscPlywania) {
        super(nazwa, wiek);
        this.predkoscPlywania = predkoscPlywania;
    }
    public double getPredkoscPlywania() {
        return predkoscPlywania;
    }
    public void setPredkoscPlywania(double predkoscPlywania) {
        this.predkoscPlywania = predkoscPlywania;
    }
    public void nurkuj(){
        System.out.println("Pingwin nurkuje pod wodą");
    }
    @Override
    public String wydajDzwiek(){
        return "Gulgocze";
    }
    @Override
    public String poruszajSie(){
        return "Chodzi chwiejnym krokiem i pływa w wodzie";
    }
    @Override
    public String srodowiskoNaturalne(){
        return "Regiony polarne, Antarktyda";
    }
}
