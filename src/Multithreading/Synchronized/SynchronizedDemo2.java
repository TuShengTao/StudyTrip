import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tushengtao
 * @Description: Synchronized �ؼ�������һ����ͨ����
 * @date 2020-08-21 21:45
 */
public class SynchronizedDemo2 implements Runnable{
    /**
     * ȫ�ֱ���
     * ����һ��������
     */
    private static int counter = 1;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    @Override
    public synchronized void run() {
        String startTime =sdf.format(new Date());
            for (int i = 0; i < 10; i++) {
                try {
                    System.out.println("�߳� ��" + Thread.currentThread().getName() + " ��ǰ������ ��" + (counter++));
                    System.out.println("��ʼʱ�� ��" + startTime + " ��ǰʱ�� ��" + sdf.format(new Date()));
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    public static void main(String[] args) {
        // ͬһ������
//        SynchronizedDemo1 syncThread = new SynchronizedDemo1();
//        Thread thread1 = new Thread(syncThread, "sync-thread-1");
//        Thread thread2 = new Thread(syncThread, "sync-thread-2");
//        thread1.start();
//        thread2.start();

        // ��ͬ����
        SynchronizedDemo2 syncThread1 = new SynchronizedDemo2();
        SynchronizedDemo2 syncThread2 = new SynchronizedDemo2();
        Thread thread1 = new Thread(syncThread1, "sync-thread-1");
        Thread thread2 = new Thread(syncThread2, "sync-thread-2");
        thread1.start();
        thread2.start();
    }
}
