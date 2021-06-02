package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    // test는 순서에 상관없이 메소드 별로 진행됨.
    // repository를 clear해줘야 함
    @AfterEach
    public void afterEach(){
        repository.clearStore();
    }

    @Test
    public void save(){
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
        // Assertions.assertEquals(member, result); //JUnit
        assertThat(result).isEqualTo(member); // assertj
    }

    @Test
    public void findByName(){
        Member member1 = new Member();
        member1.setName("subin");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("heedo");
        repository.save(member2);

        Member result = repository.findByName("subin").get();
        assertThat(result).isEqualTo(member1);
    }

    @Test
    public void findAll(){
        Member member1 = new Member();
        member1.setName("subin1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("heedo2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}