package org.ghosttrio.hexagonalarchitecture.adapter.port.out.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.ghosttrio.hexagonalarchitecture.domain.UserDomain;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nickname;

    public static UserEntity create(String name, String nickname) {
        return new UserEntity(null, name, nickname);
    }
}
