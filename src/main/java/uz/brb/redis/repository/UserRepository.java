package uz.brb.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import uz.brb.redis.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

}
