package polymorphism01;

public class Zoo {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.name = "뽀로로";
        pororo.habitat = "남극";

        pororo.showName();
        pororo.showName("원종석");
        pororo.showHabitat();

        Animal pinggu = new Penguin();
        pinggu.name = "핑구";
        pinggu.showName();
    }
}
