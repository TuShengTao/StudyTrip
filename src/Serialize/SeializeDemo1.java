import javax.jws.soap.SOAPBinding;
import java.io.*;
import java.util.Scanner;

/**
 * @author: tushengtao
 * @Description: ���л��������л�
 * @date 2020-08-26 15:58
 */
public class SeializeDemo1 {
    /**
     * ���л�
     */
    public static void Serialization(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("����������");
            String name = scanner.nextLine();
            System.out.println("�������䣺");
            String email = scanner.nextLine();
            System.out.println("�������䣺");
            String age = scanner.nextLine();
            System.out.println("����Id��");
            String id = scanner.nextLine();
            User.setId(Integer.valueOf(id));
            User user = new User(name,Integer.valueOf(age),email);
            // �½��ļ����� ���ɵ�object.json��StudyTrip��srcĿ¼��
            File file = new File("object.json");
            // ����һ�����������
            ObjectOutputStream oos = null;
            // �����ļ������
            FileOutputStream fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            // ���л�һ�������ļ��������ƣ�
            oos.writeObject(user);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * �����л�
     */
    public static void Deserialization(){
        try {
            File file = new File("object.json");
            ObjectInputStream ois = null;
            FileInputStream fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            User user = (User) ois.readObject();
            //�����л��Ѿ���ɣ���������������idֵΪ999 ������л������id��999,�������������idֵ
            // ��˵���� static�����޷������л�
            User.setId(999);
            System.out.println(user);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // �������л�
        System.out.println("----------�������л�----------");
        SeializeDemo1.Serialization();

        System.out.println("-------------------------------------------------");

        // ���Է����л�
        System.out.println("----------���Է����л�----------");
        SeializeDemo1.Deserialization();
        System.out.println("ע�⣡�����������Id�Ƕ��٣����л�֮�󣬷����л�����Ķ���999����Ϊid��static�������޷������л���");
        System.out.println("����email�Ǳ�transient���Σ�����emailҲ�޷������л��������л����ʱemail=null");
    }
}
