package com.igormontezumadev.serviceplataformapi.Entity;

import com.igormontezumadev.serviceplataformapi.dto.UserDTO;
import com.igormontezumadev.serviceplataformapi.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String email;
    private String password;
    private String name;
    private String lastName;

    private String phone;
    private UserRole role;


    public UserDTO getDto(){
        UserDTO userDto = new UserDTO();
        userDto.setId(this.id);
        userDto.setName(this.name);
        userDto.setEmail(this.email);
        userDto.setRole(this.role);
        return userDto;
    }
}
