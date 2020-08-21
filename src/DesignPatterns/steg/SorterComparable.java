import java.util.Arrays;

/**
 * @author: Tu ShengTao
 * @Description: ʹ���Լ�ʵ�ֵ�Comparable�ӿڽ�������
 * @date 2020-08-18 16:59
 */
public class SorterComparable {
    /**
     * ����
     *
     */
    public static void sort(Comparable[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // �����ǰ����Ԫ��arr[min]�����������Ԫ��arr[j]�ͽ��н���
                if (arr[min].compareTo(arr[j]) == 1){
                    // ����
                    Comparable tmp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = tmp;
                }
            }
        }
    }

    /**
     * ��������������
     *
     * @param
     */
    public static void main(String[] args) {
        Cat[] arrayCat = {new Cat(3,3),new Cat(5,5),new Cat(2,2)};
        Dog[] arrayDog = {new Dog(5),new Dog(8),new Dog(2)};
        SorterComparable.sort(arrayCat);
        SorterComparable.sort(arrayDog);
        System.out.println("è����"+Arrays.toString(arrayCat));
        System.out.println("������"+Arrays.toString(arrayDog));

    }
}
