import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tushengtao
 * @Description: Synchronized 关键字修饰一个普通方法
 * @date 2020-08-21 21:45
 */
public class SynchronizedDemo2 implements Runnable{
    /**
     * 全局变量
     * 创建一个计数器
     */
    private static int counter = 1;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public synchronized void run() {
        String startTime =sdf.format(new Date());
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("线程 ：" + Thread.currentThread().getName() + " 当前计数器 ：" + (counter++));
                    System.out.println("开始时间 ：" + startTime + " 当前时间 ：" + sdf.format(new Date()));
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public static void main(String[] args) {
        // 同一个对象
//        SynchronizedDemo1 syncThread = new SynchronizedDemo1();
//        Thread thread1 = new Thread(syncThread, "sync-thread-1");
//        Thread thread2 = new Thread(syncThread, "sync-thread-2");
//        thread1.start();
//        thread2.start();

        // 不同对象
        SynchronizedDemo2 syncThread1 = new SynchronizedDemo2();
        SynchronizedDemo2 syncThread2 = new SynchronizedDemo2();
        Thread thread1 = new Thread(syncThread1, "sync-thread-1");
        Thread thread2 = new Thread(syncThread2, "sync-thread-2");
        thread1.start();
        thread2.start();
    }
}
