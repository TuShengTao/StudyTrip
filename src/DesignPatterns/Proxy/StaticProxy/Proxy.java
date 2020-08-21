/**
 * @author: tushengtao
 * @Description: �����ɫ �н�
 * @date 2020-08-21
 */
public class Proxy implements RentHouse {

    private Landlord landlord;
    public Proxy(Landlord landlord){
        this.landlord = landlord;
    }
    /**
     * �����ⷿ��
     */
    @Override
    public void rent() {
        checking();
        landlord.rent();
        signContract();
        collectFees();
    }
    /**
     * ����
     */
    public void checking() {
        System.out.println("�н���㿴��");
    }
    /**
     * ǩ���ͬ
     */
    public void signContract() {
        System.out.println("ǩ���޺�ͬ");
    }
    /**
     * ���н��
     */
    public void collectFees() {
        System.out.println("���н��");
    }
}
