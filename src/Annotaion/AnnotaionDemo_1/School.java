/**
 * @author: tushengtao
 * @Description: 学校类
 * @date 2020-08-25 22:23
 */

// 类的自定义注解使用
@Type(studentNames = {"jack","小明"},studentCount = 2)

public class School {
    // schoolEmail 字段在注解里面设置了默认值，在这里可以省略
    @Fields(schoolName = "xxx学校")
    private String schoolName;
    @Fields(schoolName = "xxx学校")
    private String schoolEmail;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }
}
