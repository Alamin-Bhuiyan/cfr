package Application.Interfaces.Services;

public interface IPasswordService {
    String generate();
    String encrypt(String password);
    String decrypt(String encryptedPassword);

}
