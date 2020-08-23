/**
 * @author: tushengtao
 * @Description: 根据猫的高度来排序 叫做猫的比较器
 * @date 2020-08-18 18:08
 */
public class CatHeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.height > c2.height){
            return 1;
        }else if (c1.height < c2.height){
            return  -1;
        }else {
            return 0;
        }
    }
}
