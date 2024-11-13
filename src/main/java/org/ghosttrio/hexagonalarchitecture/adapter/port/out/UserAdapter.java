package org.ghosttrio.hexagonalarchitecture.adapter.port.out;

import lombok.RequiredArgsConstructor;
import org.ghosttrio.hexagonalarchitecture.adapter.port.out.persistence.UserRepository;
import org.ghosttrio.hexagonalarchitecture.adapter.port.out.persistence.entity.UserEntity;
import org.ghosttrio.hexagonalarchitecture.application.port.out.UserPersistencePort;
import org.ghosttrio.hexagonalarchitecture.domain.UserDomain;
import org.ghosttrio.hexagonalarchitecture.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserAdapter implements UserPersistencePort {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public void save(UserDomain userDomain) {
        UserEntity userEntity = userMapper.toEntity(userDomain);
        userRepository.save(userEntity);
    }
}
