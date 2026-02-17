 public class Producer implements Runnable {
    private Buffer buffer;
    private static int jobID = 0;
    public Producer(Buffer b) {
        buffer = b;
    }
    private static synchronized int getNextJobID() {
        return ++jobID;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int job = getNextJobID();
                buffer.produce(job);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
 }