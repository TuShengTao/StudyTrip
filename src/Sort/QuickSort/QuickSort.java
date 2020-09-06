import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 快速排序递归排序
 * @date 2020-09-06 2:52
 */

public class QuickSort {

    public static void quickSort(int[] array,int startIndex,int endIndex){
        if (startIndex < endIndex){
            // 返回基准元素的索引
            int patition = partition(array,startIndex,endIndex);
            // 左右两边分别开始递归
            // 左边开始
            quickSort(array,startIndex,patition-1);
            // 右边开始
            quickSort(array,patition+1,endIndex);
        }
    }

    public static int partition(int[] array,int startIndex,int endIndex){
        // 基准元素 2
        int pivot = array[startIndex];
        // 左指针
        int left = startIndex;
        // 右指针
        int right = endIndex;
        // {2,4,6,1,3,7,9,8,5}
        // 左右指针分别开始移动
        while (left != right){
            // 右边 找到比基准元素 小的
            while (left < right && array[right] > pivot){
                right--;
            }

            // 左边 找到比基准元素 大的
            while (left < right && array[left] <= pivot){
                left++;
            }

            // 找到后进行交换
            if (left < right){
                swap(array,left,right);
            }
        }
        // 基准元素交换
        swap(array,startIndex,left);
        // 如果 left == right 了 就执行下面语句 再次进行交换
        return left;
    }
    // 交换
    public static void swap(int[] array,int left,int right){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public static void main(String[] args) {
        int[] array = {0,4,6,1,2,7,10,8,3,5,1,9};
        QuickSort.quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
