public class Main {
    public static void main(String[] args) {
            Animal[] animals = {
                    new Cat(),
                    new Dog(),
                    new Lion(),
                    new Wolf()
            };
            for (Animal a : animals) {
                a.makeNoise();
                a.roam();
                System.out.println(a.sleep());
                System.out.println();
            }
        Animal animal1 = new Animal();
        animal1.makeNoise();
        animal1.roam();
    }
}
