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
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 实例化
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 主方法测试
     */
    public static void main(String[] args) {
        // 可能会输出多个不同的哈希码，说明生成了多个实例
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(LazySingleton.getInstance().hashCode());
            }).start();
        }
    }
}
