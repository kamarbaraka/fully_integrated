package org.kamar.authserver.client_management.repositories;

import org.kamar.authserver.client_management.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * The ClientEntityRepository interface is a JpaRepository that is used to perform database operations related to the ClientEntity class.
 *
 * It extends the JpaRepository interface which provides basic CRUD operations (Create, Read, Update, Delete) for the ClientEntity class.
 *
 * The ClientEntityRepository interface has a generic type parameter <ClientEntity, String> where ClientEntity represents the type of the entity being persisted and String represents
 * the type of the primary key of the entity.
 *
 * This interface does not include any additional methods or functionality beyond what is provided by the JpaRepository interface.
 *
 * For more information on how to use this interface, refer to the documentation for the JpaRepository interface.
 *
 * Note: This interface declares no methods since it only extends the JpaRepository interface.
 *
 * @see JpaRepository
 * @see ClientEntity
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
public interface ClientEntityRepository extends JpaRepository<ClientEntity, String > {
}
