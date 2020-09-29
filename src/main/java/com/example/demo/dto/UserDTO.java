package com.example.demo.dto;

import com.example.demo.domain.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO extends MainDTO<UserDTO> {

    private String username;

    private String password;

    private String fullName;

    private String phoneNumber;

}
