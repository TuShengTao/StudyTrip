/**
 * @author: tushengtao
 * @Description: 女人
 * @date 2020-08-26 20:59
 */
public class Woman extends Person {
    @Name("玛丽")
    private String name;
    public void say(){
        System.out.println("女人说： 我是" + name);
    }

    public static void main(String[] args) {
        // new一个子类实例的时候如果没有显式地调用父类构造方法，则默认调用父类的无参构造方法
        Woman woman = new Woman();
        woman.say();
    }
}
