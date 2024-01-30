package org.kamar.authserver.client_management.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * The ClientEntity class is a representation of a client application entity. It is an entity class
 * that is mapped to the "client_apps" table in the database. This class is annotated with @Entity
 * to indicate that it is an entity in the JPA (Java Persistence API) context.
 *
 * The client application entity consists of a unique identifier, which is stored in the "clientEntityId"
 * field. This field is annotated with @Id to indicate that it is the primary key of the entity.
 *
 * This class also makes use of the Lombok library's @Data annotation to automatically generate
 * standard methods such as getters, setters, equals, and hashCode.
 *
 * This class is also annotated with @Component to indicate that it is a Spring component and can
 * be managed by the Spring IoC (Inversion of Control) container.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
@Entity(name = "client_apps")
@Data
@Component
public class ClientEntity {

    @Id
    private String clientEntityId;
}
