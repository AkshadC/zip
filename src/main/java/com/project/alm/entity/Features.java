package com.project.alm.entity;

import lombok.*;


import javax.persistence.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "features")
public class Features {
    @Id
    @Column(name = "featureid")
    private String feature_id;
    @Column(name = "featuredescription")
    private String feature_description;
    @Column(name = "featuretitle")
    private String feature_title;
    @ManyToOne
    private Team team;
    @ManyToOne
    private Release release;
}