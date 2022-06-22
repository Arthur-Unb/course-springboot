package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
