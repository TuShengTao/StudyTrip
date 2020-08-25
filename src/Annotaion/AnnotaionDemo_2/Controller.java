import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ģ����SpringMvc�е�Controllerע��
 *
 * @author tushengtao
 * @date 2020/08/26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    /**
     * ����ģ��·��
     *
     * @return {@link String}
     */
    String value();
}
