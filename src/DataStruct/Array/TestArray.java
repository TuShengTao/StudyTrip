package Array;

/**
 * @author: tushengtao
 * @Description: �����Լ��Զ����Array
 * @date 2020-08-27 16:55
 */
public class TestArray {
    public static void main(String[] args) {
        Array array = new Array();
        Integer a = Array.test;
        Integer b = array.test;
        array.add("��������");
        for (int i = 0; i < 3; i++) {
            array.add(i);
        }
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("����Ԫ�ظ����� "+array.getSize());
        System.out.println("��ӡ���飺\n"+array.printArray()+"\n"+"���0��1��2������");
        for (int i = 50; i < 59; i++) {
            array.add(i);
        }
        System.out.println(array.printArray());
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("����Ԫ�ظ����� "+array.getSize());
        System.out.println("ɾ��һ���±�Ϊ3��Ԫ�أ�");
        array.delete(3);
        System.out.println("��ӡ���飺\n"+array.printArray());
        array.update(11,"6666");
        System.out.println("��ӡ���飺\n"+array.printArray());

    }
}
