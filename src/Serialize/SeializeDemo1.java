import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.Scanner;

/**
 * @author: tushengtao
 * @Description: 序列化、反序列化
 * @date 2020-08-26 15:58
 */
public class SeializeDemo1 {
    /**
     * 序列化
     */
    public static void Serialization(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("输入姓名：");
            String name = scanner.nextLine();
            System.out.println("输入邮箱：");
            String email = scanner.nextLine();
            System.out.println("输入年龄：");
            String age = scanner.nextLine();
            System.out.println("输入Id：");
            String id = scanner.nextLine();
            User.setId(Integer.valueOf(id));
            User user = new User(name,Integer.valueOf(age),email);
            // 新建文件对象 生成的object.json在StudyTrip的src目录下
            File file = new File("object.json");
            // 构造一个对象输出流
            ObjectOutputStream oos = null;
            // 构造文件输出流
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            // 序列化一个对象到文件（二进制）
            oos.writeObject(user);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 反序列化
     */
    public static void Deserialization(){
        try {
            File file = new File("object.json");
            ObjectInputStream ois = null;
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            //反序列化已经完成，在这里重新设置id值为999 最后反序列化输出的id是999,而不是你输入的id值
            // 这说明了 static变量无法被序列化
            User.setId(999);
            System.out.println(user);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 测试序列化
        System.out.println("----------测试序列化----------");
        SeializeDemo1.Serialization();

        System.out.println("-------------------------------------------------");

        // 测试反序列化
        System.out.println("----------测试反序列化----------");
        SeializeDemo1.Deserialization();
        System.out.println("注意！无论你输入的Id是多少！序列化之后，反序列化输出的都是999，因为id是static变量，无法被序列化！");
        System.out.println("由于email是被transient修饰，所以email也无法被序列化！反序列化输出时email=null");
    }
}
