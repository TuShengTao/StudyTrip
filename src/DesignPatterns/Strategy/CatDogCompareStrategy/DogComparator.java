/**
 * @author: Tu ShengTao
 * @Description: ���ݹ��Ե�ʳ���������� �������ıȽ���
 * @date 2020-08-18 18:08
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.food > o2.food){
            return 1;
        }else if (o1.food < o2.food){
            return  -1;
        }else {
            return 0;
        }
    }
}
