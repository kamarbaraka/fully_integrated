package org.kamar.authserver.user_management.entities;

import org.springframework.security.core.GrantedAuthority;

/**
 * Represents the different authorities that a user can have in the system.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public enum UserAuthorities implements GrantedAuthority {

    CREATE_USER("create_user"),
    DELETE_USER("delete_user"),
    GET_USER("get_user"),
    UPDATE_USER("update_user"),
    GET_USERS("get_users");

    private final String authority;
    /**
     * Represents the authorities that a user can have in the system.
     */
    UserAuthorities(String authority) {
        /*initialize the authority*/
        this.authority = authority;
    }

    /**
     * Returns the authority of the user.
     *
     * @return the authority of the user.
     */
    @Override
    public String getAuthority() {
        /*return the authority*/
        return this.authority;
    }
}
