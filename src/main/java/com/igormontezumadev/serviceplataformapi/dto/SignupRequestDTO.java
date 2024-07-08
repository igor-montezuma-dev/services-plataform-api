package com.igormontezumadev.serviceplataformapi.dto;

import lombok.Data;

@Data
public class SignupRequestDTO {

    private String email;
    private String password;
    private String name;
    private String lastName;
    private String phone;

}
