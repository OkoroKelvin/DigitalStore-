package SetVsMap;

public class ClassA implements Runnable{
    public void run(){
        for(int i=5; i>0; i--){
            System.out.println("Thread of class A is running =" +i);
        }
    }
}
