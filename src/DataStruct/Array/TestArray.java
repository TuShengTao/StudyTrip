package Array;

/**
 * @author: tushengtao
 * @Description: 测试自己自定义的Array
 * @date 2020-08-27 16:55
 */
public class TestArray {

    public static void main(String[] args) {
        Array array = new Array();
        System.out.println("打印数组：\n"+array.printArray());
        System.out.println("添加0-9到数组");
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }
        System.out.println("数组长度： "+array.getLength());
        System.out.println("打印数组：\n"+array.printArray());
        System.out.println("-----------------------------------------------------------");

        System.out.println("删除一个下标为9的元素：");
        array.delete(9);
        System.out.println("数组长度： "+array.getLength());
        System.out.println("打印数组：\n"+array.printArray());

        System.out.println("-----------------------------------------------------------");

        System.out.println("普通查找："+"查找8这个元素的索引:(-1表示元素不存在)"+"索引是：" + array.search(8));

        System.out.println("-----------------------------------------------------------");
        System.out.println("修改索引为7的元素，修改为99999");
        array.update(7,99999);
        System.out.println("数组长度： "+array.getLength());
        System.out.println("打印数组：\n"+array.printArray());

        System.out.println("-----------------------------------------------------------");
        System.out.println("二分查找,先排序再查找："+"查找8这个元素的索引:(-1表示元素不存在)"+"索引是：" + array.binarySearch(8));
        System.out.println("数组长度： "+array.getLength());
        System.out.println("打印数组：\n"+array.printArray());

    }

}
