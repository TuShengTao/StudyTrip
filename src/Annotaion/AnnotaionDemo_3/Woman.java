/**
 * @author: tushengtao
 * @Description: Ů��
 * @date 2020-08-26 20:59
 */
public class Woman extends Person {
    @Name("����")
    private String name;
    public void say(){
        System.out.println("Ů��˵�� ����" + name);
    }

    public static void main(String[] args) {
        // newһ������ʵ����ʱ�����û����ʽ�ص��ø��๹�췽������Ĭ�ϵ��ø�����޲ι��췽��
        Woman woman = new Woman();
        woman.say();
    }
}
