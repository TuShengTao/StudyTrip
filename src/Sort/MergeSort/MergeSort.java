import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: �鲢����ݹ�ʵ��
 * @date 2020-08-23 16:01
 */
public class MergeSort {
    public static void merge(int[] a,int low,int mid,int high){
        int[] temp = new int [high - low + 1];
        // ��ָ��
        int i = low;
        // ��ָ��
        int j = mid + 1;
        int k = 0;
        // �ѽ�С�������Ƶ���������
        while (i <= mid && j <= high) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        // �����ʣ�������������
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        // ���ұ߱�ʣ�������������
        while (j <= high) {
            temp[k++] = a[j++];
        }
        // ���������е�������nums����
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + low] = temp[k2];
        }
        System.out.println("��ʱ����" + Arrays.toString(temp));
    }
    public static void mergeSort(int[] a, int low, int high) {
        //����������
        int mid = (low + high) / 2;
        //����������ֻ��һ��Ԫ��ʱ�����ݹ� ��low == high��ʱ��
        if (low < high)  {
            // ���
            mergeSort(a, low, mid);
            // �Ҳ�
            mergeSort(a, mid + 1, high);
            // ���ҹ鲢
            merge(a, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int a[] = {3,4,5,6,0,4,6,23,1,678};
        mergeSort(a, 0, a.length - 1);
        System.out.println("��������" + Arrays.toString(a));
    }
}
