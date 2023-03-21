package com.project.alm.Repository;

import com.project.alm.entity.Stories;
import com.project.alm.entity.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, String> {

    @Query(value = "SELECT CASE WHEN COUNT(C) > 0 THEN TRUE ELSE FALSE END FROM users c WHERE c.username = username AND c.password = password", nativeQuery = true)
    boolean checkUserNamePassword(@Param("username")String username, @Param("password")String password);

    @Query(value = "select * from Stories where users.user_id = userid", nativeQuery = true)
    Stories getStoriesFromUserID(@Param("userid")String userid);
}
