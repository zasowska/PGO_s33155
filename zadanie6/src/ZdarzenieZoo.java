public class ZdarzenieZoo {
    public static void main(String[] args) {
        Lew lew = new Lew("Lew afrykański", 5, 30);
        Pingwin pingwin = new Pingwin("Pingwin cesarski", 3, 10.5);
        Krokodyl krokodyl = new Krokodyl("Krokodyl nilowy", 4, 64);

        lew.wyswietlInformacje();
        System.out.println();
        pingwin.wyswietlInformacje();
        System.out.println();
        krokodyl.wyswietlInformacje();
        System.out.println();

        lew.ryczenie();
        pingwin.nurkuj();
        krokodyl.nurkuj();
    }
}
