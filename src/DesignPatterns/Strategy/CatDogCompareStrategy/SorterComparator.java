import java.util.Arrays;
/**
 * @author: tushengtao
 * @Description: ʹ��Comparator(����ģʽ)
 * @date 2020-08-18 16:59
 */
public class SorterComparator<T> {
    /**
     * ����
     *
     */
    public  void sort(T[] arr,Comparator<T> comparator){
        for (int i = 0; i < arr.length ; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                // �����ǰ����Ԫ��arr[min]�����������Ԫ��arr[j]�ͽ��н���
                if (comparator.compare(arr[min],arr[j]) == 1){
                    // ����
                    T tmp = arr[j];
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
        SorterComparator sorterComparator = new SorterComparator();
        sorterComparator.sort(arrayCat,new CatHeightComparator());
        sorterComparator.sort(arrayDog,new DogComparator());
        System.out.println("èʹ�ò���ģʽ����"+Arrays.toString(arrayCat));
        System.out.println("��ʹ�ò���ģʽ����"+Arrays.toString(arrayDog));

    }
}
