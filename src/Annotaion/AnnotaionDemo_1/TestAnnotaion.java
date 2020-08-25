import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 使用自定义注解  @MyAnnotation
 * 通过反射获取注解
 * @date 2020-08-25 19:40
 */
public class TestAnnotaion {
    /**
     * 主方法测试
     * @param args
     */
    public static void main(String[] args) {
        School school = new School();
        // 1 获取School类上的注解 @Type
        Type typeAnnotaion = school.getClass().getAnnotation(Type.class);
        String[] stuNames = typeAnnotaion.studentNames();
        int stuCount = typeAnnotaion.studentCount();
        System.out.println("学生姓名列表： "+ Arrays.toString(stuNames));
        System.out.println("学生的数量： "+stuCount);
        System.out.println("------------------------------------------------");
        // 2 获取School类上的成员注解 @Fields
        // 获取School类的所有成员
        Field[] f = school.getClass().getDeclaredFields() ;
        // 获取School类成员的注解
        Fields fieldsAnnotaion = f[0].getAnnotation(Fields.class);
        System.out.println("学校邮箱： "+fieldsAnnotaion.schoolEmail());
        System.out.println("学校名称："+fieldsAnnotaion.schoolName());

    }
}
