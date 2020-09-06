import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 插入排序
 * @date 2020-09-01 18:03
 */
public class InsertionSort {
    /**
     * 插入排序
     */

    public static  void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            // 待排序元素：array[j],待排序元素与前面已排序的元素比较，首先与array[j-1]比较
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,9,8,7,3,4,5,};
        InsertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
