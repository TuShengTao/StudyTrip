package Array;

/**
 * @author: tushengtao
 * @Description: �Լ���װһ�����飬��������
 * @date 2020-08-23 14:41
 */
public class Array<T> {
    private T[] array;

    /**
     * �޲εĹ��캯��
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
     * ���һ��Ԫ��
     * @param element Ԫ��
     */
    public void add(T element){
        // �½�һ�������ҳ��ȼ�1
        T[] newArray = (T[]) new Object[array.length + 1];
        for (int i = 0; i < array.length ; i++) {
            newArray[i] = array[i];
        }
        // ������������һ��λ�����һ����Ԫ��
        newArray[array.length] = element;
        // ��ֵ��ԭ����
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
            T[] newArray = (T[]) new Object[array.length - 1];
            for (int i = 0; i < array.length; i++) {
                if (i != index){
                    newArray[i] = array[i];
                }
            }
            // ����ԭ����array��ɾ����index�±��Ԫ��
            array = newArray;
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



}
