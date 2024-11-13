package org.ghosttrio.hexagonalarchitecture.application.port.out;

import org.ghosttrio.hexagonalarchitecture.domain.UserDomain;

public interface UserPersistencePort {
    void save(UserDomain userDomain);
}
