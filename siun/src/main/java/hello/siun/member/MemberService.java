package hello.siun.member;

public interface MemberService {
    void joinMember(Member member);

    Member findMember(Long memberId);

}
