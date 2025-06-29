package Application.Users.Application;

import Domain.Models.Users.*;
import Domain.Factories.*;
import Domain.Repositories.*;
import Domain.Services.Users.UserService;

public class UserApplicationService {
    private final IUserFactory userFactory;
    private final IUserRepository userRepository;
    private final UserService userService;

    public UserApplicationService(IUserFactory userFactory, IUserRepository userRepository, UserService userService) {
        this.userFactory = userFactory;
        this.userRepository = userRepository;
        this.userService = userService;
    }

    public void register(UserRegisterCommand command) {
        User user = userFactory.create(command.getName());
        if (!userService.exists(user)) {
            userRepository.save(user);
        }
    }
}
