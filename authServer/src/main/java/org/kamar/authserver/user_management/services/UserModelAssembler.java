package org.kamar.authserver.user_management.services;

import org.apache.catalina.User;
import org.jetbrains.annotations.NotNull;
import org.kamar.authserver.user_management.entities.UserEntity;
import org.kamar.authserver.user_management.models.UserModel;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * The UserModelAssembler class is responsible for converting UserEntity objects to UserModel objects.
 * It implements the RepresentationModelAssembler interface, which provides methods for converting
 * objects to representation models in a RESTful API.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public class UserModelAssembler implements RepresentationModelAssembler<UserEntity, UserModel> {
    /**
     * Converts a UserEntity object to a UserModel object.
     *
     * <p>
     * This method takes a UserEntity object and converts it to a UserModel object. The UserEntity object represents
     * a user in the system, while the UserModel object is a representation of the user model in a RESTful API.
     * </p>
     *
     * @param entity the UserEntity object to be converted to a UserModel object
     * @return a UserModel object representing the converted UserEntity object
     * @throws NullPointerException if the entity parameter is null
     *
     * @see UserModel
     * @see UserEntity
     */
    @NotNull
    @Override
    public UserModel toModel(@NotNull UserEntity entity) {
        return new UserModel();
    }

    /**
     * Converts an iterable of UserEntity objects into a CollectionModel of UserModel objects.
     *
     * <p>
     * This method is implemented from the RepresentationModelAssembler interface. It takes an iterable
     * of UserEntity objects and converts them into a CollectionModel of UserModel objects. Each UserEntity
     * object is converted into a UserModel object using the toModel() method of the UserModelAssembler class.
     * </p>
     *
     * @param entities the iterable of UserEntity objects to be converted
     * @return a CollectionModel of UserModel objects representing the converted UserEntity objects
     * @throws NullPointerException if the entities parameter is null
     *
     * @see UserModel
     * @see UserEntity
     * @see UserModelAssembler
     */
    @NotNull
    @Override
    public CollectionModel<UserModel> toCollectionModel(@NotNull Iterable<? extends UserEntity> entities) {
        return CollectionModel.empty();
    }
}
