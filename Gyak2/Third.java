public class Third {
    public static void main(String[] args) throws InterruptedException
    {
        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 25; i++)
            {
                System.out.println("szia" + i);
            }
        });

        Thread t2 = new Thread(() -> {
           for(int i = 0; i < 25; i++)
           {
               System.out.println("világ" + i);
           }
        });

        Thread t3 = new Thread(() -> {
           for(int i = 0; i < 25; i++)
           {
               System.out.println("másik" + i);
           }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t3.start();
    }
}
