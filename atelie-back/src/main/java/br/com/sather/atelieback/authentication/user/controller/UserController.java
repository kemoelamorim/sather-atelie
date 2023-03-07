package br.com.sather.atelieback.authentication.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sather.atelieback.authentication.user.dto.UserRoleDto;
import br.com.sather.atelieback.authentication.user.entities.Role;
import br.com.sather.atelieback.authentication.user.entities.User;
import br.com.sather.atelieback.authentication.user.service.CreateRoleService;
import br.com.sather.atelieback.authentication.user.service.CreateUserService;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired(required=false)
  CreateUserService createUserService;
  
  @Autowired(required=false)
  CreateRoleService createRoleService;

  @PostMapping("/create")
  public User create(@RequestBody User user) {
    return createUserService.execute(user);
  }
  @PostMapping("/role")
  public User role(@RequestBody UserRoleDto userRoleDto){
    return createRoleService.execute(userRoleDto);
  }
  @PostMapping("/roles")
  public Role roles(@RequestBody Role role){
    return createRoleService.executeRole(role);
  }

}