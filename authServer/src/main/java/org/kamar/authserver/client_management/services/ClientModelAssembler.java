package org.kamar.authserver.client_management.services;

import org.jetbrains.annotations.NotNull;
import org.kamar.authserver.client_management.entities.ClientEntity;
import org.kamar.authserver.client_management.models.ClientModel;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;

import java.util.List;

public class ClientModelAssembler implements RepresentationModelAssembler<ClientEntity, ClientModel> {
    /**
     * Converts an iterable of ClientEntity objects into a CollectionModel of ClientModel objects.
     *
     * @param entities The iterable of ClientEntity objects to be converted.
     * @return A CollectionModel of ClientModel objects representing the given iterable of entities.
     */
    @NotNull
    @Override
    public CollectionModel<ClientModel> toCollectionModel(@NotNull Iterable<? extends ClientEntity> entities) {

        return null;
    }

    /**
     * Converts a ClientEntity object into a ClientModel object.
     *
     * @param entity The ClientEntity object to be converted.
     * @return The ClientModel object representing the given entity.
     */
    @NotNull
    @Override
    /*api to get a model of the client entity.*/
    public ClientModel toModel(@NotNull ClientEntity entity){
        return null;
    }

}
