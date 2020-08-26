import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ģ��SpringMVC�е�RequestMappingע��
 *
 * @author tushengtao
 * @date 2020/08/26
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    /**
     * ����api·��
     *
     * @return {@link String}
     */
    String value();

    /**
     * ���󷽷�
     *
     * @return {@link String[]}
     */
    String[] method()default {};

}