package com.example.easylogin.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.easylogin.model.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
	List<User> findByUserNameAndPassword(String userName, String password);
}
