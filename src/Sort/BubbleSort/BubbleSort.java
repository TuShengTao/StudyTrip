import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 冒泡排序
 * @date 2020-08-31 22:01
 */
public class BubbleSort {
    /**
     * 冒泡排序，两两比较
     * 注意防止数组越界 j的限制条件 因为有 j+1
     */
    public static void sort(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,7,4,3,1,6,7,9,8,11,14,3,0};
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
