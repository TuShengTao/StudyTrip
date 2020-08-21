/**
 * @author: tushengtao
 * @Description: 客户端类(测试类) 结合案例 即为儿子类 儿子告诉妈妈他想吃什么鱼
 * @date 2020-08-22 1:59
 */
public class Son {
    /**
     * 想吃什么鱼当然得先有个会做鱼的mom
     * */
    Mother mom = new Mother();
    public void tellMom(){
        // 如果你想吃红烧鱼那就告诉妈妈做红烧鱼
        System.out.println("妈妈，我想吃红烧鱼");
        mom.setCookingFish(new BraisedFish());
        // 妈妈开始做鱼
        mom.cookingFish();
//---------------------------------------------------
        // 如果你想吃清蒸鱼那就告诉妈妈做清蒸鱼
        System.out.println("妈妈，我想吃清蒸鱼");
        mom.setCookingFish(new SteamedFish());
        // 妈妈开始做鱼
        mom.cookingFish();
    }

    /**
     * 主方法进行测试
     * @param args arg游戏
     */
    public static void main(String[] args) {
        Son son = new Son();
        son.tellMom();
    }
}
