package exercise8_abc;

public class Consumer  implements Runnable {
    private final AbcBuffer buffer;
    private final String name;

    public Consumer(AbcBuffer buffer, String name) {
        this.buffer = buffer;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.get(name);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

