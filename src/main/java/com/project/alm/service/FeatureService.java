package com.project.alm.service;

import com.project.alm.Repository.FeatureRepository;
import com.project.alm.Repository.StoryRepository;
import com.project.alm.entity.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeatureService {
    @Autowired
    private FeatureRepository featureRepository;
    private Features features;
    private StoryRepository storyRepository;

    public String createFeature(Features feature){
        featureRepository.save(feature);
        return "Feature Created Successfully";
    }
    public String getFeatureById(String id){
        Optional<Features> F = featureRepository.findById(id);
        String result = "Title: "+F.get().getFeature_title() + "\n" + "Description" + F.get().getFeature_description();
        return result;
    }


    public String getStoryByFId(String id) {
        return storyRepository.getStoryByFId(id);
    }
}
