package Array;

import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 自己封装一个数组，还有许多不完善的地方
 * @date 2020-08-23 14:41
 */
public class Array {
    private int [] array;
    /**
     * 无参的构造函数 默认大小是10
     */
    public Array(){
        array = new int[0];
    }

    /**
     * 有参的构造函数
     * @param length 长度
     */
    public Array(int length){
        array = new int[length];
    }

    /**
     * 添加一个元素 实现动态扩容
     * @param element 元素
     */
    public void add(int element){
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        array = newArray;
    }

    /**
     * 根据索引下标删除一个元素
     * @param index 指数
     */
    public void delete(int index){
        if (index < 0 || index > array.length ){
            throw new RuntimeException("下标越界！");
        }else{
            int[] newArray = new int[array.length-1];
            int newIndex = 0;
            int oldIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (i == index ){
                    oldIndex++;
                    continue;
                }else {
                    newArray[newIndex] = array[oldIndex];
                    newIndex++;
                    oldIndex++;
                }
            }
            array = newArray;
        }
    }

    /**
     * 普通循环查找
     *
     * @return int
     */
    public int search(int element){
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * 二分查找
     *
     * @return int
     */
    public int binarySearch(int element ){
        // 先排序再查找
        sort(array,0,array.length-1);
        int index  = -1;
        int startIndex = 0;
        int endIndex = array.length - 1;
        int midIndex = (startIndex + endIndex) / 2;
        for (int i = 0; i < array.length ; i++) {
            if (array[midIndex] == element){
                index = midIndex;
                break;
            }else if (element < array[midIndex]){
                endIndex = midIndex;
            }else {
                startIndex = midIndex;
            }
            midIndex = (startIndex + endIndex) / 2;
        }
        return index;
    }
    /**
     * 修改index下标的元素
     * @param element 元素
     */
    public void update(int index,int element){
        if (index < 0 || index > array.length-1){
            throw new RuntimeException("下标越界");
        }else {
            // 实现修改
            array[index] = element;
        }
    }

    /**
     * 归并排序
     * @param
     * @return {@link int[]}
     */
    public void mergeSort(int low,int high){
         sort(array,low,high);
    }
    public static void merge(int[] array,int low,int mid,int high){
        int[] tmpArr = new int[high - low + 1];
        // 左指针
        int left = low;
        // 右指针
        int right = mid + 1;
        int k = 0;
        // 做比较 把较小的放进tmpArr
        while (left <= mid && right <= high){
            if (array[left] < array[right]){
                 tmpArr[k] = array[left];
                 left++;
                 k++;
            }else {
                tmpArr[k] = array[right];
                k++;
                right++;
            }
        }
        // 把左边剩的数放进去
        while (left <= mid){
            tmpArr[k] = array[left];
            left++;
            k++;
        }
        // 把右边剩下的数放进去
        while (right <= high){
            tmpArr[k] = array[right];
            right++;
            k++;
        }
        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < tmpArr.length; k2++) {
            array[k2 + low] = tmpArr[k2];
        }
    }
    public static void sort(int[] array,int low,int high){
        int mid = (low + high) / 2;
        if(low < high){
            // 左边
            sort(array,low,mid);
            // 右边
            sort(array,mid+1,high);
            // 合并
            merge(array,low,mid,high);

        }

    }

    /**
     * 获取长度
     *
     * @return int
     */
    public int getLength(){
        return array.length;
    }

    /**
     * 打印一整个数组
     *
     * @return {@link String}
     */
    public String printArray(){
        return Arrays.toString(array);
    }

    /**
     * 打印一个元素
     *
     * @param index
     * @return int
     */
    public int print(int index){
        return array[index];
    }

    /**
     * 主方法测试归并排序
     *
     * @param args arg游戏
     */
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,100,8,7,6};
        Array.sort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
