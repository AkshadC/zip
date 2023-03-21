package com.project.alm.controller;

import com.project.alm.entity.Stories;
import com.project.alm.service.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alm/stories")
public class StoryController {
    @Autowired
    StoryService storyService;

    @PostMapping("/create")
    public String createStories(@RequestBody Stories stories) {
        return storyService.createStories(stories);
    }

    @GetMapping("/{storyId}")
    public String getStoryById(@PathVariable("storyId") String id) {
        return storyService.getStoryById(id);
    }

    @GetMapping("/list/{userId}")
    public List<String> getStoryByUserId(@PathVariable("userId")String id){
        return storyService.getStoryByUserId(id);
    }

}