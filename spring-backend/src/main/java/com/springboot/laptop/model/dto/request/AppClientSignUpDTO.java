package com.springboot.laptop.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppClientSignUpDTO {
    private String username;
    private String email;
    private String password;


}
