package com.igormontezumadev.serviceplataformapi.dto;

import lombok.Data;

@Data
public class SignupCompanyRequestDTO {

    private String email;
    private String password;
    private String name;
    private String address;
    private String phone;
}
