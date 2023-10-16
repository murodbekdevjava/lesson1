package task2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Task2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 20; i++) {
            int j=i;
            Runnable runnable = () -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.getMessage();
                }
                Thread thread = Thread.currentThread();
                System.out.println("i="+j+"::"+thread);
            };
            service.execute(runnable);
        }
    service.execute(()-> System.out.println("Vazifa tugadi"));
    service.shutdown();
    }
}
