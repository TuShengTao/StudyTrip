import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: 模拟api接口
 * @date 2020-08-26 2:35
 */
@Controller("/user")
public class UserRest {

    @RequestMapping(value = "/addUser",method = {"POST","GET"})
    public void addUser(){
        System.out.println("addUser");
    }

    /**
     * 主方法测试
     *
     * @param args arg游戏
     */
    public static void main(String[] args) throws NoSuchMethodException {
        Controller controller = UserRest.class.getAnnotation(Controller.class);
        System.out.println("Controller注解 value : " + controller.value());

        RequestMapping requestMapping = UserRest.class.getMethod("addUser").getAnnotation(RequestMapping.class);
        String apiValue = requestMapping.value();
        String[] methodArray = requestMapping.method();
        System.out.println("RequestMapping注解 value : " + apiValue);
        System.out.println("RequestMapping注解 methods : "+ Arrays.toString(methodArray));



    }
}


