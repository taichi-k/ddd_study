package Domain.Services.Users;

import Domain.Models.Users.*;
import Domain.Repositories.Users.IUserRepository;

public class UserService {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Boolean exists(User user) {
        User foundUser = userRepository.find(user.getName());
        return foundUser != null;
    }
}
