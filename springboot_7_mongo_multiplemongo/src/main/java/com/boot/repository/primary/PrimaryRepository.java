package com.boot.repository.primary;

import com.boot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrimaryRepository extends MongoRepository<User,String> {
}
