package src.class7;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {

    private final List<Member> members = new ArrayList<>();

    public Member findByEmail(String email) {
        for (Member member : members) {
            if (member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
    }

    public Member findByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }

    public void save(Member member) {
        if (findByEmail(member.getEmail()) == null) {
            this.members.add(member);
            return;
        }
        throw new IllegalArgumentException("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
    }
}
