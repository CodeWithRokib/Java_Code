package Thread;

public class Thread_Extend extends Thread {

    public void run(){
        for (int i = 1; i<= 5; i++){
            System.out.println("Hello I am Rokibul Hasan Rokib");
            try{
                Thread.sleep(500);
            }catch(Exception e){
            }
        }
    }
}
class Rokib extends Thread{
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        Rokib rk = new Rokib();
        Thread_Extend cl1 = new Thread_Extend();

        rk.start();
        cl1.start();
    }
}
