package Infrastructure.Services;

import Application.Interfaces.Services.IJwtTokenService;
import io.smallrye.jwt.build.Jwt;
import jakarta.inject.Singleton;

@Singleton
public class JwtTokenService implements IJwtTokenService {
    public String generateJwtToken(Long userId)
    {
        return Jwt.issuer("http://localhost:8080/api/auth")
                .subject(userId.toString())
                .expiresAt(System.currentTimeMillis() / 1000 + 360000)
                .sign();
    }
}
