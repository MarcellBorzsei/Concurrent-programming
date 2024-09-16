public class First {
    public static void main(String[] args)
    {
        Thread t1 = new PostitiveThread();

        Thread t2 = new Thread(() -> {
        for(int i = 1; i < 100000; i++)
        {
            System.out.print(i + " ");
            System.out.print(-i + " ");
        }
        });
        t1.start();
        t2.start();
    }

}

class PostitiveThread extends Thread
{
    @Override
    public void run()
    {
        for(int i = 1; i < 100000; i++)
        {
            System.out.println(i + " ");
        }
    }
}

