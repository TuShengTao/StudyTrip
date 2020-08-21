/**
 * @author: tushengtao
 * @Description: ˫����/˫��У����  ���ַ�ʽ����˫�����ƣ���ȫ���ڶ��߳�������ܱ��ָ�����
 * @date 2020-08-21 16:32
 */
public class DoubleCheckSingleton {
    /**
     * volatile�ؼ����Ƽ��Ķ���https://www.cnblogs.com/zhengbin/p/5654805.html
     * �����˵�����ڶ��߳�����£�volatile�ؼ������εľ�̬����������һ���߳��޸�ʱ
     * �����̶߳Դ˱������޸��ǿɼ��ģ��������߳�֪���˴˱������޸��ˣ��´ζ�ȡ���������ֵ���Ѿ��޸Ĺ���ֵ
     * ע��; ����ı���singleton�Ǳ�static���Σ������������࣬������������ĳһ������ģ��Ǳ��������ж�����
     */
    private volatile static DoubleCheckSingleton singleton;
    private DoubleCheckSingleton (){}
    public static DoubleCheckSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
    /**
     * ����������
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            // �½��߳�
            new Thread(()->{
                System.out.println(DoubleCheckSingleton.getInstance().hashCode());
            }).start();
        }
    }
}

