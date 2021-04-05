package com.example.store.dto.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserAddRequest {
    
    private Long id;

    private String name;

    private String username;

    private String password;

    private String avatar;

    private String genderDiv;

    private String mail;

    private String phone;
}
