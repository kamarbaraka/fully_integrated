package org.kamar.authserver.user_management.dtos;

import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.Length;
import org.kamar.authserver.user_management.entities.UserEntity;

import java.io.Serializable;

/**
 * DTO for {@link UserEntity}
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public record UserEntityDto(
        @NotNull(message = "username cannot be null.")
        @NotEmpty(message = "username cannot be empty.")
        @NotBlank(message = "username cannot be blank.")
        @Length(message = "username must be 5 characters or more and less that 50 characters.", min = 5, max = 50)
        String username,
        @NotNull(message = "first name cannot be null.")
        @NotEmpty(message = "firstname cannot be empty.")
        @NotBlank(message = "firstname cannot be blank.")
        String firstname,
        String lastname,
        @NotNull(message = "email cannot be null.")
        @Email(message = "email must be an email.")
        @NotEmpty(message = "email cannot be empty.") @NotBlank(message = "email cannot be blank.")
        String email,
        @Pattern(regexp = "(?=\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}")
        @Length(message = "password length must be more than 8 characters.", min = 8)
        String password,
        @Pattern(message = "value must be a valid phone number.", regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$")
        String mobileNumber
) implements Serializable {
}