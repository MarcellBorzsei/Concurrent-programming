public class Second {
    public static void main(String[] args) {
        String[] texts = {"elso", "masodik", "harmadik", "negyedik"};
        Thread[] threads = new Thread[texts.length];

        for(int i = 0; i < texts.length; i++)
        {
            final int index = i;
            threads[i] = new Thread(() -> {
                System.out.println(texts[index]);
                System.out.println(index);
            });
            threads[i].start();
        }
    }
}


