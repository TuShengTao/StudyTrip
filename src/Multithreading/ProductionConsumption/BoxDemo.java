/**
 * @author: tushengtao
 * @Description: ������
 * @date 2020-08-20 22:53
 */
public class BoxDemo {
    public static void main(String[] args) {
        // ��������������ǹ���������
        Box b = new Box();
        // ���������߶��󣬰����������Ϊ���췽���Ĳ�������Ϊ���������Ҫ�洢ţ�̵Ĳ���
        Producer p = new Producer(b);
        // ���������߶���
        Customer c = new Customer(b);

        // ���������߳�
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        // �����߳�
        t1.start();
        t2.start();
    }
}
