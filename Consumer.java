 public class Consumer implements Runnable {
    private Buffer buffer;
    public Consumer(Buffer b) {
        buffer = b;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                buffer.consume();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 }