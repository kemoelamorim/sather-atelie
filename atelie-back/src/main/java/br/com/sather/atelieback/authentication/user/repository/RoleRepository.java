package br.com.sather.atelieback.authentication.user.repository;

import br.com.sather.atelieback.authentication.user.entities.Role;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, UUID> {

  public Role findByName(String rolename);

}