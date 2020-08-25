import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: ʹ���Զ���ע��  @MyAnnotation
 * ͨ�������ȡע��
 * @date 2020-08-25 19:40
 */
public class TestAnnotaion {
    /**
     * ����������
     * @param args
     */
    public static void main(String[] args) {
        School school = new School();
        // 1 ��ȡSchool���ϵ�ע�� @Type
        Type typeAnnotaion = school.getClass().getAnnotation(Type.class);
        String[] stuNames = typeAnnotaion.studentNames();
        int stuCount = typeAnnotaion.studentCount();
        System.out.println("ѧ�������б� "+ Arrays.toString(stuNames));
        System.out.println("ѧ���������� "+stuCount);
        System.out.println("------------------------------------------------");
        // 2 ��ȡSchool���ϵĳ�Աע�� @Fields
        // ��ȡSchool������г�Ա
        Field[] f = school.getClass().getDeclaredFields() ;
        // ��ȡSchool���Ա��ע��
        Fields fieldsAnnotaion = f[0].getAnnotation(Fields.class);
        System.out.println("ѧУ���䣺 "+fieldsAnnotaion.schoolEmail());
        System.out.println("ѧУ���ƣ�"+fieldsAnnotaion.schoolName());

    }
}
