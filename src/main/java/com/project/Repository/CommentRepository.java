package com.project.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.project.entities.Comments;

@Repository
public interface CommentRepository extends CrudRepository<Comments,Integer>{

}
