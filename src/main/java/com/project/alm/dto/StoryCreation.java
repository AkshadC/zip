package com.project.alm.dto;


import com.project.alm.entity.Features;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class StoryCreation {
    private String storyId;
    private String storyName;
    private String description;
    private Features features;
}
