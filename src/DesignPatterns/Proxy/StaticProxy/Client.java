/**
 * @author: tushengtao
 * @Description: �ͻ����� �ⷿ��
 * @date 2020-08-21
 */
public class Client {
    public static void main(String[] args) {
        // �����ⷿ��
        Landlord landlord  = new Landlord();
        // �����н��æ�ⷿ�ӣ�������������������
        Proxy proxy = new Proxy(landlord);
        // ����Ҫ�ҷ���,ֱ�����н���
        proxy.rent();
    }
}
