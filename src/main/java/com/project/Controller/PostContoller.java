package com.project.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entities.Post;
import com.project.entities.IdObject;
import com.project.Services.PostService;
import com.project.Services.ResponseObjectService;


@RestController
public class PostContoller {
	
	@Autowired
	PostService postservice;
	
	@GetMapping("/getposts/{id}")
	@ResponseBody
	public ResponseEntity<ResponseObjectService> getallpost(@PathVariable("id") IdObject id) throws Exception{
		System.out.println("cric");
		return new ResponseEntity<ResponseObjectService>(postservice.findpostbyuuid(id),HttpStatus.OK);
	}
}
	

