import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: ð������
 * @date 2020-08-31 22:01
 */
public class BubbleSort {
    /**
     * ð�����������Ƚ�
     * ע���ֹ����Խ�� j���������� ��Ϊ�� j+1
     */
    public static void sort(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1 ; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9,7,4,3,1,6,7,9,8,11,14,3,0};
        BubbleSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
