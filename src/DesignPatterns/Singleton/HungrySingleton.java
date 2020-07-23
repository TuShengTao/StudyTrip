/*
 * @Author: 屠圣涛 
 * @Date: 2020-07-23 02:39:27
 * @LastEditTime: 2020-07-23 04:35:37
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /studySpace/StudyTrip/src/DesignPatterns/Singleton/HungrySingleton.java
 */ 
/**
 * Created on 2020/6/3
 *
 * @author Tu ShengTao
 * Description: 单例模式之饿汉形式
 * 饿汉形式：在该类被加载进jvm的时候就创建该实例,只会被加载一次
 *
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
