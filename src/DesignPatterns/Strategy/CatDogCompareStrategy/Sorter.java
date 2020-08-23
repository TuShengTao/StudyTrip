import java.util.Arrays;
/**
 * @author: Tu ShengTao
 * @Description: 选择排序：双重循环，默认当前排序的元素arr[min]为最小值,和它后面的元素进行比较
 * 如果后面的元素arr[j]小于arr[min],那么这两个元素进行交换
 * @date 2020-08-18 16:04
 */
public class Sorter {

    /**
     * 排序
     *
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // 如果当前排序元素arr[min]大于它后面的元素arr[j]就进行交换
                if (arr[j] < arr[min]){
                    // 交换
                    int tmp = arr[j];
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
        int[] array = {1,5,9,3,88,66,100};
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
