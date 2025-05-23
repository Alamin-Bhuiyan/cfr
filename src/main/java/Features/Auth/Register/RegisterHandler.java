package Features.Auth.Register;
import Application.Interfaces.Repositories.IUserRepository;
import Application.Interfaces.Services.IPasswordService;
import Domain.User;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

import java.time.LocalDateTime;

@ApplicationScoped
public class RegisterHandler {
    @Inject
    IUserRepository userRepository;
    @Inject
    IPasswordService passwordService;
    public Response handle(RegisterCommand command) {
        String rawPassword = passwordService.generate();
        String encryptedPassword = passwordService.encrypt(rawPassword);

        var user = new User();
        user.name = command.name;
        user.email = command.email;
        user.cfHandle = command.cfHandle;
        user.cfrPassword = encryptedPassword;
        user.status = 1;
        user.createdAt = LocalDateTime.now();
        user.updatedAt = LocalDateTime.now();

        userRepository.persist(user);

        if(userRepository.isPersistent(user))
        {
            return Response.ok(user).build();
        }
        else
        {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
}
