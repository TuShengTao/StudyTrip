import java.util.Arrays;
/**
 * @author: tushengtao
 * @Description: 使用Comparator(策略模式)
 * @date 2020-08-18 16:59
 */
public class SorterComparator<T> {
    /**
     * 排序
     *
     */
    public  void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // 如果当前排序元素arr[min]大于它后面的元素arr[j]就进行交换
                if (comparator.compare(arr[min],arr[j]) == 1){
                    // 交换
                    T tmp = arr[j];
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
        SorterComparator sorterComparator = new SorterComparator();
        sorterComparator.sort(arrayCat,new CatHeightComparator());
        sorterComparator.sort(arrayDog,new DogComparator());
        System.out.println("猫使用策略模式排序："+Arrays.toString(arrayCat));
        System.out.println("狗使用策略模式排序："+Arrays.toString(arrayDog));

    }
}
