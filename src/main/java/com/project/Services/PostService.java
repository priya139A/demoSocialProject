package com.project.Services;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.Repository.PostRepository;
import com.project.Repository.UserRepository;
import com.project.entities.IdObject;
import com.project.entities.Post;
import com.project.Services.ResponseObjectService;

@Service
public class PostService {

	@Autowired
	PostRepository postrepository;
	@Autowired
	UserRepository userrepository;
	
	public ResponseObjectService findpostbyuuid(IdObject userid) {
		ResponseObjectService resobj=new ResponseObjectService();
		List<Post> userpost = postrepository.getpostsbyid(userid.getId());
		System.out.println("hel");
		if(userpost.isEmpty()) {
			System.out.println("hi");
			resobj.setStatus("fail");
			resobj.setMessage("Cannot find any post from user id: "+userid.getId());
			resobj.setUserdetail(null);
			return resobj;
		}
		else {
			resobj.setStatus("success");
			resobj.setMessage("success");
			resobj.setUserdetail(userpost);
			return resobj;
		}
	}
	
}

