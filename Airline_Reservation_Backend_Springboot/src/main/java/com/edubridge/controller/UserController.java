package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.entity.User;
import com.edubridge.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    

    @PostMapping("/register")
    public User saveUSer(@RequestBody User user) {
     return userService.create(user);
    
    }
   
      
    @GetMapping("/getusers")
    public List<User> getusers()
    {
    	 return userService.getAllUsers();
    }
  

    
    @GetMapping("/getuserbyid/{id}")
    public User getuserbyid(@PathVariable Integer id)
    {
    	 return userService.getUserById(id);
    }
    
    
    @DeleteMapping("/deletebyid/{id}")
    public String deleteUser(@PathVariable Integer id)
    {
    	 return userService.deleteUserById(id);
    }
    
    
    @PutMapping("/update/{id}")
	public String updateUser( @PathVariable Integer id)
	{
    	return userService.updateUserById(id);
	}
    
    
    @PostMapping("/logincheck")
	public ResponseEntity<User> loginUser(@Validated @RequestBody User user) {
		System.out.println(user);
		return new ResponseEntity<User>(userService.loginUser(user), HttpStatus.OK);
		
	}
    
    
    @GetMapping("/login/{user}/{pass}")
	public User findbyusername(@PathVariable("user")String username,@PathVariable("pass")String password )
	{
		return userService.findbyusername(username,password);
	}

    
    @GetMapping("/byRole/{role}")
    public ResponseEntity<List<User>> getUsersByRole( @PathVariable String role) {
        List<User> user= userService.getUsersByRole(role);
        return ResponseEntity.ok(user);
    }
    
 }
