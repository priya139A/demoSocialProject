package com.project.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.project.entities.Likes;

@Repository

public interface LikesRepository extends CrudRepository<Likes,Integer> {

}
