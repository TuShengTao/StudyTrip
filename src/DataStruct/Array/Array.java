package Array;

import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: �Լ���װһ�����飬��������
 * @date 2020-08-23 14:41
 */
public class Array<T> {
    private T[] array;

    // Ԫ�ظ���
    private int size = 0;

    /**
     * �޲εĹ��캯�� Ĭ�ϴ�С��10
     */
    public Array(){
        array = (T[]) new Object[10];
    }

    /**
     * �вεĹ��캯��
     * @param length ����
     */
    public Array(int length){
        array = (T[]) new Object[length];
    }

    /**
     * ���һ��Ԫ�� ʵ�ֶ�̬����
     * @param element Ԫ��
     */
    public void add(T element){
        // �ж��Ƿ���Ҫ����
        if (array.length <= size){
            expand();
        }else {
            array[size] = element;
            // Ԫ�ظ����� 1
            size++;
        }
    }

    /**
     * ���Ԫ��ʱ�����鶯̬����
     */
    private void expand(){
        // �½�һ������ ������֮ǰ��2��
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
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
            T[] newArray = (T[]) new Object[array.length];
            for (int i = 0; i < array.length; i++) {
                if (i != index){
                    newArray[i] = array[i];
                }
            }
            array = newArray;
            size--;
        }
    }
    /**
     * �޸�index�±��Ԫ��
     * @param element Ԫ��
     */
    public void update(int index,T element){
        if (index < 0 || index > array.length){
            throw new RuntimeException("�±�Խ��");
        }else {
            // ʵ���޸�
            array[index] = element;
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
     * ��ȡԪ�ظ���
     *
     * @return int
     */
    public int getSize(){
        return size;
    }

    public String printArray(){
        return Arrays.toString(array);
    }
}
