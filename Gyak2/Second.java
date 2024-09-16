public class Second {
    public static void main(String[] args) {
        String[] texts = {"nulladik","elso", "masodik", "harmadik", "negyedik"};
        Thread[] threads = new Thread[texts.length];

        for(int i = 0; i < texts.length; i++)
        {
            final int index = i;
            threads[i] = new Thread(() -> {
                fakePrintln(texts[index]);
                System.out.println(index);
            });
            threads[i].start();
        }
    }

    public static void fakePrintln(String word)
    {
        for(int i = 0; i < word.length(); i++)
        {
            System.out.print(word.charAt(i));
        }
        System.out.println();
    }
}


