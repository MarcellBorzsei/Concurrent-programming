import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fourth {
    public static void main(String[] args) {
        String[] texts = {"nulladik", "elso", "masodik", "harmadik", "negyedik"};
        Thread[] threads = new Thread[texts.length];

        try
        {
            PrintWriter writer = new PrintWriter("output.txt");
            for (int i = 0; i < texts.length; i++) {
                final int index = i;
                threads[i] = new Thread(() -> {
                    writer.print(texts[index]);
                    writer.println(index);
                });
                threads[i].start();
            }

            for(Thread thread : threads)
            {
                try
                {
                    thread.join();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

            }

            writer.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Hiba a fájl megnyitásakor: " + e.getMessage());
        }
    }
}