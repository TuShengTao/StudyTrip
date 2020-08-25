import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模拟SpringMVC中的RequestMapping注解
 *
 * @author tushengtao
 * @date 2020/08/26
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    /**
     * 请求api路径
     *
     * @return {@link String}
     */
    String value();

    /**
     * 请求方法
     *
     * @return {@link String[]}
     */
    String[] method()default {};

}
