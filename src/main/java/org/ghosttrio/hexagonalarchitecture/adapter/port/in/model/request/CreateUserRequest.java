package org.ghosttrio.hexagonalarchitecture.adapter.port.in.model.request;

public record CreateUserRequest(
        String name,
        String nickname
) {
}
