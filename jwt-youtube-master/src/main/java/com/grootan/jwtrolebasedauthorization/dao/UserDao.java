package com.grootan.jwtrolebasedauthorization.dao;

import com.grootan.jwtrolebasedauthorization.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,String> {
    //boolean existsByUsername(String username);
}
