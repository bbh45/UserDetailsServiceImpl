package com.bb.UserDetailsServiceImpl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
    MyUser findByEmail(String email);
}
