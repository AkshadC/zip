package com.project.alm.entity;



import lombok.*;

import javax.persistence.*;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {

    @Id
    @Column(name = "userid")
    private String user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @ManyToOne
    private Team team;
}