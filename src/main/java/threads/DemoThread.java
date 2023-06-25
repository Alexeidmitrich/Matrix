package threads;


class A extends Thread {

    @Override
    public void run() {
        printInfo();
    }

    public void printInfo(){
        for (int i = 0; i < 100; i++) {
            System.out.println("id " + Thread.currentThread().getId());

        }
    }
}
public class DemoThread {

    public static void main(String[] args) throws InterruptedException {
     Thread a = new A();
     Thread a1 = new A();
     Thread a2 = new A();
     a.start();
     a1.start();
     a2.start();

    }
}
