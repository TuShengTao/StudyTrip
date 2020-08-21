/**
 * @author: tushengtao
 * @Description: ������
 * @date 2020-08-20 22:47
 */
public class Box {

    /**
     * ��ʾ��xƿ��
     */
    private int milk;
    /**
     * ��ʾ�����״̬
     */
    private boolean state = false;

    /**
     * �洢ţ�̵Ĳ���
     * @param milk
     */
    public synchronized void put(int milk) {
        // �����ţ�̣��ȴ�����
        if (state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // ���û��ţ�̣��͵ȴ�����
        this.milk = milk;
        System.out.println("���̹�����"+ this.milk + "ƿ�̷�������");
        // �������֮���޸������״̬
        state = true;
        // ���������ȴ��߳�
        notifyAll();
    }
    /**
     * ȡţ�̵Ĳ���
     * @param
     */
    public synchronized void get(){
        // ���û��ţ�̣��ȴ�����
        if (!state){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        // �����ţ�̾�ȥ����
        System.out.println("�û��õ���"+ this.milk +"ƿ��");
        // ������Ϻ��޸�����״̬
        state = false;
        // ���������ȴ��߳�
        notifyAll();
    }
}
