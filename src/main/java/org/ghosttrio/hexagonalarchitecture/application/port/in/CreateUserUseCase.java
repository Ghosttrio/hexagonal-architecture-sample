package org.ghosttrio.hexagonalarchitecture.application.port.in;

public interface CreateUserUseCase {
    void execute(String name, String nickname);
}
