import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: tushengtao
 * @Description: synchronized���ξ�̬��������̬����������
 * ���ǵ�ǰ���class���� ������ͬ������ǰҪ��õ�ǰ��������
 * @date 2020-08-21 23:24
 */
public class SynchronizedDemo3 implements Runnable{

    static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static int counter = 1;

    /**
     * ��̬��ͬ������
     * ��ʾ��static�ؼ��ֺ�synchronized�ؼ��ַ�ǰ�ź�����ν����Ϊ��ͬ����
     */
    public synchronized static void method() {
        String startTime =sdf.format(new Date());
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("�߳� ��" + Thread.currentThread().getName() + " ��ǰ������ ��" + (counter++));
                System.out.println("��ʼʱ�� ��" + startTime + " ��ǰʱ�� ��" + sdf.format(new Date()));
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
