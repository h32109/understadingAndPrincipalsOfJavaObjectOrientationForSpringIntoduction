package inheritance01;

public class Sparrow extends Bird implements Flyable {
    public Sparrow() {
        name = "참새";
    }

    public void fly() {
        System.out.println("날고있습니다! 푸드덕");
    }
}
