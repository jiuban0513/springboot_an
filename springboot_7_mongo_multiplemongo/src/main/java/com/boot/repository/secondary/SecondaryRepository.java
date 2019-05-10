package com.boot.repository.secondary;

import com.boot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecondaryRepository extends MongoRepository<User,String> {
}
