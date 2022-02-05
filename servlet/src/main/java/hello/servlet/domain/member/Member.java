package hello.servlet.domain.member;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Member {

    private Long id;
    private int age;
    private String username;

    public Member() {
    }

    public Member(String username, int age){
        this.username = username;
        this.age = age;
    }
}
