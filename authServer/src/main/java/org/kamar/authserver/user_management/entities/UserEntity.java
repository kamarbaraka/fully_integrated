package org.kamar.authserver.user_management.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity(name = "users")
@Component
@Data
public class UserEntity {

    @Id
    private String username;
}
