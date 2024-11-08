package exercise8_abc;

public class Producer implements Runnable {
    private final AbcBuffer buffer;

    public Producer(AbcBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            try {
                buffer.put(letra);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

