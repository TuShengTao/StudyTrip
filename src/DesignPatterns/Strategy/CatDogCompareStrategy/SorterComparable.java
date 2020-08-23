import java.util.Arrays;

/**
 * @author: Tu ShengTao
 * @Description: 使用Comparable接口进行排序,不使用策略模式
 * @date 2020-08-18 16:59
 */
public class SorterComparable {
    /**
     * 排序
     */
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // 如果当前排序元素arr[min]大于它后面的元素arr[j]就进行交换
                if (arr[min].compareTo(arr[j]) == 1){
                    // 交换
                    Comparable tmp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = tmp;
                }
            }
        }
    }

    /**
     * 排序主方法测试
     *
     * @param
     */
    public static void main(String[] args) {
        Cat[] arrayCat = {new Cat(3,3),new Cat(5,5),new Cat(2,2)};
        Dog[] arrayDog = {new Dog(5),new Dog(8),new Dog(2)};
        SorterComparable.sort(arrayCat);
        SorterComparable.sort(arrayDog);
        System.out.println("猫排序："+Arrays.toString(arrayCat));
        System.out.println("狗排序："+Arrays.toString(arrayDog));

    }
}
