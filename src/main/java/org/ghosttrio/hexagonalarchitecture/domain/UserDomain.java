package org.ghosttrio.hexagonalarchitecture.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDomain {
    private Long id;
    private String name;
    private String nickname;

    public static UserDomain create(String name, String nickname) {
        return new UserDomain(null, name, nickname);
    }
}
