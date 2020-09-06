import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: ��������
 * @date 2020-09-01 18:03
 */
public class InsertionSort {
    /**
     * ��������
     */

    public static  void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            // ������Ԫ�أ�array[j],������Ԫ����ǰ���������Ԫ�رȽϣ�������array[j-1]�Ƚ�
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,0,1,9,8,7,3,4,5,};
        InsertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
