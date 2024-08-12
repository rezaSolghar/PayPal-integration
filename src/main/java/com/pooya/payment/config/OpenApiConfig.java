package com.pooya.payment.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Pooya",
                        email = "mras.arab@gmail.com"
                ),
                description = "OpenApi Doc for Paypal Integration",
                title = "OpenApi Spec",
                version = "1.0",
                license = @License(
                        name = "Licence Name",
                        url = "some url"
                ),
                termsOfService = "Terms"
        ),
        servers = {
                @Server(
                        description = "Local env",
                        url = "https://localhost:8888"
                ),
                @Server(
                        description = "Prod env",
                        url = "https://localhost:8887"
                ),
        }
)
public class OpenApiConfig {
}
