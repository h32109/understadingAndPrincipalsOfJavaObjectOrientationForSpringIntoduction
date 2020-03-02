package encapsulation01.pakageOne;

public class ClassA {
    private int pri;
    int def;
    protected int pro;
    public int pub;
    static private int priSt;
    static int defSt;
    static protected int proSt;
    static public int pubSt;

    void runSomething(){
        ClassA.pubSt = 0;
        this.pubSt = 0;
        pubSt = 0;
        this.pri = 0;

    }

    static void runStaticthing(){

    }
}
