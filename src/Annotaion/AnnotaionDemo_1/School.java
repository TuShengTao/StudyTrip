/**
 * @author: tushengtao
 * @Description: ѧУ��
 * @date 2020-08-25 22:23
 */

// ����Զ���ע��ʹ��
@Type(studentNames = {"jack","С��"},studentCount = 2)

public class School {
    // schoolEmail �ֶ���ע������������Ĭ��ֵ�����������ʡ��
    @Fields(schoolName = "xxxѧУ")
    private String schoolName;
    @Fields(schoolName = "xxxѧУ")
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
