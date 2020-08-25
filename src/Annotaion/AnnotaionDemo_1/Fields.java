import java.lang.annotation.*;

/**
 * 成员变量注解  ElementType.FIELD
 * 自定义注解
 * @author tushengtao
 * @date 2020/08/25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD )
public @interface Fields {
    // 注解上定义的成员变量可以是String、数组、Class、枚举类、注解
    String schoolName();
    String schoolEmail()default "123456@xxx.com";
}
