package org.ghosttrio.hexagonalarchitecture.mapper;

import org.ghosttrio.hexagonalarchitecture.adapter.port.out.persistence.entity.UserEntity;
import org.ghosttrio.hexagonalarchitecture.domain.UserDomain;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserEntity toEntity(UserDomain userDomain) {
        return UserEntity.create(userDomain.getName(), userDomain.getNickname());
    }
}
