package com.igormontezumadev.serviceplataformapi.services.authentication;

import com.igormontezumadev.serviceplataformapi.dto.SignupClientRequestDTO;
import com.igormontezumadev.serviceplataformapi.dto.UserDTO;

public interface AuthService {

    UserDTO signupClient(SignupClientRequestDTO signupRequestDTO);
    UserDTO signupCompany(SignupClientRequestDTO signupRequestDTO);

    Boolean presentByEmail(String email);
}
