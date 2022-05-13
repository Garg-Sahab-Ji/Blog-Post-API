package com.garg.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garg.blog.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
