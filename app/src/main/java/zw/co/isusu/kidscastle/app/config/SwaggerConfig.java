package zw.co.isusu.kidscastle.app.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @OpenAPIDefinition(
            info = @Info(
                    title = "Kids Castle Preschool API Client",version = "1.0.0",
                    description = "Kids Castle PreSchool Management System", contact = @Contact(
                            name = "Isusu Dev Team",
                            url = "isususervices.co.zw",
                            email = "systemsdev@isususervices.co.zw"
            ), license = @License(
                    name = "MIT License",
                    url = "https://isususervices.co.zw/LICENSE")),
            servers = @Server(url = "http:localhost:9005")
    )
    @SecurityScheme(
            name = "bearerAuth",
            type = SecuritySchemeType.HTTP,
            bearerFormat = "JWT",
            scheme = "bearer"
    )
    static class OpenAPIConfiguration {
    }
}
