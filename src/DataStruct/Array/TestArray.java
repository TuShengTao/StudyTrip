package Array;

/**
 * @author: tushengtao
 * @Description: 测试自己自定义的Array
 * @date 2020-08-27 16:55
 */
public class TestArray {
    public static void main(String[] args) {
        Array array = new Array();
        Integer a = Array.test;
        Integer b = array.test;
        array.add("泛型数组");
        for (int i = 0; i < 3; i++) {
            array.add(i);
        }
        System.out.println("数组长度： "+array.getLength());
        System.out.println("数组元素个数： "+array.getSize());
        System.out.println("打印数组：\n"+array.printArray()+"\n"+"添加0、1、2到数组");
        for (int i = 50; i < 59; i++) {
            array.add(i);
        }
        System.out.println(array.printArray());
        System.out.println("数组长度： "+array.getLength());
        System.out.println("数组元素个数： "+array.getSize());
        System.out.println("删除一个下标为3的元素：");
        array.delete(3);
        System.out.println("打印数组：\n"+array.printArray());
        array.update(11,"6666");
        System.out.println("打印数组：\n"+array.printArray());

    }
}
