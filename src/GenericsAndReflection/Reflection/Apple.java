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
        // ��������
        System.out.println("-------------��������---------------");
        Apple apple = new Apple();
        apple.setPrice(6);
        System.out.println("ƻ���ļ۸��ǣ� "+apple.getPrice());

        System.out.println("-------------------------------------------");

        // ʹ�÷������
        try {
            System.out.println("-------------�������---------------");
            System.out.println("����������Ҫ���õ�ƻ���۸�");
            Scanner scanner = new Scanner(System.in);
            String priceStr = scanner.next();

            // Appleָ���� Reflection/Apple.java
            Class clazz = Class.forName("Apple");
            Method setPriceMethod = clazz.getMethod("setPrice", int.class);
            Constructor constructor = clazz.getConstructor();
            // ʹ�÷���Ĺ��췽������һ��ʵ�� o
            Object appleObject = constructor.newInstance();
            // ����setPrice���� ������ 9
            setPriceMethod.invoke(appleObject,Integer.valueOf(priceStr));
            // ����getPrice
            Method getPriceMethod = clazz.getMethod("getPrice");
            int  applePrice = (int)getPriceMethod.invoke(appleObject);
            System.out.println("ƻ���ļ۸��ǣ� "+applePrice );
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}