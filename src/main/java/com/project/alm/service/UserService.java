package com.project.alm.service;

import com.project.alm.Repository.StoryRepository;
import com.project.alm.Repository.UserRepository;
import com.project.alm.dto.UserLoginRequest;
import com.project.alm.entity.Stories;
import com.project.alm.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;
    private StoryRepository storyRepository;

    public String getLoginResponse(UserLoginRequest userLoginRequest){
        boolean check = userRepository.checkUserNamePassword(userLoginRequest.getUserName(), userLoginRequest.getPassword());
        if(check){
            return "Success";
        }
        else{
            return "Fail!";
        }
    }

    public String getUserProfile(String userid) {
        Optional<Users> user = userRepository.findById(userid);
        String userName = user.get().getUsername();
        String userTeam = user.get().getTeam().getTeamname();
        return userName +": Works For: " + userTeam;
    }
    public Stories getStoriesFromUserID(String userId){
        return userRepository.getStoriesFromUserID(userId);
    }
}
