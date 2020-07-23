/**
 * Created on 2020/6/4
 *
 * @author Tu ShengTao
 * Description: 单例模式之懒汉形式 优化 ：无论开多少个线程只有一个实例
 */
public class LazySingleton2 {
    private static LazySingleton2 lazySingleton2 = null ;
    private LazySingleton2(){}
    public static synchronized LazySingleton2 getInstance(){
        if (lazySingleton2 == null){
            try {
                // 睡眠1毫秒 try catch 代码块可删;只是为了多线程测试
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 实例化 反射
            lazySingleton2 = new LazySingleton2();
        }
        // 返回 invoke
        return lazySingleton2;
    }
    // 可删
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazySingleton2.getInstance().hashCode());
            }).start();
        }
    }
}
