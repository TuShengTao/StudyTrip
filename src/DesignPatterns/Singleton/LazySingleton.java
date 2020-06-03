/**
 * Created on 2020/6/3
 *
 * @author Tu ShengTao
 * Description: 单例模式之懒汉形式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton ;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            try {
                // 睡眠1毫秒 try catch 代码块可删;只是为了多线程测试
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 实例化
            lazySingleton = new LazySingleton();
        }
        // 返回
        return lazySingleton;
    }
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazySingleton.getInstance().hashCode());
            }).start();
        }
    }
}
