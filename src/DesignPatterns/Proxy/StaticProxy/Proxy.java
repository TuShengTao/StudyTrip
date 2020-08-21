/**
 * @author: tushengtao
 * @Description: 代理角色 中介
 * @date 2020-08-21
 */
public class Proxy implements RentHouse {

    private Landlord landlord;
    public Proxy(Landlord landlord){
        this.landlord = landlord;
    }
    /**
     * 代理租房子
     */
    @Override
    public void rent() {
        checking();
        landlord.rent();
        signContract();
        collectFees();
    }
    /**
     * 看房
     */
    public void checking() {
        System.out.println("中介带你看房");
    }
    /**
     * 签署合同
     */
    public void signContract() {
        System.out.println("签租赁合同");
    }
    /**
     * 收中介费
     */
    public void collectFees() {
        System.out.println("收中介费");
    }
}
