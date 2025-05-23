package Infrastructure.Repositories;

import Application.Interfaces.Repositories.IUserRepository;
import Domain.User;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements IUserRepository {
    @Override
    public User findByEmail(String email) {
        var user = findByEmail(email);
        return user;
    }
}
