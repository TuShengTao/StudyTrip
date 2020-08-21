/**
 * @author: tushengtao
 * @Description: 客户端类 租房者
 * @date 2020-08-21
 */
public class Client {
    public static void main(String[] args) {
        // 房东租房子
        Landlord landlord  = new Landlord();
        // 代理，中介帮忙租房子，并且有其他附属操作
        Proxy proxy = new Proxy(landlord);
        // 不需要找房东,直接找中介租
        proxy.rent();
    }
}
