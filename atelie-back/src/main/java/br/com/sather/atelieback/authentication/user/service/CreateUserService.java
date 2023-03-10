package br.com.sather.atelieback.authentication.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.sather.atelieback.authentication.user.entities.User;
import br.com.sather.atelieback.authentication.user.repository.UserRepository;

@Service
public class CreateUserService {

  private BCryptPasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }

  @Autowired
  UserRepository userRepository;

  public User execute(User user) {

    User existsUser = userRepository.findByUsername(user.getUsername());

    if (existsUser != null) {
      throw new Error("User already exists!");
    }
    user.setPassword(passwordEncoder().encode(user.getPassword()));
    User createdUser = userRepository.save(user);

    return createdUser;
  }

}
