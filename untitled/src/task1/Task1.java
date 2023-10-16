package task1;
public class Task1 {
    public static void main(String[] args) {
        Runnable runnable = ()->{

            Thread.currentThread().setName("Task1");
            String name = Thread.currentThread().getName();
            System.out.println(name);};
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
