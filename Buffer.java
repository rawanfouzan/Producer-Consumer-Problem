 import java.util.LinkedList;
 import java.util.Queue;
 import java.util.concurrent.Semaphore;
 public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private int capacity;
    private Semaphore full;
    private Semaphore empty;
    private Semaphore mutex;
    public Buffer(int size) {
        capacity = size;
        full = new Semaphore(0);
        empty = new Semaphore(size);
        mutex = new Semaphore(1);
    }
    public void produce(int item) throws InterruptedException {
        empty.acquire();
        mutex.acquire();
        queue.add(item);
        System.out.println("New Job Created: #" + item);
        mutex.release();
        full.release();
    }
    public int consume() throws InterruptedException {
        full.acquire();
        mutex.acquire();
        int item = queue.poll();
        System.out.println("Printer is printing job #" + item);
        mutex.release();
        empty.release();
        return item;
    }
 }