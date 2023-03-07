package br.com.sather.atelieback.authentication.user.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sather.atelieback.authentication.user.entities.User;

public interface UserRepository extends JpaRepository
<User, UUID> {

  public User findByUsername(String username);

}
