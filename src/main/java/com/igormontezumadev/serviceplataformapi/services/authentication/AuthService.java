package com.igormontezumadev.serviceplataformapi.services.authentication;

import com.igormontezumadev.serviceplataformapi.dto.SignupRequestDTO;
import com.igormontezumadev.serviceplataformapi.dto.UserDTO;

public interface AuthService {

    UserDTO signupClient(SignupRequestDTO signupRequestDTO);
    UserDTO signupCompany(SignupRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);
}
