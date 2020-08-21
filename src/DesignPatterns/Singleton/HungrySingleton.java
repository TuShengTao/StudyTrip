/**
 * Created on 2020/6/3
 *
 * @author Tu ShengTao
 * @Description: 单例模式之饿汉形式
 * 饿汉形式：在该类被加载进jvm的时候就创建该实例,只会被加载一次
 *
 */
public class HungrySingleton {

    private static final HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return singleton;
    }

    /**
     * 主方法测试
     */
    public static void main(String[] args){
        // 模拟在其他类进行调用
        // 由于HungrySingleton的构造方法私有，所以无法实例化（即无法new出一个对象）
        // 使用HungrySingleton的静态方法getInstance()获取唯一实例
        System.out.println(HungrySingleton.getInstance().hashCode());
    }
}
