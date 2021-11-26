package com.mytests.spring.springdocOpenapiTest0;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                version = "${springdoc.version}",
                title = "${springdoc.info.title}",
                description = "${springdoc.info.description}",
                contact = @Contact(name = "${springdoc.info.contact.name}", url = "${springdoc.info.contact.url}", email = "${springdoc.info.contact.email}"),
                license = @License(name = "${springdoc.info.license.name}", url = "${springdoc.info.license.url}")),
        servers = @Server(url = "${springdoc.servers.url}")
)
@SecurityScheme(name = "test0-api", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class OpenAPIConfiguration {
    
    // class is shown as not used   (submitted)
    // no references for properties (submitted)
    // @SecurityScheme#name - reference to @SecurityRequirement#name
}