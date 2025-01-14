package com.swyp.playground.domain.findfriend.repository;

import com.swyp.playground.domain.findfriend.domain.FindFriend;
import com.swyp.playground.domain.findfriend.domain.RecruitmentStatus;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface FindFriendRepository extends JpaRepository<FindFriend, Long> {
    //해당 놀이터의 친구 모집 글 모두 조회(최신순)
    List<FindFriend> findAllByPlaygroundIdOrderByCreatedAtDesc(String playgroundId);

    //친구모집글 상위 3개 조회(메인페이지 최신 순)
    @Query("SELECT f FROM FindFriend f ORDER BY f.createdAt DESC")
    List<FindFriend> findTop3ByCreatedAtDesc(Pageable pageable);

    //startTime이 현재 시각보다 10분 느린 친구 모집 글 모두 조회
    List<FindFriend> findByStatusAndStartTimeBefore(RecruitmentStatus status, LocalDateTime time);

    //endTime이 현재 시각과 같아진 친구 모집 글 모두 조회
    List<FindFriend> findByStatusAndEndTimeBefore(RecruitmentStatus status, LocalDateTime time);

    //특정 부모가 만든 친구 모집 글 찾기
    Optional<FindFriend> findByOwner_ParentId(Long parentId);

    //내가 모집중이거나 놀고 있는 글 조회
    List<FindFriend> findByNickname(String nickname);

}
