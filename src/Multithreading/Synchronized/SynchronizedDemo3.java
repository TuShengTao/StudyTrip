import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tushengtao
 * @Description: synchronized修饰静态方法，静态方法属于类
 * 锁是当前类的class对象 ，进入同步代码前要获得当前类对象的锁
 * @date 2020-08-21 23:24
 */
public class SynchronizedDemo3 implements Runnable{

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static int counter = 1;

    /**
     * 静态的同步方法
     * 提示：static关键字和synchronized关键字放前放后无所谓，因为是同级别
     */
    public synchronized static void method() {
        String startTime =sdf.format(new Date());
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("线程 ：" + Thread.currentThread().getName() + " 当前计数器 ：" + (counter++));
                System.out.println("开始时间 ：" + startTime + " 当前时间 ：" + sdf.format(new Date()));
                System.out.println();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {
        method();
    }

    public static void main(String[] args) {
        SynchronizedDemo3 syncThread1 = new SynchronizedDemo3();
        SynchronizedDemo3 syncThread2 = new SynchronizedDemo3();
        Thread thread1 = new Thread(syncThread1, "sync-thread-1");
        Thread thread2 = new Thread(syncThread1, "sync-thread-2");
        thread1.start();
        thread2.start();
    }
}
