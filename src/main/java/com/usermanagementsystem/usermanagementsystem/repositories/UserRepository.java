package com.usermanagementsystem.usermanagementsystem.repositories;

import com.usermanagementsystem.usermanagementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {



}
