import java.lang.annotation.*;

/**
 * ��Ա����ע��  ElementType.FIELD
 * �Զ���ע��
 * @author tushengtao
 * @date 2020/08/25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD )
public @interface Fields {
    // ע���϶���ĳ�Ա����������String�����顢Class��ö���ࡢע��
    String schoolName();
    String schoolEmail()default "123456@xxx.com";
}
