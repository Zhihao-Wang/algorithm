import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description:
 * @Input:
 * @Output:
 **/
public class ProdCons {
    public static void main(String[] args) {
        BlockingQueue sharedQueue =new LinkedBlockingQueue();
        Thread prodThread = new Thread(new Producer(sharedQueue));
        Thread consThread=new Thread(new Consumer(sharedQueue));
        prodThread.start();
        consThread.start();
    }
}
class Producer implements  Runnable{
    private  final BlockingQueue sharedQueue;

    public Producer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        for(int i=0; i<100;i++){
            System.out.println("Produced:"+i);
            try {
                sharedQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements  Runnable{
    private final BlockingQueue sharedQueue;

    public Consumer(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    @Override
    public void run() {
        while(true){
            try {
                System.out.println("Consumed:"+sharedQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
