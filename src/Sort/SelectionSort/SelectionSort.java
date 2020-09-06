import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: —°‘Ò≈≈–Ú
 * @date 2020-08-31 21:53
 */
public class SelectionSort {
    /**
     * —°‘Ò≈≈–Ú
     */
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {3,8,4,2,9,6,8,10};
        SelectionSort.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
