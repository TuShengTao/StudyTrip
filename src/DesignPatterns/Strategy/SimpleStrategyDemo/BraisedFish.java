/**
 * @author: tushengtao
 * @Description: 策略类 做鱼的策略：红烧
 * @date 2020-08-22 1:57
 */
public class BraisedFish implements CookingFish{
    /**
     * 烹饪
     * @return {@link String}
     */
    @Override
    public void cooking() {
        System.out.println("红烧鱼做好了");
    }
}
