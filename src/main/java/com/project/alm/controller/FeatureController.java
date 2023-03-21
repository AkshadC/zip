package com.project.alm.controller;


import com.project.alm.entity.Features;
import com.project.alm.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alm/feature")
public class FeatureController {
    @Autowired
    FeatureService featureService;

    @PostMapping("/create")
    public String createFeature(@RequestBody Features features){return featureService.createFeature(features);}
    @GetMapping("/{featureId}")
    public String getFeatureById(@PathVariable("featureId")String id){
        return featureService.getFeatureById(id);
    }
    @GetMapping("/list/{featureId}")
    public String getStoryByFId(@PathVariable("featureId")String id){
        return featureService.getStoryByFId(id);
    }
}
