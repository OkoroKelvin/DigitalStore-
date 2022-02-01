package SetVsMap;

public class ClassB extends Thread {
    public void run() {
        for (int j = 5; j > 0; j--) {
            System.out.println("thread of class B is running: j=" + j);
        }
    }
}
