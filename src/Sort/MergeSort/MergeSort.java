import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 归并排序递归实现
 * @date 2020-08-23 16:01
 */
public class MergeSort {
    public static void merge(int[] a,int low,int mid,int high){
        int[] temp = new int [high - low + 1];
        // 左指针
        int i = low;
        // 右指针
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                k++;
                i++;
            } else {
                temp[k] = a[j];
                k++;
                j++;
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
        System.out.println("临时数组" + Arrays.toString(temp));
    }
    public static void mergeSort(int[] a, int low, int high) {
        //划分子序列
        int mid = (low + high) / 2;
        //当子序列中只有一个元素时结束递归 即low == high的时候
        if (low < high)  {
            // 左侧
            mergeSort(a, low, mid);
            System.out.println("左侧：" + Arrays.toString(a));
            // 右侧
            mergeSort(a, mid + 1, high);
            System.out.println("右侧：" + Arrays.toString(a));
            // 左右归并
            merge(a, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int a[] = {3,4,1,2,100,8,7,6};
        mergeSort(a, 0, a.length - 1);
        System.out.println("排序结果：" + Arrays.toString(a));
    }
}
