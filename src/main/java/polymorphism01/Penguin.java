package polymorphism01;

public class Penguin extends Animal {
    public String habitat;

    public void showHabitat(){
        System.out.printf("%s는 %s에 살아\n", name, habitat);
    }

    public void showName() {
        System.out.println("내 이름은 알아서 뭐하시게요?");
    }

    public void showName(String yourname){
        System.out.printf("%s야 안녕 나는 %s라고 해\n", yourname, name);
    }
}
