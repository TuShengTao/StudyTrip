package Array;

/**
 * @author: tushengtao
 * @Description: �����Լ��Զ����Array
 * @date 2020-08-27 16:55
 */
public class TestArray {

    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("��ӡ���飺\n"+array.printArray());
        System.out.println("���0-9������");
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("��ӡ���飺\n"+array.printArray());
        System.out.println("-----------------------------------------------------------");

        System.out.println("ɾ��һ���±�Ϊ9��Ԫ�أ�");
        array.delete(9);
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("��ӡ���飺\n"+array.printArray());

        System.out.println("-----------------------------------------------------------");

        System.out.println("��ͨ���ң�"+"����8���Ԫ�ص�����:(-1��ʾԪ�ز�����)"+"�����ǣ�" + array.search(8));

        System.out.println("-----------------------------------------------------------");
        System.out.println("�޸�����Ϊ7��Ԫ�أ��޸�Ϊ99999");
        array.update(7,99999);
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("��ӡ���飺\n"+array.printArray());

        System.out.println("-----------------------------------------------------------");
        System.out.println("���ֲ���,�������ٲ��ң�"+"����8���Ԫ�ص�����:(-1��ʾԪ�ز�����)"+"�����ǣ�" + array.binarySearch(8));
        System.out.println("���鳤�ȣ� "+array.getLength());
        System.out.println("��ӡ���飺\n"+array.printArray());

    }

}
