package com.project.alm.service;

import com.project.alm.Repository.StoryRepository;
import com.project.alm.Repository.UserRepository;
import com.project.alm.entity.Stories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class StoryService {
    @Autowired
    private StoryRepository storyRepository;
    private UserRepository userRepository;

    public String createStories(Stories stories){
        storyRepository.save(stories);
        return "Story Created Successfully";
    }
    public String getStoryById(String storyId){
        Optional<Stories> s = storyRepository.findById(storyId);
        return "StoryName: "+s.get().getStoryname()+"\n"+"StoryDescription: "+s.get().getDescription();
    }
    public List<String> getStoryByUserId(String userId){
        return storyRepository.getStoriesFromUserId(userId);
    }

}
