package Application.Interfaces.Repositories;

import Domain.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface IUserRepository extends PanacheRepository<User> {
}
