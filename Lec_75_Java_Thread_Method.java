package hello.com;
class Mythr1 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<10);
        System.out.println("I'm JavaThread Method");
        i++;
    }
}
class Mythr2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<10);
        System.out.println("I'm Thread method of 2");
        i++;
    }
}
public class Lec_75_Java_Thread_Method {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1();
        
    }
}
