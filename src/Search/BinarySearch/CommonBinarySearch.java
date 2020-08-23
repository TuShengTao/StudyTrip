package BinarySearch;

/**
 * @author: tushengtao
 * @Description: 普通二分查找
 * @date 2020-08-24 1:16
 */
public class CommonBinarySearch {
    public int binarySearch(int[] array,int element){
        // 元素在数组中的位置 默认不存在
        int index = -1;
        int startIndex = 0;
        int endIndex = array.length-1;
        for (int midIndex = (startIndex + endIndex)/2; startIndex <= endIndex ; midIndex = (startIndex + endIndex)/2 ) {
            if (element == array[midIndex]){
                index = midIndex;
                break;
            }else if (element < array[midIndex]){
                endIndex = midIndex -1;
            }else {
                startIndex = midIndex + 1;
            }
        }
        return index;
    }
    /**
     * 测试-11 55、70 100
     * @param args
     */
    public static void main(String[] args) {
        CommonBinarySearch cbs = new CommonBinarySearch();
        int[] array ={0,10,20,30,40,50,60,70,80,90};
//        int elementIndex = bs.binarySearch(array,55);
        int elementIndex = cbs.binarySearch(array,70);
        switch (elementIndex){
            case -1 :
                System.out.println("元素不存在！");
                break;
            default:
                System.out.println("元素在数组中的索引是: " + elementIndex);
        }
    }
}
