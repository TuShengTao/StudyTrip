import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-08-20 23:50
 */
public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 192.168.254.1
        /*
        * InetAddress address = InetAddress.getByName("DESKTOP-VJGNSF5");
        * */
        InetAddress address = InetAddress.getByName("192.168.254.1");

        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println("主机名：" + name);
        System.out.println("ip地：" + ip);

    }
}
