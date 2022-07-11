package com.authservice.repository;

import com.authservice.documents.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role,Long> {
    Role findByName(String name);
}
