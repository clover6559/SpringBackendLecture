package org.example.springstablehigh.example2.repository;

import org.example.springstablehigh.example2.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
