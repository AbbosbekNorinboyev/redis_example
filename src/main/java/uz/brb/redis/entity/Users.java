package uz.brb.redis.entity;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@RedisHash("users")
public class Users {
    private Long id;
    private String fullName;
}
