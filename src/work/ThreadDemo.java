package work;

public class ThreadDemo {
    public static void main(String[] args) {
    // First Thread: Thread John
    Runnable thread1=()->{
        // this is the body of the thread
        // stuff
        for (int i=1;i<=10;i++){
            System.out.println("Value of i is :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
    Thread t1=new Thread(thread1);
    t1.setName("John");
    t1.start();

    Runnable t2=()->{
        try {
            for(int i=1;i<=10;i++){
                System.out.println(i*2);
                Thread.sleep(2000);
            }
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    };
        Thread tnew=new Thread(t2);
        tnew.start();

    }
}
