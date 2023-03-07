package br.com.sather.atelieback.authentication.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import br.com.sather.atelieback.authentication.user.entities.User;
import br.com.sather.atelieback.authentication.user.repository.UserRepository;

public class CustomUserDetailsService implements UserDetailsService {
  @Autowired
  UserRepository userRepository;
  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User existsUser = userRepository.findByUsername(username);

    if (existsUser != null) {
      throw new Error("User already exists!");
    }
    return null;
  }
  
}
