package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class MemoryMemberRepositoryTest {

  MemoryMemberRepositrory repositrory = new MemoryMemberRepositrory();

  @AfterEach
  public void afterEach() {
    repositrory.clearStore();
  }

  @Test
  public void save() {
    Member member = new Member();
    member.setName("Spring");

    repositrory.save(member);

    Member result = repositrory.findById(member.getId()).get();
    assertThat(member).isEqualTo(result);
  }

  @Test
  public void findByName() {
    Member member1 = new Member();
    member1.setName("spring1");
    repositrory.save(member1);

    Member member2 = new Member();
    member2.setName("spring2");
    repositrory.save(member2);

    Member result = repositrory.findByName("spring1").get();

    assertThat(result).isEqualTo(member1);
  }

  @Test
  public void findAll() {
    Member member1 = new Member();
    member1.setName("spring1");
    repositrory.save(member1);

    Member member2 = new Member();
    member2.setName("spring2");
    repositrory.save(member2);

    List<Member> result = repositrory.findAll();

    assertThat(result.size()).isEqualTo(2);
  }
}
