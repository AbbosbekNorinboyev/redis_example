package uz.brb.redis.service;

import uz.brb.redis.entity.Users;

public interface UserService {
    Users create(Users user);

    Iterable<Users> getAllUser();
}
