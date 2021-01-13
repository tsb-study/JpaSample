package com.example.jpasample;

import javax.persistence.EntityManager;

import com.example.jpasample.domain.Member;
import com.example.jpasample.domain.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@Rollback(false)
public class QuerydslApplicationTests {
  @Autowired
  EntityManager em;

  @Test
  void contextLoads() {
    Member member = new Member();
    em.persist(member);

    JPAQueryFactory query = new JPAQueryFactory(em);
    QMember qMember = QMember.member;

    Member result = query.selectFrom(qMember).fetchOne();

    Assertions.assertThat(result).isEqualTo(member);
    Assertions.assertThat(result.getId()).isEqualTo(member.getId());
  }
}
