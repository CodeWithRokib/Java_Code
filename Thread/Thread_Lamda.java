package Thread;

import java.security.spec.ECField;

public class Thread_Lamda {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 1; i<= 5; i++){
                System.out.println("Rokib, I Love You...");
                try{
                    Thread.sleep(500);
                }catch (Exception e){

                }
            }
        });
        Thread t2 = new Thread(()->{
          for (int i = 0; i<=5; i++){
              System.out.println(i);
              try{
                  Thread.sleep(500);
              }catch (Exception e){

              }
          }
        });

        t1.start();
        t2.start();
    }
}
