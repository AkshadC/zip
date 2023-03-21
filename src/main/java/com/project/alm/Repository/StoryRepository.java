package com.project.alm.Repository;

import com.project.alm.entity.Stories;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StoryRepository extends CrudRepository<Stories, String> {

    @Query(value = "SELECT storyname from stories where users_userid = :userid", nativeQuery = true)
    List<String> getStoriesFromUserId(@Param("userid")String userId);

    @Query(value = "select storyname from stories where features.feature_id = :featureid", nativeQuery = true)
    List<String> getStoryByFId(@Param("featureid") String featureid);
}
