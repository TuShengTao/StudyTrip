/**
 * 妈妈。
 *
 * @author tushengtao
 * @author: tushengtao
 * @Description: 环境类 暴露给客户端使用的类
 * 举例：你想吃红烧鱼了，你不用管红烧鱼具体的做法，你只要告诉你妈妈你要吃红烧鱼，你妈妈就会去给你做了
 * @date 2020-08-22 2:03
 */
public class Mother {
    private CookingFish cookingFishStrategy;

    public CookingFish getCookingFish() {
        return cookingFishStrategy;
    }

    public void setCookingFish(CookingFish cookingFishStrategy) {
        this.cookingFishStrategy = cookingFishStrategy;
    }
    public void cookingFish(){
        System.out.println("好，儿子！你想吃什么鱼我就给你做什么鱼!等着......");
        cookingFishStrategy.cooking();
    }
}
