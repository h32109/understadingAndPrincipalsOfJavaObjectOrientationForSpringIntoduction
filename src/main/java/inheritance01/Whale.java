package inheritance01;

public class Whale extends Mammal implements Swimmable {
    public Whale() {
        name = "고래";
    }

    public void swim() {
        System.out.println("수영중입니다!! 어푸어푸");
    }
}
