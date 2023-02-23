package src.class7;

public class Member {

    private String email;
    private String name;
    private Integer age;
    private Integer ptTime;
    private String status;

    private Member(String email) {
    }

    private Member(String email, String name) {
    }

    private Member(String email, String name, Integer age) {
    }

    public Member(String email, String name, Integer age, Integer ptTime) {
        this.email = email;
        this.name = name;
        this.age = age;
        if (ptTime > 0) {
            this.status = "VIP";
        } else {
            this.status = "일반";
        }
        this.ptTime = ptTime;

    }

    public String customToString(Member member) {
        return
            member.getName() + "님은 "
                + member.getStatus()
                + "회원이고, 이메일은 "
                + member.getEmail()
                + "이고, 나이는 " + member.getAge() +
                "살입니다.";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
