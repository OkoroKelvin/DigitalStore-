package SetVsMap;

public class Main {
    public static void main(String[] args) {
       // ClassB bi = new ClassB();
        ClassA ai = new ClassA();
       Thread ti = new Thread(ai);
       ti.start();
    }
}
