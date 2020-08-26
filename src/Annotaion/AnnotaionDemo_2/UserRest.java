import java.util.Arrays;

/**
 * @author: tushengtao
 * @Description: ģ��api�ӿ�
 * @date 2020-08-26 2:35
 */
@Controller("/user")
public class UserRest {

    @RequestMapping(value = "/addUser",method = {"POST","GET"})
    public void addUser(){
        System.out.println("addUser");
    }

    /**
     * ����������
     *
     * @param args
     */
    public static void main(String[] args) throws NoSuchMethodException {
        Controller controller = UserRest.class.getAnnotation(Controller.class);
        System.out.println("Controllerע�� value : " + controller.value());

        RequestMapping requestMapping = UserRest.class.getMethod("addUser").getAnnotation(RequestMapping.class);
        String apiValue = requestMapping.value();
        String[] methodArray = requestMapping.method();
        System.out.println("RequestMappingע�� value : " + apiValue);
        System.out.println("RequestMappingע�� methods : "+ Arrays.toString(methodArray));



    }
}


