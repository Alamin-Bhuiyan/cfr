package Features.Auth.Register;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public class RegisterValidator {
    public Optional<String> validate(RegisterCommand command) {
        if(command.name == null || command.name.isBlank()) {
            return Optional.of("name is required");
        }
        if(command.email == null || command.email.isBlank()) {
            return Optional.of("name is required");
        }

        if(command.cfHandle == null || command.cfHandle.isBlank()) {
            return Optional.of("name is required");
        }
        return Optional.empty();
    }
}
