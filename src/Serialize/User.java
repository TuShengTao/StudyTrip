import java.io.Serializable;

/**
 * @author: tushengtao
 * @Description:
 * @date 2020-08-26 15:59
 */
public class User implements Serializable {
    private String name;
    private int age;
    private transient String email;
    // 不会被序列化
    private static int id  = 666;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void run()
    {
        System.out.println(name+"可以跑10km" );
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age + '\'' +
                ", id=" + User.id +
                '}';
    }
}
