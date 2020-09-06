import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: ��������ݹ�����
 * @date 2020-09-06 2:52
 */

public class QuickSort {

    public static void quickSort(int[] array,int startIndex,int endIndex){
        if (startIndex < endIndex){
            // ���ػ�׼Ԫ�ص�����
            int patition = partition(array,startIndex,endIndex);
            // �������߷ֱ�ʼ�ݹ�
            // ��߿�ʼ
            quickSort(array,startIndex,patition-1);
            // �ұ߿�ʼ
            quickSort(array,patition+1,endIndex);
        }
    }

    public static int partition(int[] array,int startIndex,int endIndex){
        // ��׼Ԫ�� 2
        int pivot = array[startIndex];
        // ��ָ��
        int left = startIndex;
        // ��ָ��
        int right = endIndex;
        // {2,4,6,1,3,7,9,8,5}
        // ����ָ��ֱ�ʼ�ƶ�
        while (left != right){
            // �ұ� �ҵ��Ȼ�׼Ԫ�� С��
            while (left < right && array[right] > pivot){
                right--;
            }

            // ��� �ҵ��Ȼ�׼Ԫ�� ���
            while (left < right && array[left] <= pivot){
                left++;
            }

            // �ҵ�����н���
            if (left < right){
                swap(array,left,right);
            }
        }
        // ��׼Ԫ�ؽ���
        swap(array,startIndex,left);
        // ��� left == right �� ��ִ��������� �ٴν��н���
        return left;
    }
    // ����
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
