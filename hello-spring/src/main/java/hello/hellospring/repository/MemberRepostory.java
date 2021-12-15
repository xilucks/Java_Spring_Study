package hello.hellospring.repository;

import java.lang.reflect.Member;
import java.util.List;
import java.util.Optional;

public interface MemberRepostory {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
