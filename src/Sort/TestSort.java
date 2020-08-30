import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: �������������д������
 * @date 2020-08-31 1:17
 */
// �鲢����ʼ
/**
// �鲢����

public class TestSort {
    public static void sort(int[] array,int low,int high){
        int mid = (low + high) / 2;
        if (low < high){
           // ��
            sort(array,low,mid);
           // ��
            sort(array,mid+1,high);
            // �Σ��ϲ���
            merge(array,low,mid,high);
        }

    }
    public static  void merge(int[] array,int low,int mid,int high){
        int[] tempArray = new int[(high - low) + 1];
        // ��ָ��
        int left = low;
      // ��ָ��
        int right = mid + 1;
        int k = 0;
        // �ѽ�С�ķ�����ʱ����tempArray,ͨ����һ������ߺ��ұ�����һ����ȫ������������ʱ����
        while (left <= mid && right <= high){
            if (array[left] < array[right]){
                tempArray[k++] = array[left++];
            }else {
                tempArray[k++] = array[right++];
            }
        }
        // ͨ����һ�����п����������ʣ�������Ҳ�п������ұߣ�������߻����ұߣ�ͳһ������whileѭ��
        // �����ʣ���ͨ��whileȫ��������ʱ����
        while (left <= mid){
            tempArray[k++] = array[left++];
        }
        // ���ұ�ʣ���ͨ��whileȫ��������ʱ����
        while (right <= high){
            tempArray[k++] = array[right++];
        }
        // �ź��������һ��һ������ԭ����
        for (int i = 0; i < tempArray.length ; i++) {
            array[low++] = tempArray[i];
        }
    }
    public static void main(String[] args) {
        // ���Թ鲢����
        int[] array ={2,1,4,3,6,3,7,8,9,100,99,88,98,1000,1,0};
        TestSort.sort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

}
 **/
// �鲢�������
public class TestSort{

}








