package org.kamar.authserver.api_doc;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.OAuthFlow;
import io.swagger.v3.oas.annotations.security.OAuthFlows;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RestController;

/**
 * This class represents the OpenAPI documentation for the REST API.
 *
 * It contains the necessary annotations to define the API info, tags, servers, and security requirements.
 * The class is annotated with @RestController to indicate that it is a REST controller class.
 * It also provides the necessary details for authentication and authorization using OAuth2.
 *
 * The OpenAPI definition includes the following information:
 * - Info: contains details about the API, such as title, description, terms of service, version, license, and contact information.
 * - Tags: provide a way to categorize and group related APIs together.
 * - Servers: specify the servers that the API is hosted on.
 * - Security: define the security requirements for the API, in this case using OAuth2 with the "oauth2" security scheme.
 *
 * @author samson baraka <kamar254baraka@gmail.com>.
 */
@RestController
@OpenAPIDefinition(
        info = @Info(
                title = "",
                description = "",
                summary = "",
                termsOfService = "",
                version = "",
                license = @License(
                        name = "",
                        url = "",
                        identifier = ""
                ),
                contact = @Contact(
                        name = "samson baraka",
                        email = "kamar254baraka@gmail.com",
                        url = ""
                )
        ),
        tags = {
                @Tag(name = "User Management." , description = "Apis for ``managing`` users of the system." ),
                @Tag(name = "Client Management.", description = "Apis for managing client applications.")
        },
        servers = {},
        security = {
                @SecurityRequirement(name = "oauth2")
        }
)
@SecurityScheme(
        type = SecuritySchemeType.OAUTH2,
        name = "oauth2",
        description = "",
        flows = @OAuthFlows(
                authorizationCode = @OAuthFlow(
                        authorizationUrl = "",
                        tokenUrl = "",
                        refreshUrl = "",
                        scopes = {}
                )
        ),
        openIdConnectUrl = "",
        ref = ""
)
public class OpenApiDoc {
}
