package Infrastructure.Services;

import Application.Interfaces.Services.IPasswordService;
import jakarta.enterprise.context.ApplicationScoped;

import java.security.SecureRandom;
@ApplicationScoped
public class PasswordService implements IPasswordService {

    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_+=";
    private static final String ALL_CHARS = UPPER + LOWER + DIGITS + SYMBOLS;

    private static final int DEFAULT_LENGTH = 12;
    private static final SecureRandom random = new SecureRandom();

    @Override
    public String generate() {
        StringBuilder password = new StringBuilder(DEFAULT_LENGTH);

        // Ensure password has at least one of each required character type
        password.append(randomChar(UPPER));
        password.append(randomChar(LOWER));
        password.append(randomChar(DIGITS));
        password.append(randomChar(SYMBOLS));

        // Fill remaining characters randomly
        for (int i = 4; i < DEFAULT_LENGTH; i++) {
            password.append(randomChar(ALL_CHARS));
        }

        // Shuffle for extra randomness
        return shuffleString(password.toString());
    }

    private String randomChar(String chars) {
        return String.valueOf(chars.charAt(random.nextInt(chars.length())));
    }

    private String shuffleString(String input) {
        char[] chars = input.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

    @Override
    public String encrypt(String password) {
        return java.util.Base64.getEncoder().encodeToString(password.getBytes());
    }

    @Override
    public String decrypt(String encryptedPassword) {
        return new String(java.util.Base64.getDecoder().decode(encryptedPassword));
    }

}