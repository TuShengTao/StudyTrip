import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * �Զ���ע��
 *
 * @author tushengtao
 * @date 2020/08/26
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)

public @interface InterFace {
    String value();
}
