package com.coffeutim.www.repository;

import org.springframework.data.repository.CrudRepository;

import com.coffeutim.www.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
	User findByUsername(String nombreUsuario);
}
