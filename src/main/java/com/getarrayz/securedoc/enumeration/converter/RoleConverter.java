package com.getarrayz.securedoc.enumeration.converter;

import com.getarrayz.securedoc.enumeration.Authority;
import jakarta.persistence.AttributeConverter;

import java.util.stream.Stream;

public class RoleConverter implements AttributeConverter<Authority, String> {

    @Override
    public String convertToDatabaseColumn(Authority authority) {
        if(authority == null){
            return null;
        }
        return authority.getValue();
    }

    @Override
    public Authority convertToEntityAttribute(String code) {
        if(code == null){
            return null;
        }
        return Stream.of(Authority.values())
                .filter(authority -> authority.getValue().equals(code))
                .findFirst()
                .orElseThrow(IllegalAccessError::new);
    }
}
