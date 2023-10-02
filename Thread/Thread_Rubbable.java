package Thread;

public class Thread_Rubbable implements Runnable {
    public void run(){
        for(int i = 0; i<=5; i++){
            System.out.println("Rokib");
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
class Number implements Runnable {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
class Main1{
    public static void main(String[] args) {
        Number h1 = new Number();
        Thread_Rubbable h2 = new Thread_Rubbable();
        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();
    }
}
