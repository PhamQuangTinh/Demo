package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{


    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String fullName;

    @Column
    private String phoneNumber;

    public UserEntity(Long id, String fullName, String password, String phoneNumber,
                      String username){
        super.id = id;
        this.password = password;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.username = username;
    }
}
