/**
 * Created on 2020/6/3
 *
 * @author Tu ShengTao
 * Description: 单例模式之饿汉形式
 * 饿汉形式：在该类被加载进jvm的时候就创建该实例,只会被加载一次
 */
public class HungrySingleton {
    private static final HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){};
    public HungrySingleton getInstance(){
        return singleton;
    }
    public static void main(String[] args) {
        HungrySingleton hungrySingleton = new HungrySingleton();
        System.out.println(hungrySingleton.hashCode());
    }
}
