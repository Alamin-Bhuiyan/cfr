package Features.Auth.Login;

import Application.Interfaces.Repositories.IUserRepository;
import Application.Interfaces.Services.IJwtTokenService;
import Application.Interfaces.Services.IPasswordService;
import Domain.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.util.Optional;

@ApplicationScoped
public class LoginHandler {

    @Inject
    IUserRepository userRepository;

    @Inject
    IPasswordService passwordService;

    @Inject
    LoginValidator validator;

    @Inject
    IJwtTokenService jwtTokenService;

    public Response handle(LoginCommand command) {
        if (!validator.validate(command)) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Email and password must be provided").build();
        }

        User user = userRepository.findByEmail(command.email);
        if (user == null) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }

        // Compare decrypted password or use passwordService to verify


        // Generate JWT token
        String token = jwtTokenService.generateJwtToken(user.id);
        // Return token + user info (without password)
        var userResponse = new UserResponse(user.id, user.name, user.email);

        return Response.ok(new LoginResponse(token, userResponse)).build();
    }

    public static class UserResponse {
        public Long id;
        public String name;
        public String email;

        public UserResponse(Long id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }
    }

    public static class LoginResponse {
        public String accessToken;
        public UserResponse user;

        public LoginResponse(String accessToken, UserResponse user) {
            this.accessToken = accessToken;
            this.user = user;
        }
    }
}
