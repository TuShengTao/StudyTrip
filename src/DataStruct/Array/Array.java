package Array;

import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: �Լ���װһ�����飬������಻���Ƶĵط�
 * @date 2020-08-23 14:41
 */
public class Array {
    private int [] array;
    /**
     * �޲εĹ��캯�� Ĭ�ϴ�С��10
     */
    public Array(){
        array = new int[0];
    }

    /**
     * �вεĹ��캯��
     * @param length ����
     */
    public Array(int length){
        array = new int[length];
    }

    /**
     * ���һ��Ԫ�� ʵ�ֶ�̬����
     * @param element Ԫ��
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
     * ���������±�ɾ��һ��Ԫ��
     * @param index ָ��
     */
    public void delete(int index){
        if (index < 0 || index > array.length ){
            throw new RuntimeException("�±�Խ�磡");
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
     * ��ͨѭ������
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
     * ���ֲ���
     *
     * @return int
     */
    public int binarySearch(int element ){
        // �������ٲ���
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
     * �޸�index�±��Ԫ��
     * @param element Ԫ��
     */
    public void update(int index,int element){
        if (index < 0 || index > array.length-1){
            throw new RuntimeException("�±�Խ��");
        }else {
            // ʵ���޸�
            array[index] = element;
        }
    }

    /**
     * �鲢����
     * @param
     * @return {@link int[]}
     */
    public void mergeSort(int low,int high){
         sort(array,low,high);
    }
    public static void merge(int[] array,int low,int mid,int high){
        int[] tmpArr = new int[high - low + 1];
        // ��ָ��
        int left = low;
        // ��ָ��
        int right = mid + 1;
        int k = 0;
        // ���Ƚ� �ѽ�С�ķŽ�tmpArr
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
        // �����ʣ�����Ž�ȥ
        while (left <= mid){
            tmpArr[k] = array[left];
            left++;
            k++;
        }
        // ���ұ�ʣ�µ����Ž�ȥ
        while (right <= high){
            tmpArr[k] = array[right];
            right++;
            k++;
        }
        // ���������е�������nums����
        for (int k2 = 0; k2 < tmpArr.length; k2++) {
            array[k2 + low] = tmpArr[k2];
        }
    }
    public static void sort(int[] array,int low,int high){
        int mid = (low + high) / 2;
        if(low < high){
            // ���
            sort(array,low,mid);
            // �ұ�
            sort(array,mid+1,high);
            // �ϲ�
            merge(array,low,mid,high);

        }

    }

    /**
     * ��ȡ����
     *
     * @return int
     */
    public int getLength(){
        return array.length;
    }

    /**
     * ��ӡһ��������
     *
     * @return {@link String}
     */
    public String printArray(){
        return Arrays.toString(array);
    }

    /**
     * ��ӡһ��Ԫ��
     *
     * @param index
     * @return int
     */
    public int print(int index){
        return array[index];
    }

    /**
     * ���������Թ鲢����
     *
     * @param args arg��Ϸ
     */
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,100,8,7,6};
        Array.sort(arr,0,7);
        System.out.println(Arrays.toString(arr));
    }
}
