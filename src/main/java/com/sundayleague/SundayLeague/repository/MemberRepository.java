package com.sundayleague.SundayLeague.repository;

import com.sundayleague.SundayLeague.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
 // JpaRepository<MemberEntity, Long> MemberEntity의 PK 자료형은 Long으로 설정한 것임.

}
