package org.kamar.authserver.api_doc;

import org.kamar.authserver.client_management.dtos.ClientDto;
import org.kamar.authserver.client_management.models.ClientModel;

import java.util.List;

/**
 * The ClientManagementApi is an interface that provides methods to manage clients
 *
 * @author samson baraka <kamar254baraka@gmail.com>..
 */
public interface ClientManagementApi {

    /*api to create a client*/
    void createClient(ClientDto clientDto);
    /*api to remove a client by the client id*/
    void removeClientByClientId(String clientId);
    /*api to get a client by the client name*/
    ClientModel getClientByClientName(String clientName);
    /*api to get all clients*/
    List<ClientModel> getAllClients();
}
