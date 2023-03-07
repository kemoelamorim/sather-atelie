package br.com.sather.atelieback.authentication.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sather.atelieback.authentication.user.dto.UserRoleDto;
import br.com.sather.atelieback.authentication.user.entities.Role;
import br.com.sather.atelieback.authentication.user.entities.User;
import br.com.sather.atelieback.authentication.user.repository.RoleRepository;
import br.com.sather.atelieback.authentication.user.repository.UserRepository;
@Service
public class CreateRoleService {
  @Autowired
  UserRepository userRepository;
  @Autowired
  RoleRepository roleRepository;

  public User execute(UserRoleDto createUserRoleDTO) {

    Optional<User> userExists = userRepository.findById(createUserRoleDTO.getIdUser());
    List<Role> roles = new ArrayList<>();

    if (userExists.isEmpty()) {
      throw new Error("User does not exists!");
    }

    roles = createUserRoleDTO.getIdsRoles().stream().map(role -> {
      return new Role(role);
    }).collect(Collectors.toList());

    User user = userExists.get();

    user.setRoles(roles);

    userRepository.save(user);

    return user;

  }
  public Role executeRole(Role role){
    System.out.println("----------------teste aqui ----------------");

    Role existsRole = roleRepository.findByName(role.getName());

    if (existsRole != null) {
      throw new Error("Role already exists!");
    }
    Role createdRole = roleRepository.save(role);

    return createdRole;
  }
}
