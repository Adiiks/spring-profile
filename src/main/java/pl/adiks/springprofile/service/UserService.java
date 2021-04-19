package pl.adiks.springprofile.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.adiks.springprofile.model.User;
import pl.adiks.springprofile.repository.UserRepository;

import java.util.List;

@Service
@Profile(value = {"local", "dev", "prod"})
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
