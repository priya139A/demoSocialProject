package com.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.entities.Post;

@Repository

public interface PostRepository extends CrudRepository<Post,Integer> {
	@Query(value="select * from Post where id=:UUID",nativeQuery=true)
	public List<Post> getpostsbyid(@Param("UUID") int id);
	

}
