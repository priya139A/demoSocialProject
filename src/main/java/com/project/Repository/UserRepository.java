package com.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.Users;

@Repository
public interface UserRepository extends CrudRepository<Users,Integer> {
	

}
