package Array;

/**
 * @author: tushengtao
 * @Description: �����Լ��Զ����Array
 * @date 2020-08-27 16:55
 */
public class TestArray {
    public static void main(String[] args) {
        Array array = new Array();
        array.add("�Զ�������");
        for (int i = 0; i < 3; i++) {
            array.add(i);
        }

        System.out.println(array.getLength());
        System.out.println(array.getSize());
        System.out.println(array.printArray());
        for (int i = 50; i < 59; i++) {
            array.add(i);
        }
        System.out.println(array.getSize());
        System.out.println(array.printArray());
        for (int i = 0; i < 8 ; i++) {
            array.delete(i);
        }
//        array.delete(0);
        System.out.println(array.printArray());

    }
}
