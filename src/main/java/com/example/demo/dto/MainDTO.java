package com.example.demo.dto;

import com.example.demo.domain.UserEntity;
import org.modelmapper.ModelMapper;

import java.lang.reflect.Type;

public class MainDTO<T> {



    public static <T> T transferObject(Object model, Class<T> type){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(model, type);
    }

}
