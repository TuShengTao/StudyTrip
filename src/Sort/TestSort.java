import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 各类排序代码手写测试类
 * @date 2020-08-31 1:17
 */
// 归并排序开始
/**
// 归并排序

public class TestSort {
    public static void sort(int[] array,int low,int high){
        int mid = (low + high) / 2;
        if (low < high){
           // 左
            sort(array,low,mid);
           // 右
            sort(array,mid+1,high);
            // 治（合并）
            merge(array,low,mid,high);
        }

    }
    public static  void merge(int[] array,int low,int mid,int high){
        int[] tempArray = new int[(high - low) + 1];
        // 左指针
        int left = low;
      // 右指针
        int right = mid + 1;
        int k = 0;
        // 把较小的放入临时数组tempArray,通过这一步，左边和右边总有一边是全部都放入了临时数组
        while (left <= mid && right <= high){
            if (array[left] < array[right]){
                tempArray[k++] = array[left++];
            }else {
                tempArray[k++] = array[right++];
            }
        }
        // 通过上一步，有可能左边是有剩余的数，也有可能是右边，不管左边还是右边，统一都来个while循环
        // 把左边剩余的通过while全部放入临时数组
        while (left <= mid){
            tempArray[k++] = array[left++];
        }
        // 把右边剩余的通过while全部放入临时数组
        while (right <= high){
            tempArray[k++] = array[right++];
        }
        // 排好序的数组一个一个移入原数组
        for (int i = 0; i < tempArray.length ; i++) {
            array[low++] = tempArray[i];
        }
    }
    public static void main(String[] args) {
        // 测试归并排序
        int[] array ={2,1,4,3,6,3,7,8,9,100,99,88,98,1000,1,0};
        TestSort.sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

}
 **/
// 归并排序结束
public class TestSort{

}








