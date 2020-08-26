import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-08-26 14:46
 */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface Name {
    String value() default "";
}
