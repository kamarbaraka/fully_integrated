package org.kamar.authserver.client_management.models;

import org.kamar.authserver.client_management.entities.ClientEntity;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * The ClientModel class represents a model for a client entity.
 * It extends the RepresentationModel class from the Spring HATEOAS library.
 * This class provides methods to convert a client entity into a model and a list of client entities into a list of models
 *
 * @author samson baraka <kamar254baraka@gmail.com>..
 */
@Component
public class ClientModel extends RepresentationModel<ClientModel> {

}
