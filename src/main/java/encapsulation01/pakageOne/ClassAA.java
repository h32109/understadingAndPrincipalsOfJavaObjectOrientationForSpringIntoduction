package encapsulation01.pakageOne;

public class ClassAA extends ClassA {
    void runSomething(){
        ClassA.pubSt = 0;
        this.pubSt = 0;
        pubSt = 0;
    }

    static void runStaticthing(){
    }
}
