/**
 * @author: tushengtao
 * @Description: 策略类 做鱼的策略; 清蒸
 * @date 2020-08-22 1:55
 */
public class SteamedFish implements CookingFish {
    /**
     * 烹饪
     *
     * @return {@link String}
     */
    @Override
    public void cooking() {
        System.out.println( "清蒸鱼做好了");
    }
}
