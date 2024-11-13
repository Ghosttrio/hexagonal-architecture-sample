package org.ghosttrio.hexagonalarchitecture.application.port.in;

import lombok.RequiredArgsConstructor;
import org.ghosttrio.hexagonalarchitecture.application.service.CreateUserService;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final CreateUserService createUserService;

    @Override
    public void execute(String name, String nickname) {
        createUserService.create(name, nickname);
    }
}
