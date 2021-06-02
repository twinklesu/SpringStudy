package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    // 저장소에 저장
    Member save(Member member);
    // 찾아오기
    Optional<Member> findById(Long id); // Java 8 에 있느 기능. 받아올 때 null이면 null을 받지않음.
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
