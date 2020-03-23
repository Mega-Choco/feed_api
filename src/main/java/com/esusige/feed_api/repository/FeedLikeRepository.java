package com.esusige.feed_api.repository;

import com.esusige.feed_api.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface FeedLikeRepository extends JpaRepository<Like,Long> {
    int countByFeedId(Long feedId);
    boolean deleteByFeedIdAndUserId(@Param("feedId")Long feedId,@Param("userId")Long userId);

}