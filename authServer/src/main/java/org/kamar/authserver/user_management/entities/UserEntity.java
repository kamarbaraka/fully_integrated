package org.kamar.authserver.user_management.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.security.config.core.GrantedAuthorityDefaults;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * The UserEntity class represents a user entity in the system.
 *
 * <p>
 * The UserEntity class is an entity class that is mapped to the "users" database table. It implements the UserDetails
 * interface, which provides methods for managing user authentication and authorization. The UserEntity class contains
 * various properties that represent user attributes such as username, firstname, lastname, email, etc.
 * </p>
 *
 * <p>
 * The UserEntity class also contains a set of authorities, represented by the UserAuthorities enum, that define the
 * permissions and roles associated with the user. The authorities set can be used for user authorization and access control.
 * </p>
 *
 * <p>
 * Additionally, the UserEntity class includes various boolean properties that indicate the state or status of the user,
 * such as whether the user account is verified, whether the user has a premium account, etc.
 * </p>
 *
 * <p>
 * <b>Usage:</b>
 *
 * <pre>
 * UserEntity user = new UserEntity();
 * // Set the user attributes
 * // Save or retrieve the user from the database
 * </pre>
 * </p>
 *
 * <p>
 * This class does not introduce any additional functionalities or methods beyond those provided by its superclass and
 * interfaces.
 * </p>
 *
 * @see UserDetails
 * @see UserAuthorities
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
@Entity(name = "users")
@Getter
@Setter
public class UserEntity implements UserDetails {

    @Id
    @Length(min = 5, max = 50, message = "username must be 5 characters or more and less that 50 characters.")
    @NotBlank(message = "username cannot be blank.")
    @NotEmpty(message = "username cannot be empty.")
    @NotNull(message = "username cannot be null.")
    @Column(nullable = false)
    private String username;

    @NotBlank(message = "firstname cannot be blank.")
    @NotEmpty(message = "firstname cannot be empty.")
    @NotNull(message = "first name cannot be null.")
    @Column(nullable = false)
    private String firstname;

    private String lastname;

    @Email(message = "email must be an email.")
    @NotBlank(message = "email cannot be blank.")
    @NotEmpty(message = "email cannot be empty.")
    @NotNull(message = "email cannot be null.")
    @Column(nullable = false)
    private String email;

    @Pattern(regexp = "(?=\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\\\S+$).{8,}")
    @Length(message = "password length must be more than 8 characters.", min = 8)
    @Column(nullable = false)
    private String password;

    @Pattern(regexp = "^\\+(?:[0-9] ?){6,14}[0-9]$", message = "value must be a valid phone number.")
    private String mobileNumber;

    @NotNull(message = "authorities cant be null.")
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "user_authorities", joinColumns = @JoinColumn(name = "username"),
    inverseJoinColumns = @JoinColumn(name = "authority"))
    @Column(nullable = false)
    private final Set<UserAuthorities> authorities = new HashSet<>();

    private boolean accountVerified = false;

    private boolean accountPremium = false;

    private boolean enabled = false;

    private boolean accountNonExpired = true;

    private boolean accountNonLocked = true;

    private boolean credentialsNonExpired = true;

}
