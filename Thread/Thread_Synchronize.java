package Thread;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Thread_Synchronize {
    int count = 0;
    public synchronized void count(){
        count++;
    }
}
class Main3{
    public static void main(String[] args)
        throws Exception{
            Thread_Synchronize c = new Thread_Synchronize();
            Thread t1 = new Thread(()->{
                for (int i = 1; i<=1000; i++){
                    c.count();
                }
            });
            Thread t2 = new Thread(()->{
               for (int i = 1; i<=1000; i++){
                   c.count();
               }
            });
            t1.start();
            t2.start();
            t1.join();
            t1.join();

            System.out.println("Count= "+c.count);
        }
    }

