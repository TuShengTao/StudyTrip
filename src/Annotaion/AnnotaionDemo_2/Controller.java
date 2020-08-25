import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 模拟在SpringMvc中的Controller注解
 *
 * @author tushengtao
 * @date 2020/08/26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    /**
     * 请求模块路径
     *
     * @return {@link String}
     */
    String value();
}
