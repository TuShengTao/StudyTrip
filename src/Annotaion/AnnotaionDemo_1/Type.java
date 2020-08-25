import java.lang.annotation.*;

/**
 * ���ע�� ElementType.TYPE
 * �Զ���ע��
 * @author tushengtao
 * @date 2020/08/25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Type {
    // ע���϶���ĳ�Ա����������String�����顢Class��ö���ࡢע��
    String[] studentNames();
    int studentCount();

}
