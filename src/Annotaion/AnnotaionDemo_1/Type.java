import java.lang.annotation.*;

/**
 * 类的注解 ElementType.TYPE
 * 自定义注解
 * @author tushengtao
 * @date 2020/08/25
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Type {
    // 注解上定义的成员变量可以是String、数组、Class、枚举类、注解
    String[] studentNames();
    int studentCount();

}
