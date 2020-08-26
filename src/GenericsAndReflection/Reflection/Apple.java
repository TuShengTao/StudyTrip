import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-08-26 15:14
 */
public class Apple {
    private int price;

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public static void main(String[] args) {
        // 正常调用
        System.out.println("-------------正常调用---------------");
        Apple apple = new Apple();
        apple.setPrice(6);
        System.out.println("苹果的价格是： "+apple.getPrice());

        System.out.println("-------------------------------------------");

        // 使用反射调用
        try {
            System.out.println("-------------反射调用---------------");
            System.out.println("请输入你想要设置的苹果价格：");
            Scanner scanner = new Scanner(System.in);
            String priceStr = scanner.next();

            // Apple指的是 Reflection/Apple.java
            Class clazz = Class.forName("Apple");
            Method setPriceMethod = clazz.getMethod("setPrice", int.class);
            Constructor constructor = clazz.getConstructor();
            // 使用反射的构造方法构造一个实例 o
            Object appleObject = constructor.newInstance();
            // 调用setPrice方法 并传参 9
            setPriceMethod.invoke(appleObject,Integer.valueOf(priceStr));
            // 调用getPrice
            Method getPriceMethod = clazz.getMethod("getPrice");
            int  applePrice = (int)getPriceMethod.invoke(appleObject);
            System.out.println("苹果的价格是： "+applePrice );
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}