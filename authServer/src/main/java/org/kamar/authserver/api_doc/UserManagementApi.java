package org.kamar.authserver.api_doc;

import org.kamar.authserver.user_management.dtos.UserDto;
import org.kamar.authserver.user_management.models.UserModel;

import java.util.List;

/**
 * Represents an API for managing user operations.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public interface UserManagementApi {

    /*api to create a new user.*/
    void createNewUser(UserDto userDto);
    /*api to remove a user*/
    void removeUser(String username);
    /*api to get a user.*/
    UserModel getUserByUsername(String username);
    /*api to get all users.*/
    List<UserModel> getAllUsers();
    /*api to update user data.*/
    UserModel updateUserData(UserDto userDto);
}
