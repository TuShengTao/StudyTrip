import java.util.Objects;

/**
 * @author: Tu ShengTao
 * @Description:
 * @date 2020-08-18 16:03
 */
public class Cat implements Comparable<Cat> {

    int weight;
    int height;

    public Cat(int weight,int height){
        this.weight = weight;
        this.height = height;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    /**
     * 用猫的体重进行比较，排序
     *
     * @param Cat c
     * @return int
     */
    @Override
    public int compareTo(Cat c) {
        if (this.weight < c.weight)
        {
            return  -1 ;
        }else if (this.weight > c.weight){
            return 1;
        }else {
            return  0;
        }
    }
}
