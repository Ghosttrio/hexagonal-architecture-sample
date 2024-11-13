package org.ghosttrio.hexagonalarchitecture.application.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.ghosttrio.hexagonalarchitecture.application.port.out.UserPersistencePort;
import org.ghosttrio.hexagonalarchitecture.domain.UserDomain;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUserService {

    private final UserPersistencePort userPersistencePort;

    @Transactional
    public void create(String name, String nickname){
        UserDomain userDomain = UserDomain.create(name, nickname);
        userPersistencePort.save(userDomain);
    }
}
