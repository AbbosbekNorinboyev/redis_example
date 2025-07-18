package uz.brb.redis.service.impl;

import org.springframework.stereotype.Service;
import uz.brb.redis.entity.Users;
import uz.brb.redis.repository.UserRepository;
import uz.brb.redis.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users create(Users user) {
        return userRepository.save(user);
    }

    public Iterable<Users> getAllUser() {
        return userRepository.findAll();
    }
}
