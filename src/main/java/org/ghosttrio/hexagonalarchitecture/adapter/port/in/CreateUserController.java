package org.ghosttrio.hexagonalarchitecture.adapter.port.in;


import lombok.RequiredArgsConstructor;
import org.ghosttrio.hexagonalarchitecture.adapter.port.in.model.request.CreateUserRequest;
import org.ghosttrio.hexagonalarchitecture.application.port.in.CreateUserUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CreateUserController {

    private final CreateUserUseCase createUserUseCase;

    @PostMapping("/users")
    public String create(@RequestBody CreateUserRequest request) {
        createUserUseCase.execute(request.name(), request.nickname());
        return "ok";
    }
}
