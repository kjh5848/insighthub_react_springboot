package com.insighthub.demo.domian.user;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity getUserById(Long id);
    UserEntity getUserByUsername(String username);
    List<UserEntity> getAllUsers();
    UserEntity updateUser(Long id, UserEntity user);
    void deleteUser(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
} 