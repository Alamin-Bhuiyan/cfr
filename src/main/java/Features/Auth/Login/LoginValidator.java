package Features.Auth.Login;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class LoginValidator {
    public boolean validate(LoginCommand command) {
        if (command == null) return false;
        if (command.email == null || command.email.isBlank()) return false;
        if (command.password == null || command.password.isBlank()) return false;
        return true;
    }
}