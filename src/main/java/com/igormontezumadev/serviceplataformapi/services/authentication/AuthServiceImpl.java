package com.igormontezumadev.serviceplataformapi.services.authentication;

import com.igormontezumadev.serviceplataformapi.Entity.User;
import com.igormontezumadev.serviceplataformapi.dto.SignupClientRequestDTO;
import com.igormontezumadev.serviceplataformapi.dto.UserDTO;
import com.igormontezumadev.serviceplataformapi.enums.UserRole;
import com.igormontezumadev.serviceplataformapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO signupClient(SignupClientRequestDTO signupRequestDTO) {
        User user = new User();
        user.setName(signupRequestDTO.getName());
        user.setLastName(signupRequestDTO.getLastName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword()));
        user.setPhone(signupRequestDTO.getPhone());

        user.setRole(UserRole.CLIENT);

        return userRepository.save(user).getDto();
    }

    public UserDTO signupCompany(SignupClientRequestDTO signupRequestDTO) {
        User user = new User();
        user.setName(signupRequestDTO.getName());
        user.setEmail(signupRequestDTO.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequestDTO.getPassword()));
        user.setPhone(signupRequestDTO.getPhone());

        user.setRole(UserRole.COMPANY);

        return userRepository.save(user).getDto();
    }

    public Boolean presentByEmail(String email) {
        return userRepository.findFirstByEmail(email) != null;
    }
}
