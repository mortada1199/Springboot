package com.springproject.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.demo.models.User;
import com.springproject.demo.repos.UserRepository;
import com.springproject.demo.request.UserRequest;
import com.springproject.demo.responce.BasicResponse;

import jakarta.validation.Valid;
import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("/api/users") // <---- dont't forget the requestMapping
public class UserController {

    @Autowired  
    private UserRepository userRepository;
    @RequestMapping(method = RequestMethod.GET,value = "")
    public @ResponseBody ResponseEntity<BasicResponse> getUsers(@PathParam(value="name") String name,@PathParam(value ="pageSize") int pageSize,@PathParam(value ="page") int page) {
        Pageable  pagable = PageRequest.of(page,pageSize);
        Page<User> userList=userRepository.findByNameLike("%"+name+"%",pagable);
        userList.forEach(user-> System.out.println(user.getName())
            
        );
        return new ResponseEntity<>(new BasicResponse("success", "000", userList),HttpStatus.OK);
    }
    @RequestMapping(method = RequestMethod.GET,value = "{name}")
    public @ResponseBody ResponseEntity<BasicResponse> getUsersByName(@PathVariable String name) {
        User user=userRepository.findByName(name);
     
        return new ResponseEntity<>(new BasicResponse("success", "000", user),HttpStatus.OK);
    }


    @PostMapping(name = "/")
    public @ResponseBody ResponseEntity<?> insert(@RequestBody @Valid UserRequest input) {
        User user = new User(0, input.getName(), input.getPassword(),null);
        userRepository.save(user);
        // return ResponseEntity.ok(user);
        return new ResponseEntity<>(new BasicResponse("created successfully","000",user), HttpStatus.OK);
    }
}
