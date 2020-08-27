import java.lang.reflect.Field;

/**
 * @author: tushengtao
 * @Description: ʹ�ø���Ĺ�����ע��
 * @date 2020-08-26 14:49
 */
public abstract class Person {

    public Person(){
        setName(this.getClass());
    }

    public void setName(Class clazz){
        // ����ע��������
        if (clazz.isAnnotationPresent(Name.class)){
            Name annotation = (Name) clazz.getAnnotation(Name.class);
            try{
                Field field = clazz.getDeclaredField("name");
                field.setAccessible(true);
                field.set(this, annotation.value());
            }catch (NoSuchFieldException e){
                e.printStackTrace();
            }catch (IllegalAccessException e){
                e.printStackTrace();
            }
            return;
        }
        // ����ע����������
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Name annotation = declaredField.getAnnotation(Name.class);
            // �ж����������Ƿ���ע�⣬���û��ע��������˴�ѭ��
            if (null == annotation) {
                continue;
            }
            // ���������ע���ִ���������
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, annotation.value());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
