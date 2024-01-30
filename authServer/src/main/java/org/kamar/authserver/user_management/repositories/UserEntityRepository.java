package org.kamar.authserver.user_management.repositories;

import org.kamar.authserver.user_management.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The UserEntityRepository interface provides the necessary operation to interact with the UserEntity database table.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public interface UserEntityRepository extends JpaRepository<UserEntity, String > {
}
