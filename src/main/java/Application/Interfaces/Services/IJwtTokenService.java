package Application.Interfaces.Services;

public interface IJwtTokenService {
    String generateJwtToken(Long userId);
}
