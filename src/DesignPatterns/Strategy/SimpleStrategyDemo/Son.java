/**
 * @author: tushengtao
 * @Description: �ͻ�����(������) ��ϰ��� ��Ϊ������ ���Ӹ������������ʲô��
 * @date 2020-08-22 1:59
 */
public class Son {
    /**
     * ���ʲô�㵱Ȼ�����и��������mom
     * */
    Mother mom = new Mother();
    public void tellMom(){
        // �������Ժ������Ǿ͸���������������
        System.out.println("���裬����Ժ�����");
        mom.setCookingFish(new BraisedFish());
        // ���迪ʼ����
        mom.cookingFish();
//---------------------------------------------------
        // ���������������Ǿ͸���������������
        System.out.println("���裬�����������");
        mom.setCookingFish(new SteamedFish());
        // ���迪ʼ����
        mom.cookingFish();
    }

    /**
     * ���������в���
     * @param args arg��Ϸ
     */
    public static void main(String[] args) {
        Son son = new Son();
        son.tellMom();
    }
}
