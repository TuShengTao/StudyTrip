/**
 * ���衣
 *
 * @author tushengtao
 * @author: tushengtao
 * @Description: ������ ��¶���ͻ���ʹ�õ���
 * ����������Ժ������ˣ��㲻�ùܺ�����������������ֻҪ������������Ҫ�Ժ����㣬������ͻ�ȥ��������
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
        System.out.println("�ã����ӣ������ʲô���Ҿ͸�����ʲô��!����......");
        cookingFishStrategy.cooking();
    }
}
