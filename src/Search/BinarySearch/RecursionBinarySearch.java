package BinarySearch;
/**
 * @author: tushengtao
 * @Description: 递归二分查找 二分查找前提是数组有序
 * @date 2020-08-24 1:16
 */
public class RecursionBinarySearch{
    public int binarySearch(int[] array,int element,int startIndex,int endIndex){
        // 算出中间元素的索引
        int midIndex = (startIndex + endIndex) / 2;
        // 首先判断寻找的元素element是否小于数组元素的最小值  是否大于数组元素的最大值
        // 如果其中一个为true 就查找失败返回 -1
        // 还要判断 startIndex < endIndex
        if (element < array[0] || element > array[array.length-1] || startIndex > endIndex){
            return -1;
        }else if (element < array[midIndex]){
            return binarySearch(array,element,startIndex,midIndex - 1);
        }else if (element > array[midIndex]){
            return binarySearch(array,element,midIndex + 1,endIndex);
        }else {
            return midIndex;
        }
    }

    /**
     * 测试 55、70两个数字
     * @param args
     */
    public static void main(String[] args) {
        RecursionBinarySearch rbs = new RecursionBinarySearch();
        int[] array ={0,10,20,30,40,50,60,70,80,90};
//        int elementIndex = bs.binarySearch(array,55,0,array.length - 1);
        int elementIndex = rbs.binarySearch(array,70,0,array.length - 1);
        switch (elementIndex){
            case -1 :
                System.out.println("元素不存在！");
                break;
            default:
                    System.out.println("元素在数组中的索引是: " + elementIndex);
        }
    }
}