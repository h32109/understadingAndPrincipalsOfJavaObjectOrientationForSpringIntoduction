package inheritance01;

public class Penguin extends Bird implements Swimmable {

    public Penguin() {
        name = "펭귄";
    }

    public void swim() {
        System.out.println("수영하고있습니다! 영차영차");
    }
}
