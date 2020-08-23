package BinarySearch;
/**
 * @author: tushengtao
 * @Description: �ݹ���ֲ��� ���ֲ���ǰ������������
 * @date 2020-08-24 1:16
 */
public class RecursionBinarySearch{
    public int binarySearch(int[] array,int element,int startIndex,int endIndex){
        // ����м�Ԫ�ص�����
        int midIndex = (startIndex + endIndex) / 2;
        // �����ж�Ѱ�ҵ�Ԫ��element�Ƿ�С������Ԫ�ص���Сֵ  �Ƿ��������Ԫ�ص����ֵ
        // �������һ��Ϊtrue �Ͳ���ʧ�ܷ��� -1
        // ��Ҫ�ж� startIndex < endIndex
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
     * ���� 55��70��������
     * @param args
     */
    public static void main(String[] args) {
        RecursionBinarySearch rbs = new RecursionBinarySearch();
        int[] array ={0,10,20,30,40,50,60,70,80,90};
//        int elementIndex = bs.binarySearch(array,55,0,array.length - 1);
        int elementIndex = rbs.binarySearch(array,70,0,array.length - 1);
        switch (elementIndex){
            case -1 :
                System.out.println("Ԫ�ز����ڣ�");
                break;
            default:
                    System.out.println("Ԫ���������е�������: " + elementIndex);
        }
    }
}