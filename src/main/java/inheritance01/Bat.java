package inheritance01;

public class Bat extends Mammal implements Flyable {
    public Bat() {
        name = "박쥐";
    }

    public void fly() {
        System.out.println("날고잇습니다! 펄럭펄럭");
    }
}
