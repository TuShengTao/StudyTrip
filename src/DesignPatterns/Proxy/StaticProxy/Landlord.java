/**
 * @author: tushengtao
 * @Description: 真实角色 房东
 * @date 2020-08-21
 */
public class Landlord implements RentHouse{
    @Override
    public void rent() {
        System.out.println("房东出租房子");
    }
}
