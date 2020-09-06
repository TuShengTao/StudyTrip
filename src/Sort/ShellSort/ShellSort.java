import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-09-05 22:22
 */
public class ShellSort {
    static int count = 0;
    /**
     * 希尔排序
     *
     * @param array 数组
     */
    public static void sort(int[] array){
        // 间隔
        int gap = array.length / 2;
        while (gap > 0 ){
            for (int i = gap; i < array.length ; i++)  {
                for (int j = i; j >= gap ; j-=gap) {
                    if (array[j] <= array[j-gap]){
                        swap(array,j,j-gap);
                        ShellSort.count++;
                    }else {
                        break;
                    }
                }
            }
            gap = gap / 2;
        }
    }

    /**
     * 交换
     *
     * @param array 数组
     * @param small 小
     * @param big   大
     */
    public static void swap(int[] array,int small,int big){
        int temp =array[small];
        array[small] = array[big];
        array[big] = temp;
    }
    public static void main(String[] args) {
        int[] array = {9,7,4,3,1,6,7,9,8,11,14,3,0};
        ShellSort.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("count : "+ count);
    }
}
