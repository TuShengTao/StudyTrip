/**
 * @author: tushengtao
 * @Description: 双检锁/双重校验锁  这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * @date 2020-08-21 16:32
 */
public class DoubleCheckSingleton {
    /**
     * volatile关键字推荐阅读：https://www.cnblogs.com/zhengbin/p/5654805.html
     * 这里简单说明：在多线程情况下，volatile关键字修饰的静态变量被其中一个线程修改时
     * 其他线程对此变量的修改是可见的，即其他线程知道了此变量被修改了，下次读取这个变量的值是已经修改过的值
     * 注意; 下面的变量singleton是被static修饰，所以它属于类，并不单单属于某一个对象的，是被此类所有对象共享
     */
    private volatile static DoubleCheckSingleton singleton;
    private DoubleCheckSingleton (){}
    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
    /**
     * 主方法测试
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            // 新建线程
            new Thread(()->{
                System.out.println(DoubleCheckSingleton.getInstance().hashCode());
            }).start();
        }
    }
}

