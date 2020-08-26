import java.lang.reflect.Field;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-08-26 14:49
 */
public abstract class Person {

    public Person(){
        setName(this.getClass());
    }

    public void setName(Class clazz){
        // 处理注解在类上
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
        // 处理注解在属性上
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            Name annotation = declaredField.getAnnotation(Name.class);
            // 判断属性上面是否有注解，如果没有注解就跳出此次循环
            if (null == annotation) {
                continue;
            }
            // 如果属性有注解就执行下面语句
            declaredField.setAccessible(true);
            try {
                declaredField.set(this, annotation.value());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
