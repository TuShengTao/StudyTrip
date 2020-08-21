/**
 * @author: tushengtao
 * @Description: 测试类
 * @date 2020-08-20 22:53
 */
public class BoxDemo {
    public static void main(String[] args) {
        // 创建奶箱对象，这是共享数据区
        Box b = new Box();
        // 创建生产者对象，把奶箱对象作为构造方法的参数，因为在这个类中要存储牛奶的操作
        Producer p = new Producer(b);
        // 创建消费者对象
        Customer c = new Customer(b);

        // 创建两个线程
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        // 启动线程
        t1.start();
        t2.start();
    }
}
