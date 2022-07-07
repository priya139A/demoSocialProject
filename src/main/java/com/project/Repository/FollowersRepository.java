package com.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.Followers;

@Repository

public interface FollowersRepository extends CrudRepository<Followers,Integer> {

}
