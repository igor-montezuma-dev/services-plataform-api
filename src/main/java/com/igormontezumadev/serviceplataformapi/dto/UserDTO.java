package com.igormontezumadev.serviceplataformapi.dto;

import com.igormontezumadev.serviceplataformapi.enums.UserRole;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String lastName;

    private String phone;
    private UserRole role;
}
