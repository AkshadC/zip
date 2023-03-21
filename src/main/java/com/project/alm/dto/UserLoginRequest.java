package com.project.alm.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@ToString
public class UserLoginRequest {
    private String userName;
    private String password;
}
