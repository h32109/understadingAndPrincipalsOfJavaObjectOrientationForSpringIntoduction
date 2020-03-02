package inheritance01;

public class Zoo {
    public static void main(String[] args) {
        Flyable flyer1 = new Bat();
        flyer1.fly();

        Flyable flyer2 = new Sparrow();
        flyer2.fly();

        Swimmable[] cantSwimmers = new Swimmable[2];

        cantSwimmers[0] = new Whale();
        cantSwimmers[1] = new Penguin();

        for(Swimmable cantSwimmer : cantSwimmers){
            cantSwimmer.swim();
        }
    }
}
